import java.util.Scanner;
public class Day58 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nilai N: ");
        int n = input.nextInt();
        
        System.out.printf("%nNilai 1-N(%d):%n", n);
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        }
        
        System.out.printf("%n%nNilai N(%d)-1:%n", n);
        for (int i = n; i>=1; i--){
            System.out.println(i);
        }
    }
    
}
