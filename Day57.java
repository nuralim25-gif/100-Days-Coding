import java.util.Scanner;
public class Day57 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input batas akhir: ");
        int a = input.nextInt();
        
        System.out.println("Menampilkan angka sebanyak barisnya:");
        for (int i = 1; i <= a; i++) {
            System.out.print(i + ". ");
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
    
}
