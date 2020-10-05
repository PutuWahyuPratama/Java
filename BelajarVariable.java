public class BelajarVariable {

    public static int a = 1;
    public static int b = 2;

    public static void main(String[] args) {
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}