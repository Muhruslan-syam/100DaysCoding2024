import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        outerLoop: // pelabelan outer loop
            for (int i = 0; i < 5; i++){
                 System.out.println("memulai perulangan = "+i);
                       for(int b = 0; b<10 ; b++ ){
                           System.out.println("jumlah perulangan : "+b);
                              if (b == 20) {
                                  System.out.println("Telah mencapai batas!!");
                            break outerLoop;
                         }
                    }
                }
        
             }
            
        
         }
