public class day10 {
    
    public static void main(String[] args) {
        System.out.println("Seorang arsitek sedang mendesain sebuah jendela berbentuk lingkaran. Ia sudah menghitung bahwa luas jendela tersebut adalah 314 cm². \nJika π = 3.14, tentukan berapa jari-jari dan diameter jendela tersebut!");
        
         System.out.println(); //Baris kosong
        
        final double PI = 3.14; //Konstanta ditandai dengan "final" (nilai dari variabel tidak bisa diubah)
        double luas = 314;
        
        //Mencari jari-jari
        double jarijari = Math.sqrt(luas/PI);
        
        //Mencari diameter
        double diameter = 2 * jarijari;
        
        System.out.println("Luas lingkaran : " + luas);
        System.out.println("Jari-jari      : " + jarijari);
        System.out.println("Diameter       : " + diameter);
    }
    
}
