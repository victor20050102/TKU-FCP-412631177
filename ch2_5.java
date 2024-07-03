//ch2_5,語意錯誤的程式
public class ch2_5 {
    public static void main(String[] args) {
        int a=2;   //宣告整數變數a,並設值為2
        int b=3;   //宣告整數變數b,並設值為3
        int c=a+b;
        System.out.println("a+b="+c);
    }
}



//錯誤
public class ch2_5 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        
        System.out.println("a+b="+a+b);
    }
}
