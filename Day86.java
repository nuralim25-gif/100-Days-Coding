import java.util.Scanner;
public class Day86 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah Elemen : ");
        int E = sc.nextInt();
        sc.nextLine();
        
        int[] bilangan = new int [E];
        
        System.out.println("\nInput bilangan untuk setiap elemen : ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.printf("Bilangan ke-%d : ", (i+1));
            bilangan[i] = sc.nextInt();
        }
        
        int min = bilangan[0];
        
        for (int i = 0; i < bilangan.length; i++) {
            if (min > bilangan[i]) {
                min = bilangan[i];
            }
        }
        
        System.out.println("\nAngka minimal : " + min);
        
    }
    
}
