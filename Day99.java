import java.util.Scanner;
public class Day99 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input bilangan N: ");
        int n = sc.nextInt();
        
        System.out.printf("%nBerikut bilangan prima dari 1-%d:%n", n);
        bilanganPrima(n);
        
    }
    
    public static void bilanganPrima(double n) {
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
    
}
