import java.util.Scanner;
public class charat {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);////
        System.out.println("masukkan kata = ");
        String b = a.nextLine();
        System.out.println("masukkan angka yang sesuai untuk menampilkan salah satu dari huruf kata yang anda masukkan tadi = ");
        int c = a.nextInt();
        int d = b.length();
        if (c >= 0 && c < d ){
            char e = b.charAt(c);
            System.out.println(e);
            System.out.println("huruf ini yang kita cari ? = ");
            
        }
            
            else {
                System.out.println(" salah coba ulang ");
            }     
            
        
    }
    
}
