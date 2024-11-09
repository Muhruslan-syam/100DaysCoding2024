import java.util.Scanner;
public class tugasmentor {
    
    static int a;
    static int b;
    static char c;
    static int d;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("operator = ");
        c = sc.next().charAt(0);
        System.out.printf("Nilai = ");
        a = sc.nextInt();
        System.out.printf("Nilai = ");
        b = sc.nextInt();
        switch (c){
            case '*': 
            d = a*b;
            System.out.print("Hasil = "+d);
            break;
            case '+': 
            d = a+b;
            System.out.print("Hasil = "+d);
            break;            
            case '/': 
             d = a/b;
            System.out.print("Hasil = "+d);
            break;
            case '-': 
             d = a-b;
            System.out.print("Hasil = "+d);
            break;
            case '%': 
             d = a%b;
            System.out.print("Hasil = "+d);
            break;
        }
    }
    
}
