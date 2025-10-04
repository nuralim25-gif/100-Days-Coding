import java.util.Scanner;
public class Day27Evaluation{
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
 //Soal 1       
        //Input
        System.out.print("");
        int panjang = in.nextInt();
        System.out.print("");
        int lebar = in.nextInt();
        //Operasi
        int luas = panjang*lebar;
        int jumlahkeramik = luas/4;
        //Output
        System.out.printf("%n%d%n", jumlahkeramik);
        
 //Soal 2
        //Input
        System.out.print("\n");
        int a = in.nextInt();
        System.out.print("");
        int b = in.nextInt();
        //Menukar nilai variabel
        a = a^b;
        b = a^b;
        a = a^b;
        //Output
        System.out.printf("%n%d%n%d", a, b);
        
    }
    
}
