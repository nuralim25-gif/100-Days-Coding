public class day8 {
    
    public static void main(String[] args) {
        //Membuat variabel String
        String nama = "Nur Alim";
        String prodi = "Informatika";
        String fakultas = "Teknik";
        String tahunakademik = "2025/2026";
        String universitas = "Universitas Sulawesi Barat";     
        
        //Menampilkan isi variabel
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Program Studi\t: " + prodi);      
        System.out.println("Fakultas\t: " + fakultas);   
        System.out.println("Tahun Akademik\t: " + tahunakademik); 
        System.out.println("Universitas\t: " + universitas); 
        
        //Membuat baris kosong setelah paragraf
        System.out.println();
        
        //Menggunakan method toUpperCase() pada String
        System.out.println("Nama\t\t: " + nama.toUpperCase());
        System.out.println("Program Studi\t: " + prodi.toUpperCase());      
        System.out.println("Fakultas\t: " + fakultas.toUpperCase());   
        System.out.println("Tahun Akademik\t: " + tahunakademik.toUpperCase()); 
        System.out.println("Universitas\t: " + universitas.toUpperCase()); 
        
        //Membuat baris kosong setelah paragraf
        System.out.println();
        
        //Menggunakan method toLowerCase() pada String
        System.out.println("Nama\t\t: " + nama.toLowerCase());
        System.out.println("Program Studi\t: " + prodi.toLowerCase());      
        System.out.println("Fakultas\t: " + fakultas.toLowerCase());   
        System.out.println("Tahun Akademik\t: " + tahunakademik.toLowerCase()); 
        System.out.println("Universitas\t: " + universitas.toLowerCase()); 
        
        //Membuat baris kosong setelah paragraf
        System.out.println();
        
        //Menggunakan method length() pada String
        System.out.print("Jumlah karakter pada nama adalah " + nama.length());
        System.out.print(" karakter");
    }
    
}
