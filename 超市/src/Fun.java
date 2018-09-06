import java.util.Scanner;

public class Fun {
    Scanner input = new Scanner(System.in);
    private static int sum;

    public void one() {
        System.out.println("1.登陆");
        System.out.println("2.注册");
        System.out.println("3.退出");
        System.out.print("请选择：");
    }

    public boolean fan(){
        Scanner input =new Scanner(System.in);
        try {
            System.out.print("按任意键返回：");
            int a=input.nextInt();
            return true; 
        } catch (Exception ex) {
            return true; 
        }
    }
    public void two(){
        System.out.println("1.购买商品");
        System.out.println("2.积分兑换");
        System.out.println("3.查询剩余积分");
        System.out.println("4.修改密码");
        System.out.println("5.开卡");
        System.out.println("6.退出");
        System.out.println("0.退出账户");
        System.out.print("请选择：");
    }
}
