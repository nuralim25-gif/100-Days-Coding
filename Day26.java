import java.util.Scanner;
public class Day26 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Meminta inputan dari user
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        //Menampilkan hasil operator penugasan +=
        System.out.printf("%nHasil operator +=5: %d", (angka+=5));
        
        //Menampilkan hasil operator penugasan -=
        System.out.printf("%nHasil operator -=2: %d", (angka-=2));
        
        //Menampilkan hasil operator penugasan *=
        System.out.printf("%nHasil operator *=3: %d", (angka*=3));
        
        //Menampilkan hasil operator penugasan /=
        System.out.printf("%nHasil operator /=2: %d", (angka/=2));
        
        //Menampilkan hasil operator penugasan %=
        System.out.printf("%nHasil operator %%=2: %d", (angka%=2));
        
    }
    
}
