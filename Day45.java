import java.util.Scanner;
public class Day45 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        //Percabangan switch-case
        switch (nim) {
            case "D0225011":
            System.out.println("\nSelamat Datang Abrar");
            break;
            case "D0225012":
            System.out.println("\nSelamat Datang Abdul Khalid");
            break;
            case "D0225014":
            System.out.println("\nSelamat Datang Nur Alim");
            break;
            case "D0225015":
            System.out.println("\nSelamat Datang Iqra");
            break;
            case "D0225016":
            System.out.println("\nSelamat Datang Rusmiati");
            break;
            case "D0225017":
            System.out.println("\nSelamat Datang Serli Amelan");
            break;
            default:
            System.out.println("\nNIM tidak dikenali!!!");
        }
    }
    
}
