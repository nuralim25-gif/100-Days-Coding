import java.util.Scanner;
public class day17 {
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);      
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = masukan.nextInt();
        
        if (angka % 2 == 0){
            System.out.println(angka + " adalah bilangan genap");
        }else{
            System.out.println(angka + " adalah bilangan ganjil");
        }
        
        masukan.close();
    }
    
}
