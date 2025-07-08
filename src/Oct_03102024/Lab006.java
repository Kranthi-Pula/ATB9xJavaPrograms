package Oct_03102024;

public class Lab006 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=34;
        int result = (a>=b && a>=c) ? a : (b>=c ? b : c);
        System.out.println("Largest num is >> " + result);
    }
}
