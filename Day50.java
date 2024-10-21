import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan angka = ");
        
        
            int b = a.nextInt();
        
        if (b > 0){
            System.out.println("ini angka posistif = "+b);
            System.out.print("masukkan angka = ");
        }
        else if (b<0){
            System.out.println("ini angka negatif = "+b);
            System.out.print("masukkan angka = ");
        }
            
            else {
            System.out.println("ini angka nol = "+b);
                System.out.print("masukkan angka = ");
        }
            
        
    }
}
