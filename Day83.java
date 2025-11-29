import java.util.Scanner;
public class Day83 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah elemen : ");
        int JElemen = sc.nextInt();
        
        int[] elemen = new int[JElemen];
        
        System.out.println("\nInput " + elemen.length + " nilai elemen : ");
        for (int i = 0; i<elemen.length; i++){
            System.out.print("Elemen ke-" + (i+1) + " : ");
            elemen[i] = sc.nextInt();
        }
        int total = 0;
        //Menjumlahkan semua elemen
        for (int i = 0; i<elemen.length; i++){
            total += elemen[i];
        }
        
        System.out.println("\nHasil penjumlahan semua elemen :");
        for (int i = 0 ; i<elemen.length; i++) {
            if (i==(elemen.length-1)){
                System.out.print(elemen[i]+ " = " + total);
            } else {
                System.out.print(elemen[i]+ " + ");
            }
        }
    }
    
}
