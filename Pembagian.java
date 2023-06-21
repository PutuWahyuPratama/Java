import java.util.Scanner;

public class Pembagian{

    public static void main(String args[]){
        int x, y, z;
        double a;
        Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Program Pembagian Sederhana");
        System.out.println("=============================");
        System.out.print("Masukkan angka pertama = ");
        x = input.nextInt();
        System.out.print("Masukkan angka kedua = ");
        y = input.nextInt();
        System.out.println();
        //proses integer
        z = x/y;
        // proses double
        double b = x;
        double c = y;
        a = b/c;
        // ==================
        if(a > z){
            System.out.println("Hasil "+x+" : "+y+" = "+a);
        } else {
            System.out.println("Hasil "+x+" : "+y+" = "+z);
        }
    }

}