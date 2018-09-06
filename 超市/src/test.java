import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("======欢迎来到吃人超市=====");
        Fun fun=new Fun();
        User user=new User();
        Goods good=new Goods();
        Sgoods sgood=new Sgoods();
        boolean da;
        do {
            Scanner input =new Scanner(System.in);
            da=false;
            fun.one();
            try {
                int one = input.nextInt();
                if (one == 1) {
                    boolean flag;
                    flag = user.Login();
                    while (flag){
                        flag = false;
                        fun.two();
                        try {
                            input =new Scanner(System.in);
                            int a = input.nextInt();
                            String name = user.getUsername();
                            if (a == 1) {
                                user.addS(name, good.goods());
                                flag = fun.fan();
                            } else if (a == 2) {
                                int fen = sgood.goods();
                                if (user.user.get(name).getSorce() >= fen) {
                                    user.change(name, fen);
                                    System.out.println("恭喜您兑换成功");
                                    System.out.println("剩余积分为：" + user.user.get(name).getSorce());
                                    flag = fun.fan();
                                } else {
                                    System.out.println("对不起，您的积分不足！");
                                    flag = fun.fan();
                                }
                            } else if (a == 3) {
                                System.out.println("账户：" + user.getUsername());
                                System.out.println("积分：" + user.user.get(name).getSorce());
                                flag = fun.fan();
                            } else if (a == 4) {
                                boolean flag1 = true;
                                while (flag1) {
                                    System.out.print("请输入新密码：");
                                    String password = input.next();
                                    System.out.print("请确认新密码：");
                                    String password_true = input.next();
                                    if (!password.equals(password_true)) {
                                        System.out.println("两次密码不一致，请重新输入");
                                    } else {
                                        user.change_pass(user.getUsername(), password);
                                        System.out.println("账户：" + user.getUsername());
                                        System.out.println("密码：" + user.user.get(name).getPassword());
                                        flag1 = false;
                                    }
                                }
                                flag = fun.fan();
                            } else if (a == 5) {
                                boolean v=false;
                                do {
                                    System.out.println("选择您要成为的会员类型");
                                    System.out.println("1.黄金会员\t2.钻石会员\t3.返回上一级");
                                    try {
                                        int vip = input.nextInt();
                                        switch (vip){
                                            case 1:
                                                System.out.println("恭喜您成为黄金会员");
                                                user.change_type(name, "黄金会员");
                                                break;
                                            case 2:
                                                System.out.println("恭喜您成为钻石会员");
                                                user.change_type(name, "钻石会员");
                                                break;
                                            case 3:
                                                break;
                                        }
                                        
                                    }catch (Exception ex){
                                        System.out.println("输入有误！请重新输入！");
                                        v=true;
                                    }
                                    flag = fun.fan();
                                }while (v);
                            } else if (a == 6) {
                                break;
                            } else if (a == 0) {
                                da = false;
                            }else {
                                System.out.println("请输入正确的选项！！！！");
                                flag = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("请输入正确的选项！！！！");
                            flag = true;
                        }
                    }
                    } else if (one == 2) {
                        user.register();
                        da = false;
                    } else if (one == 3) {
                        break;
                    }else {
                    System.out.println("请输入正确的选项！！！！");
                    da=false;
                }
            }catch (InputMismatchException ex){
                System.out.println("请输入正确的选项！！！！");
                da=false;
            }
        }while (!da);
        System.err.println("感谢您的使用！");
    }
}
