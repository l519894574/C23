import java.util.*;

public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    Map<String,Cons>user=new HashMap<>();
    Cons con=new Cons();
    Scanner input =new Scanner(System.in);
    public User(){
        con.setPassword("123456");
        con.setSorce(500);
        con.setType("黄金会员");
        user.put("admin",con);
    }
    public void register(){
        Cons con=new Cons();
        System.out.print("请输入账户：");
        String username=input.next();
        System.out.print("请输入密码：");
        String password=input.next();
        if (user.containsKey(username)){
            System.out.println("用户名已存在，请重新注册！");
            return;
        }
        System.out.println("注册成功！");
        con.setType("普通会员");
        con.setPassword(password);
        con.setSorce(0);
        user.put(username,con);
    }
    public boolean Login(){
            try {
                System.out.print("请输入账户：");
                String username = input.next();
                System.out.print("请输入密码：");
                String password = input.next();
                if (user.get(username).getPassword().equals(password)) {
                    System.out.println("登陆成功！");
                    System.out.println("账户：" + username);
                    this.username = username;
                    System.out.println("类型：" + user.get(username).getType());
                    return true;
                } else {
                    System.out.println("账户或密码错误！");
                    return false;
                }
            } catch (Exception ex) {
                System.out.println("账户名不存在");
                return false;
            }
    }
    public void addS(String username,int sum){
        user.get(username).setSorce(user.get(username).getSorce()+sum);
    }
    public void change(String username,int sum){
        user.get(username).setSorce(user.get(username).getSorce()-sum);
        
    }
    public void change_pass(String username,String pass){
        user.get(username).setPassword(pass);
        
    }
    public void change_type(String username,String type){
        user.get(username).setType(type);
    }
}
