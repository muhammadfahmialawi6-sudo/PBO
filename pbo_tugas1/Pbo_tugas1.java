package pbo_tugas1;

import java.util.Scanner;

public class Pbo_tugas1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int tahun;
        System.out.print("Masukan tahun ( 1909 - 2024 ) :");
        tahun = input.nextInt();
        
        if(tahun % 4 == 0){
            System.out.print(tahun + "Adalah tahun kabisat");
        }else{
            System.out.print(tahun + "Bukan tahun kabisat");
        }
    }
}