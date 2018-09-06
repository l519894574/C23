import java.util.Scanner;

public class Sgoods {
    Scanner input =new Scanner(System.in);
    private String[] good={"吃人2009", "吃人2018"};
    private int[] fen = {100, 200};
    public int goods() {
        System.out.println("序号\t商品\t\t积分");
        for (int i = 0; i < good.length; i++) {
            System.out.println((i + 1) + "\t" + good[i] + "\t" + fen[i]);
        }
        System.out.print("请选择商品序号：");
        int choose = input.nextInt();
        return fen[choose-1];
    }
}
