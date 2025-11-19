import java.util.Scanner;
public class Day73 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input angka awal\t     : ");
        int angka1 = input.nextInt();
        int hasil = angka1;
        
        while (true) {
            System.out.print("Input angka untuk dijumlahkan: ");
            int angka2 = input.nextInt();
            if (angka2>=0){
                hasil += angka2;
                System.out.println("Hasil sementara: " + hasil);
            }else{
                break;
            }
        }
        System.out.println("\nTotal hasil penjumlahan: " + hasil);
    }
    
}
