package tugas2;

import java.util.Scanner;

public class Tugas2{
    
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        float panjang = 2;
        float lebar = 5;
        float luas = panjang * lebar;
        System.out.println("Program - 1");
        System.out.println("Luas : " + luas);
        
        double jari;
        System.out.println("Program -2 ");
        System.out.println("Masukan jari : ");
        jari = input.nextDouble();
        double PI = 3.14;
        double luas1 = PI * (jari*2);
        double keliling = 2 * PI * jari;
        System.out.println("Luas : " + luas1 + "Keliling : " + keliling);
        
        int jam,menit,detik,totdet;
        System.out.print("Program - 3");
        System.out.print("Masukan jam : ");
        jam = input.nextInt();
        System.out.print("Masukan menit : " );
        menit = input.nextInt();
        System.out.print("Masukan detik : "  );
        detik = input.nextInt();
        
        totdet = ( jam * 3600 ) + ( menit * 60 ) + detik;
        
        System.out.println("Totdet : " + totdet);
              
    }
}