import java.util.Scanner;
public class Day56 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String jawaban;
        do {
            System.out.print("Halo! ingin mengulang kalimat ini? ");
            jawaban = input.nextLine();
        } while (jawaban.equalsIgnoreCase("Ya"));
        
        System.out.println("Program Selesai");
        input.close();
    }
    
}
