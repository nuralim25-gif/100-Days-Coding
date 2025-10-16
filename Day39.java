import java.util.Scanner;
public class Day39 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String mahasiswa = "1) Nur Alim\n2) Abdul Khalid\n3) Serli Amelan";
        String dosen = "1) Nuralamsah Zulkarnaim, S.Kom., M.Kom.\n2) Nurhikma Arifin, S.Kom., MT.\n3) Nurani Natsir, S.Si., M.Si.";
        String matkul = "1) Dasar-dasar Pemrograman\n2) Arsitektur dan Organisasi Komputer\n3) Matematika Dasar";
        
        System.out.println("||Pilihan Menu||\n1) Daftar Mahasiswa\n2) Daftar Dosen\n3) Mata Kuliah\n");
        
        //Inputan
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();
        
        //Pilihan User
        if (pilihan == 1){
            System.out.println("\n==Daftar Mahasiswa==\n" + mahasiswa);
        }else if (pilihan == 2){
            System.out.println("\n==Daftar Dosen==\n" + dosen);
        }else {
            System.out.println("\n==Mata Kuliah\n" + matkul);
        }
    }
    
}
