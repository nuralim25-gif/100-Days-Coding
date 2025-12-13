import java.util.Scanner;
public class Day98 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input angka N: ");
        int N = sc.nextInt();
        
        System.out.printf("%nBerikut deretan angka fibonacci dari 1-%d:%n", N);
        fibonacci(N);
        
    }
    
    public static void fibonacci (int N) {
        int a, b;
        a = 1; b = 1;
        
        while (a <= N) {
            System.out.print(a + " ");
            
            int c = a + b;
            a = b;
            b = c;
        }
    }
    
}
