import java.util.Scanner;
public class Day35 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan nama Anda: ");
        String nama = in.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        String nim = in.nextLine();
        
        //Merapikan tampilan
        String fixname = "Nur Alim";
        String fixnim = "D0225014";
        
        if (nama.equalsIgnoreCase("Nur Alim") && nim.equalsIgnoreCase("D0225014")){
            System.out.println("\nSelamat Datang " + fixname + ", NIM Anda adalah " + fixnim);
        }else {
            System.out.println("\nTIDAK DIKENALI!!!");
        }
    }
    
}
