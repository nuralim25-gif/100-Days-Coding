import java.util.Scanner;
public class Day92 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=== Menghitung Luas Persegi ===");
        
        System.out.print("Sisi (cm) : ");
        double sisi = sc.nextDouble();
        
        System.out.printf("Luas\t  : %.2f cm²",HitungLuasPersegi(sisi));
        
    }
    
    public static double HitungLuasPersegi (double sisiMethod) {
        return sisiMethod * sisiMethod;
        
    }
    
}
