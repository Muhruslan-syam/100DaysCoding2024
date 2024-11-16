import java.util.Scanner;
public class charat {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);////
        System.out.print("masukkan jari jari = ");
        double r = a.nextDouble();
        r*=2 ;
        double phi;
        //inputan pertama 
        if (r % 7 == 0){
            phi = 22/7;
        }else {
            phi = 3.14;
        }
        
        //inputan ke 2
        System.out.print("masukkan 'lingkaran' untuk mencari nilai keliling");
        System.out.print("masukkan 'luas' untuk mencari nilai luas = ");
        String pilih = a.next().toLowerCase();
        
        
        if (pilih.equals("lingkaran")){
            double d = phi * 1 / 4 * (r * r);
            System.out.print("keliling lingkaran = "+d);
        }else if (pilih.equals("luas")){
            double l = phi * (r*r);
            System.out.print("luas = "+l);
        }else{
            System.out.print("program berhenti");
        }
    }
    
}
