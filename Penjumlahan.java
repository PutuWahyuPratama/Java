import java.util.Scanner;

public class Penjumlahan{

    public static void main(String args[]){
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Program Penjumlahan Sederhana");
        System.out.println("=============================");
        System.out.print("Masukkan angka pertama = ");
        x = input.nextInt();
        System.out.print("Masukkan angka kedua = ");
        y = input.nextInt();
        System.out.println();
        z = x+y;
        System.out.println("Hasil "+x+" + "+y+" = "+z);
    }

}