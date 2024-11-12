import java.util.Scanner;

public class b {
    public static int hitungFaktorial(int a) {
        
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(a - 1);  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan sebuah bilangan: ");
        int angka = scanner.nextInt();
        
        
        int hasil = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
        
    }
}
