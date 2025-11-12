import java.util.Scanner;
public class Day66 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine();
        
        System.out.println("\nBerikut pola vertikalnya:");
        for (int i = 0; i<kata.length(); i++){
            System.out.println(kata.charAt(i));
        }
    }
    
}
