import java.util.Scanner;

public class b {
    public static void main(String[] args) {
            System.out.println("input nilai 1 untuk membuat pola persegi");
            System.out.println("input nilai 2 untuk pola persegi panjang");
            System.out.println();
            System.out.print("masukkan imputan = ");
        Scanner a = new Scanner(System.in);
            
            int b = a.nextInt();
            switch (b){
                    case 1:
                        System.out.print("input nilai persegi = ");            
                            int sc = a.nextInt();
                               for (int i = 0; i < sc; i++){
                                  for (int j = 0; j < sc; j++){
                                       System.out.print("0 ");
                                      }
                                     System.out.println();
                                 }
                    case 2:
                         System.out.print("masukan nilai panjang = ");
                              int cs = a.nextInt();
                                   System.out.print("masukkan nilai lebar = ");
                                      int sb = a.nextInt();
                                         for (int i = 0; i < cs; i++){
                                             for (int j = 0; j < sb; j++){
                                                 System.out.print("0 ");
                                              }
                                         System.out.println();
                                     }
            }
    }
}
