import java.util.Scanner;
public class Day61 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nilai N: ");
        int n = input.nextInt();
        System.out.print("Input nilai M: ");
        int m = input.nextInt();
        
        String kelipatan = "";
        
        for (int i = 1; i<=n; i++) {
            if (i%m==0) {
                kelipatan += i + " ";
            }
        }
        
        System.out.printf("%nKelipatan M(%d) dari 1-N(%d): %n%s", m, n, kelipatan);
    }
    
}
