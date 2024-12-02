import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kata pertama: ");
        String a = sc.nextLine();
        
        System.out.print("Masukkan kata kedua: ");
        String b = sc.nextLine();
        
        
        if (a.equals("you") && b .equals("i")) {
            System.out.println("you and i");
        } else {
            System.out.println("end");
        }
        
    }
}
