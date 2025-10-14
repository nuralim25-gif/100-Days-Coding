import java.util.Scanner;
public class Day37 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        
        //Menentukan bilangan ganjil/genap
        if (angka % 2 == 1){
            System.out.println("\n" + angka + " adalah bilangan ganjil");
        }else{
            System.out.println("\n" + angka + " adalah bilangan genap");
        }
    }
    
}
