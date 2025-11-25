import java.util.Scanner;
public class Day79 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String uname, pw, fixpw, username, password;
        
        System.out.println("=== MEMBUAT AKUN ===");
        System.out.print("Buat username : ");
        uname = sc.nextLine();
        System.out.print("Buat password : ");
        pw = sc.nextLine();
        while(true){
            System.out.print("Ulangi password : ");
            fixpw = sc.nextLine();
            if (fixpw.equals(pw)){
                System.out.println("Akun berhasil dibuat!");
                break;
            } else {
                System.out.println("Password salah");
            }
        }
        
        System.out.println("\n=== LOGIN KE AKUN ===");
        System.out.print("Masukkan username : ");
        username = sc.nextLine();
        System.out.print("Masukkan password : ");
        password = sc.nextLine();
        
        if (username.equals(uname) && password.equals(pw)){
            System.out.println("Berhasil login!");
        } else {
            while(true){
                System.out.println("\nUsername atau password salah! Mohon masukkan ulang username dan password Anda.");
                System.out.print("Masukkan username : ");
                username = sc.nextLine();
                System.out.print("Masukkan password : ");
                password = sc.nextLine();
                
                if (username.equals(uname) && password.equals(pw)){
                    System.out.println("Berhasil login!");
                    break;
                }
            }
        }
    }
    
}
