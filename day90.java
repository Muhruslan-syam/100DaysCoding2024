import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int jumlahAngka = sc.nextInt();
        int[] angka = new int[jumlahAngka];
        System.out.println("Masukkan angka:");
        for (int i = 0; i < jumlahAngka; i++) {
            angka[i] = sc.nextInt();
        }
      int[] genap= new int[jumlahAngka];
        int[] ganjil = new int[jumlahAngka];
        int inigenap= 0;
        int iniganjil = 0;
      for (int i = 0; i < jumlahAngka; i++) {
            if (angka[i] % 2 == 0) {
                genap[inigenap++] = angka[i];
            } else {
                ganjil[iniganjil++] = angka[i];
            }
        }
      System.out.println("array genap ");
      for (int i = 0;i < inigenap;i++){
        System.out.print(genap[i]+" ");
      }
      System.out.println("array ganjil ");
      for (int i = 0;i < inigenap;i++){
        System.out.print(ganjil[i]+" ");
      }
    }
}
