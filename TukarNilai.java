import java.util.Scanner;

public class TukarNilai {

    public static void main(String args[]){
        int c, d, e;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        c = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        d = input.nextInt();
        System.out.println("================================");
        System.out.println("Angka pertama adalah "+c);
        System.out.println("Angka kedua adalah "+d);
        System.out.println("================================");
        System.out.println("Angka setelah ditukar");
        System.out.println("================================");
        e = c;
        c = d;
        d = e;
        System.out.println("Angka pertama adalah "+c);
        System.out.println("Angka kedua adalah "+d);
   }

}