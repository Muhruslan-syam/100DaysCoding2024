import java.util.Scanner;

public class tugas2 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String []nama = new String[a];
        for (int i = 0; i < a;i++){
            System.out.println("masukkan nama ke "+(i+1));
            nama[i] = sc.nextLine();
        }
        System.out.println("nama adinda mu = ");
        for (int i = 0; i < a; i++){
            System.out.println(nama[i]);
        }
        System.out.print("ubah nama ke =  ");
        int urut = sc.nextInt();
        sc.nextLine();
        if (urut >= 0 && urut < a) {
            System.out.print("Masukkan nama baru " + urut + ": ");
            String namaBaru = sc.nextLine();
            nama[urut] = namaBaru;
            
           System.out.println("nama yang telah di ubah:");
            for (int i = 0; i < nama.length; i++) {
                System.out.println((i + 1) + ". " + nama[i]);
            }
        } else {
            System.out.println(" Tidak valid, masukkan ulang.");
        }
        
    }
}
