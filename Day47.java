import java.util.Scanner;
public class Day47 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Menentukan Hari");
        System.out.print("Hari ke: ");
        int hari = input.nextInt();
        
        switch (hari) {
            case 1:
            System.out.println("\nHari Ahad");
            break;
            
            case 2:
            System.out.println("\nHari Senin");
            break;
            
            case 3:
            System.out.println("\nHari Selasa");
            break;
            
            case 4:
            System.out.println("\nHari Rabu");
            break;
            
            case 5:
            System.out.println("\nHari Kamis");
            break;
            
            case 6:
            System.out.println("\nHari Jumat");
            break;
            
            case 7:
            System.out.println("\nHari Sabtu");
            break;
            
            default:
            System.out.println("\nHanya ada hari 1-7");
        }
    }
    
}
