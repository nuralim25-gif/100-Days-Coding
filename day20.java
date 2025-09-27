import java.util.Scanner;
public class day20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan bulat  : ");    
        int bilanganbulat = input.nextInt();
        String stringint = String.valueOf(bilanganbulat);
        
        System.out.print("Masukkan bilangan pecahan: ");
        double bilanganpecahan = input.nextDouble();
        String stringdouble = bilanganpecahan + "";
        
        System.out.print("Masukkan sebuab kata     : ");
        char karakter = input.next().charAt(0);
        String stringchar = Character.toString(karakter);
        
        
        System.out.println("\nHasil Konversi:");
        System.out.println("Integer ke String: " + stringint);
        System.out.println("Double ke String : " + stringdouble);
        System.out.println("Char ke String   : " + stringchar);
        
        
        input.close();
    }
    
}
