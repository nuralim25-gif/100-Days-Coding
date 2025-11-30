//Soal 1
import java.util.Scanner;
public class Day84Evaluasi {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("");
        int a = in.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = % d%n", i, a, (i*a));
        }
    }
    
}


//Soal 2
import java.util.Scanner;
public class Soal2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("");
        int N = in.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println("Iccang");
        }
    }
    
}


//Soal 3
import java.util.Scanner;
public class Soal3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("");
        String k = in.nextLine();
        System.out.print("");
        int N = in.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(k);
        }
    }
    
}
