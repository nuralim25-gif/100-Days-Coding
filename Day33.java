import java.util.Scanner;
public class Day33 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan nama: ");
        String user = in.nextLine();
        
        //Penggunaan operator logika not (!)
        boolean jawaban = !user.equalsIgnoreCase("Nur Alim");
        String perbaikan = "Nur Alim";
        
        if (jawaban){
            System.out.printf("%nMaaf, Anda tidak memiliki akses ke halaman berikutnya!");
        }else{
            System.out.printf("%nSelamat datang %s", perbaikan);
        }
    }
    
}
