import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan angka");
        int b = a.nextInt();
        for (int i = 1; i<=b;i++){
            if (i%2 == 1){
                System.out.print(i+", ");
            }
        }
    }
}
