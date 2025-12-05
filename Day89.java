import java.util.Scanner;
public class Day89 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        sapaNama(sc);
        
    }
    
    public static void sapaNama(Scanner sc) {
        System.out.print("Input nama Anda : ");
        String nama = sc.nextLine();
        
        System.out.println("Halo " + nama + "!");
        
    }
    
}
