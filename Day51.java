import java.util.Scanner;
public class Day51 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Inputan
        System.out.print("Batas awal : ");
        int awal = input.nextInt();
        System.out.print("Batas akhir: ");
        int akhir = input.nextInt();
        
        //Perulangan for
        for (int ulang = awal; ulang<=akhir; ulang++) {
            if (ulang % 2 == 1) {
                System.out.printf("%n%d adalah angka ganjil", ulang);
            } else {
                System.out.printf("%n%d adalah angka genap", ulang);
            }
        }
    }
    
}
