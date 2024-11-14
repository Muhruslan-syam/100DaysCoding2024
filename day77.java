import java.util.Scanner;
public class charat {
    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);////
        System.out.print("masukkan kata = ");
        String b = a.nextLine();
        System.out.print("masukkan kata = ");
        String c = a.nextLine();
        
        if (b.equals(c)){
            System.out.println("kedua kata yang anda masukkan sama ");
        }else{
            System.out.println("kedua kata yang anda masukkan tidak sama ");
        }
        
        
        
    }
    
}
