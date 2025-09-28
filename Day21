import java.util.Scanner;
public class Day21 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();
        
        System.out.println("\nNilai awal: \na = " + a + "\nb = " + b);
        while (true){
            System.out.print("\nIngin menukar nilai? (Y/N) ");
            char jawaban = input.next().charAt(0);
            
            if (jawaban == 'Y' || jawaban == 'y'){
                
                //Proses pertukaran nilai dua varabel
                a = a^b;
                b = a^b;
                a = a^b;
                
                System.out.println("\nNilai setelah ditukar:\na = " + a + "\nb = " + b);
                break;
            } else if (jawaban == 'N' || jawaban == 'n'){
                System.out.println("\nNilai tidak ditukar");
                break;
            } else {
                System.out.println("Jawaban tidak valid! Mohon masukkan Y/N");
            }
        }
        
        System.out.println("\nTerima kasih telah menggunakan program ini");
        
        input.close();
    }
    
}
