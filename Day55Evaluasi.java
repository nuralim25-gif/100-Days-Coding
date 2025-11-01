//Soal nomor 1
import java.util.Scanner;
public class Day55Evaluasi {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Batas Bawah : ");
        int bawah = in.nextInt();
        System.out.print("Batas Atas : ");
        int atas = in.nextInt();
        System.out.print("Angka : ");
        int angka = in.nextInt();
        
        if (angka>=bawah && angka<=atas){
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
    
}

//Soal nomor 2
import java.util.Scanner;
public class Soal2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Nilai: ");
        int nilai = in.nextInt();
        
        if (nilai>70) {
            System.out.println("Ujian Kroco Ji Pale");
        } else {
            System.out.println("Sa Jappo'ka Aih");
        }
    }
    
}

//Soal nomor 3
import java.util.Scanner;
public class Soal3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Angka: ");
        int angka = in.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Iyaji");
        } else {
            System.out.println("Tidakji");
        }
    }
    
}
