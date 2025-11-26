import java.util.Scanner;
public class Day80 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String[] buah = new String[5];
        
        System.out.println("Input 5 nama buah: ");
        for (int i = 0; i<buah.length; i++){
            System.out.print("Buah ke-" + (i+1) + " : ");
            buah[i] = sc.nextLine();
        }
        System.out.println("\n=== Rincian ===");
        for (int j = 0; j<buah.length; j++){
            System.out.println((j+1) + ". " + buah[j]);
        }
    }
    
}
