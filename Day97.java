import java.util.Scanner;
public class Day97 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input sisi persegi : ");
        double sisi = sc.nextDouble();
        
        System.out.print("Luas : " + luasPersegi(sisi));
    }
    
    public static double luasPersegi (double s) {
        return s * s;
    }
    
}
