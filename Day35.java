import java.util.Scanner;
public class Day35 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Input nilai Anda: ");
        double nilai = in.nextInt();
        
        if (nilai >= 70){
            System.out.println("\nSELAMAT ANDA LULUS");
        }
    }
    
}
