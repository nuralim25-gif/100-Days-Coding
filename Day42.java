import java.util.Scanner;
public class Day42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Program Kelipatan 3, 5, 3 dan 5");
        
        System.out.print("Batas Akhir: ");
        int akhir = input.nextInt();
        
        int a = 3;
        int b = 5;
        boolean giliran3 = true;
        
        System.out.println("\n--- Hasil Selang-Seling ---");
        
        while (a<=akhir || b<=akhir) {
            if (giliran3 && a<=akhir){
                System.out.println(a);
                a+=3;
            }else if (!giliran3 && b<=akhir) {
                System.out.println(b);
                b+=5;
            }
            giliran3 = !giliran3;
        }
    }
    
}
