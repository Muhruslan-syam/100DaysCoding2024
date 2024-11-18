import java.util.Scanner;
public class b {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata pertama: ");
        String x = sc.nextLine();
        System.out.print("masukkan kata ke dua : ");
        String y = sc.nextLine();
        if(x.equalsIgnoreCase(y)){
            System.out.print("kata yang anda masukkan sama ");
        }else{
            System.out.print("kata yang anda masukkan beda");
        }
        
    }
}
