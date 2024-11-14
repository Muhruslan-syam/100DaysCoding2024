import java.util.Scanner;
public class charat {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);////
        System.out.print("masukkan kata dengan huruf kapital = ");
        String b = a.nextLine();
        String c = b.toLowerCase();
        System.out.println("Hasil konversi huruf (>) = "+c);
        System.out.println();
        System.out.println("Hasil konversi cara ke 2 huruf (>) = "+b.toLowerCase());
            
        
    }
    
}
