import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入長方形的長");
        int n1=scn.nextInt();
        System.out.print("輸入長方形的寬");
        int n2=scn.nextInt();
        int a=n1*n2;
        System.out.println(a);
        scn.close();
    }
    
}
