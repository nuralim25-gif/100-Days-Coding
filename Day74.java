import java.util.Scanner;
public class Day74 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan;
        
        do {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Kelompok I");
            System.out.println("2. Kelompok II");
            System.out.println("3. Kelompok III");
            System.out.println("4. Kelompok IV");
            System.out.println("5. Kelompok V");
            System.out.print("\nInput menu (input 0 untuk keluar): ");
            pilihan = input.nextInt();
            
            switch (pilihan){
                case 1:
                System.out.println("\nKELOMPOK I\n•Andi\n•Siti\n•Rian\n•Putri\n•Dika\n");
                break;
                case 2:
                System.out.println("\nKELOMPOK II\n•Budi\n•Dina\n•Fajar\n•Mira\n•Tono\n");
                break;
                case 3:
                System.out.println("\nKELOMPOK III\n•Farhan\n•Lala\n•Adit\n•Nia\n•Rizky\n");
                break;
                case 4:
                System.out.println("\nKELOMPOK IV\n•Ayu\n•Bagas\n•Wulan\n•Reza\n•Joko\n");
                break;
                case 5:
                System.out.println("\nKELOMPOK V\n•Kevin\n•Rika\n•Aldi\n•Rosi\n•Gilang\n");
                break;
                case 0:
                System.out.println("Keluar dari program\n");
                break;
                default:
                System.out.println("Pilihan tidak valid!\n");
            }
        }while(pilihan!=0);
    }
    
}
