import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入商品價格");
        int n1=scn.nextInt();
        System.out.print("輸入商品價格");
        int n2=scn.nextInt();
        System.out.print("輸入商品價格");
        int n3=scn.nextInt();
        int a=n1+n2+n3;
        System.out.println(a);
        scn.close();
    }
}