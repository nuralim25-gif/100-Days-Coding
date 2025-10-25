import java.util.Scanner;
public class Day48 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double angka1, angka2;
        char operator;
        double hasil = 0;
        
        //Inputan
        System.out.print("Angka pertama         : ");
        angka1 = input.nextDouble();
        System.out.print("Operator (+, -, *, /) : ");
        operator = input.next().charAt(0);
        System.out.print("Angka kedua           : ");
        angka2 = input.nextDouble();
        
        //Pecabangan switch-case
        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            break;
            
            case '-':
            hasil = angka1 - angka2;
            break;
            
            case '*':
            hasil = angka1 * angka2;
            break;
            
            case '/':
            if (angka2 == 0) {
                System.out.println("\nPembagian dengan angka nol tidak bisa!");
                return;
            }
            hasil = angka1 / angka2;
            break;
            
            default:
            System.out.println("\nOperator tidak dikenali!!!");
            return;
        }
        
        System.out.printf("%n%.2f %c %.2f = %.2f", angka1, operator, angka2, hasil);
        
        input.close();
    }
    
}
