public class day14 {
    
    public static void main(String[] args) {
        //String awal
        String stringint = "100";
        String stringfloat = "12.7";
        String stringchar = "Alim";
        
        //Konversi ke tipe data primitif
        int isiint = Integer.parseInt(stringint);    
        float isifloat = Float.parseFloat(stringfloat);      
        char isichar = stringchar.charAt(0);
        
        //Outout
        System.out.println("Isi String-Integer                : " + isiint);
        System.out.println("Isi String-Float                  : " + isifloat);    
        System.out.println("Isi String-Char (Karakter Pertama): " + isichar);
    }
    
}
