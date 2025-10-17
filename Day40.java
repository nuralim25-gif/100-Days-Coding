import java.util.Scanner;
public class Day40 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Inputan
        System.out.print("Angka 1: ");
        double a = input.nextDouble();
        System.out.print("+|-|X|/: ");
        char pilihan = input.next().charAt(0);
        System.out.print("Angka 2: ");
        double b = input.nextDouble();
        
        double hasil;
        
        //Operasi
        if (pilihan == '+'){
            hasil = a + b;
        }else if (pilihan == '-'){
            hasil = a - b;
        }else if (pilihan == 'X' || pilihan == 'x'){
            hasil = a * b;
        }else if (pilihan == '/'){
            hasil = a / b;
        }else {
            System.out.println("\nOperasi tidak dikenali");
            return;
        }
        
        //Menampilkan hasil
        System.out.printf("%n%f %c %f = %.2f", a, pilihan, b, hasil);
    }
    
}
