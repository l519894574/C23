import java.util.Scanner;

public class Goods {
    Scanner input =new Scanner(System.in);
    private String[] good={"被子", "杯子"};
    private int[] fen = {10, 20};
    public int goods() {
        System.out.println("序号\t商品\t积分");
        for (int i = 0; i < good.length; i++) {
            System.out.println((i + 1) + "\t" + good[i] + "\t" + fen[i]);
        }
        System.out.print("请选择商品序号：");
        int choose = input.nextInt();
        System.out.print("选择购买商品的个数：");
        int num = input.nextInt();
        int sum = fen[choose - 1] * num;
        System.out.println("购买成功，获得积分：" + sum);
        return sum;
    }
}
