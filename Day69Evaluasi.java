//Soal 1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evalakhir;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Berat per karung: ");
        int b = in.nextInt();
        System.out.print("Jumlah karung: ");
        int j = in.nextInt(); 
        
        System.out.println("Total berat: "+(b*j));
    }
    
}

//Soal 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evalakhir;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan suhu ruangan: ");
        int s = in.nextInt();
        
        if (s<20){
            System.out.println("Dingin");
        }else if (s>=20 && s<=30){
            System.out.println("Normal");
        }else {
            System.out.println("Panas");
        }
        
    }
    
}

//Soal 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        
        if (a%2==0){
            System.out.println("Gerbang terbuka! (Genap)");
        }else{
            System.out.println("Gerbang tetap tertutup. (Ganjil)");
        }
    }
}

//Soal 4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evalakhir;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        
        if (a>0){
            System.out.println("Positif");
        }else if (a<0){
            System.out.println("Negatif");
        }else{
            System.out.println("Nol");
        }
    }
}

//Soal 5
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evalakhir;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class SoalB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int bom = 55;
        int a = 0;
        int b = 100;
        
        while (true){
        
           System.out.printf("Masukkan (%d-%d): ", a, b);
           int j = in.nextInt();
           
           if (j>a&&j<bom){
               a=j;
           }else if(j<b&&j>bom){
               b=j;             
           }else if (j == bom){
               System.out.println("Bom");
               break;
           }
        
            
        
        }
    }
    }
