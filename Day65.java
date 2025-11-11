import java.util.Scanner;
public class Day65 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input sebuah bilangan: ");
        int bilangan = input.nextInt();
        
        int hasil = 1;
        
        System.out.println("\nFaktorial dari " + bilangan + " adalah:");
        for (int i=bilangan; i>=1; i--){
            if (i>1){
                System.out.print(i + " X ");
            }else{
                System.out.print(i);
            }
            hasil *= i;
        }
        
        System.out.println(" = " + hasil);
    }
    
}
