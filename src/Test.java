public class Test {

    public static void main(String[] args) {
       int a=20;
       int b=15;
       while (b!=0){
           int temp =b;
           b=a%b;
           a=temp;
       }
        System.out.println(a);
    }
}
