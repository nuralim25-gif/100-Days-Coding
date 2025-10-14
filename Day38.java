import java.util.Scanner;
public class Day38 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        
        //Menentukan jenis bilangan
        if (angka > 0){
            System.out.println("\n" + angka + " adalah bilangan positif");
        }else if (angka < 0){
            System.out.println("\n" + angka + " adalah bilangan negatif");
        }else {
            System.out.println("\n" + angka + " adalah angka nol");
        }
    }
    
}
