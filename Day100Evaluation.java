//Soal Merebut kembali
import java.util.Scanner;
public class Day100 {
    
    public static int[] xBaru;
    
    public static int retas (int[] arr) {
        int n = arr.length;
        xBaru = new int[n];
        boolean[] terisi = new boolean[n];
        
        int p = 0;
        
        for (int i = 0; i < n; i++) {
            int idx = arr[i] % n;
            
            while (terisi[idx]) {
                idx = (idx + 1) % n;
                p++;
            }
            
            xBaru[idx] = arr[i];
            terisi[idx] = true;
        }
        
        return p;
    }
    
    public static String susunKode(int p) {
        int n = xBaru.length;
        int panjang = xBaru[p % n];
        
        String hasil = "";
        int i = 0;
        
        while (hasil.length() < panjang) {
            hasil += xBaru[i];
            i = (i + 1) % n;
        }
        
        return hasil.substring(0, panjang);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int n = s.nextInt();
        int[] arr = new int [n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int p = retas(arr);
        String kode = susunKode(p);
        
        System.out.print(kode);
    }
    
}


//Soal String Cantik
import java.util.Scanner;
public class SoalStringCantik {
    
    public static String cekString(String s) {
        boolean cantik = false;
        
        for (int i = 0; i < (s.length()-2); i++) {
            if ((s.charAt(i) == 'I' || s.charAt(i) == 'i')
                && (s.charAt(i+1) == 'S' || s.charAt(i+1) == 's')
                && (s.charAt(i+2) == 'C' || s.charAt(i+2) == 'c')) {
                    cantik = true;
                }
        }
        
        if (cantik) {
            return "CANTIK";
        } else {
            return "TIDAK CANTIK";
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String s = sc.nextLine();
        
        System.out.println();
        System.out.println(cekString(s));
        
    }
    
}
