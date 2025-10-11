import java.util.Scanner;
public class Day34 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Mengkombinasikan Beberapa Operator");
        
        //Input data
        System.out.print("Masukkan nilai pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai kedua  : ");
        int b = in.nextInt();
        
        //Kombinasi Operator
        int total = 0;
        total += (a+b);   //Penugasan dan Aritmatika
        if ((a != b) && (total > 0)){   //Perbandingan dan Logika
            total ++;   //Increment
        }else{
            total --;   //Decrement
        }
        
        //Menampilkan hasil
        System.out.printf("%nHasil Akhir: %d", total);
    }
    
}
