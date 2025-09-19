import java.util.Scanner;

public class day12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);    
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        
        input.nextLine(); //Membersihkan buffer (sisa inputan sebelumnya)
        
        System.out.print("Masukkan Prodi Anda: ");
        String prodi = input.nextLine();
        
        System.out.print("Masukkan Fakultas Anda: ");
        String fakultas = input.nextLine();
        
        System.out.print("Masukkan Universitas Anda; ");   
        String universitas = input.nextLine();
        
        //Menampikan output
        System.out.println("\n~|Biodata Anda|~");
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur + "Tahun");
        System.out.println("Program Studi: " + prodi);
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Universitas  : " + universitas);  
        
        input.close();
    }
    
}
