import java.util.Scanner;
public class Day67 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input sebuah karakter      : ");
        char karakter = input.next().charAt(0);
        System.out.print("Input jumlah karakter pola : ");
        int jumlah = input.nextInt();
        
        System.out.printf("%n%nBerikut pola horizontal dari %c dengan jumlah karakter %d:%n%n", karakter, jumlah);
        for (int i = 1; i<=jumlah; i++){
            System.out.print(karakter);
        }
    }
    
}
