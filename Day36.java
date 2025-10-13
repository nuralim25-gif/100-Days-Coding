import java.util.Scanner;
public class Day36 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Nama     : ");
        String nama = in.nextLine();
        System.out.print("Kehadiran: ");
        int kehadiran = in.nextInt();
        
        if (kehadiran>=5){
            System.out.print("Nilai    : ");
            int nilai = in.nextInt();
            if (nilai>91&&nilai>=100){
                System.out.printf("%nHalo, %s, bobot nilai Anda A", nama);
            }else if (nilai>=81&&nilai<=90){
                System.out.printf("%nHalo, %s, bobot nilai Anda B", nama);
            }else if (nilai>=71&&nilai<=80){
                System.out.printf("%nHalo, %s, bobot nilai Anda C", nama);
            }else if (nilai>=61&&nilai<=70){
                System.out.printf("%nHalo, %s, bobot nilai Anda D", nama);
            }
        }else{
            System.out.printf("%nMohon maaf, %s, bobot nilai Anda E karena kehadiran anda kurang dari 5", nama);
        }
    }
    
          }
