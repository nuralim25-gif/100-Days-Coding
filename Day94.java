import java.util.Scanner;
public class Day94 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input nama : ");
        String nama = sc.nextLine();
        
        sapaUser(nama);
        
    }
    
    public static void sapaUser (String n) {
        System.out.println("Halo " + n + "! Selamat datang di program kami");
    }
    
}
