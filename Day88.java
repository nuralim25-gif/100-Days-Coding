import java.util.Scanner;
public class Day88 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah indeks : ");
        int jIndeks = sc.nextInt();
        sc.nextLine();
        
        String[] buah = new String [jIndeks];
        
        System.out.printf("%nInput %d nama buah :%n", buah.length);
        for (int i = 0; i < buah.length; i++) {
            System.out.printf("Input buah ke-%d : ", (i+1));
            buah[i] = sc.nextLine();
        }
        
        int nomor = 1;
        
        System.out.println("\nBerikut elemen-elemen yang telah diinput :");
        for (String tampil : buah) {
            System.out.println(nomor + ". " + tampil);
            nomor++;
        }
    }
    
}
