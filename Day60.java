import java.util.Scanner;
public class Day60 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nilai N: ");
        int n = input.nextInt();
        
        String ganjil = "";
        String genap = "";
        
        for (int i = n; i>=1; i--){
            if (i%2==1){
                ganjil += i + " ";
            } else {
                genap += i + " ";
            }
        }
        
        //Menampilkan angka ganjil dari 1-N
        System.out.printf("%nAngka ganjil dari N(%d)-1: %n%s", n, ganjil);
        //Menampilkan angka genap dari 1-N
        System.out.printf("%n%nAngka genap dari N(%d)-1: %n%s", n, genap);
    }
    
}
