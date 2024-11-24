import java.util.Scanner;
public class array {
    public static void main(String[]Args){
        Scanner sc =new Scanner(System.in);
        System.out.println("masukkan batas angka: ");
        String a = sc.nextLine();
        String b = a.replace("!","");
        System.out.println("kalimat yang sudah  dihilanhkan tanda seru = "+b);
        System.out.println("");
        b += "!";
        System.out.print("kalimat yang sudah ditambah tabda seru = "+b);
    }
}
 
