import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class Day41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        NumberFormat rp = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
        
        System.out.println("||Program Hitung Gaji Bersih||");
        System.out.print("Masukkan gaji pokok : ");
        double gajipokok     = input.nextDouble();
        System.out.print("Masukkan tunjangan  : ");
        double tunjangan     = input.nextDouble();
        System.out.print("Masukkan uang lembur: ");
        double lembur        = input.nextDouble();
        System.out.print("Masukkan % BPJS     : ");
        double BPJS          = input.nextDouble();
        
        double pajakPPh = 0;
        
        //Perhitungan
        double bruto = gajipokok + tunjangan + lembur;
        double potonganBPJS = bruto * (BPJS / 100.0);
        if(bruto<=5000000){
            pajakPPh = 0;
        }else if(bruto>5000000 && bruto<=20000000){
            pajakPPh = 5;
        }else if(bruto>20000000 && bruto<=40000000){
            pajakPPh = 15;
        }else if(bruto>40000000 && bruto<=400000000){
            pajakPPh = 25;
        }else if(bruto>400000000){
            pajakPPh = 35;
        }
        double potonganPPh = bruto * (pajakPPh / 100.0);
        double totalpotongan = potonganPPh + potonganBPJS;
        double gajibersih = bruto - totalpotongan;
        
        //Rincian Pendapatan
        System.out.println("\n=== Rincian Pendapatan ===");
        System.out.println("Gaji awal        : " + rp.format(bruto));
        System.out.println("Pajak Penghasilan: " + rp.format(potonganPPh) + " (" + pajakPPh + "%)");
        System.out.println("Potongan BPJS    : " + rp.format(potonganBPJS) + " (" + BPJS + "%)");
        System.out.println("Total Potongan   : " + rp.format(totalpotongan));
        System.out.println("Gaji Bersih      : " + rp.format(gajibersih));
        
        input.close();
    }
    
}
