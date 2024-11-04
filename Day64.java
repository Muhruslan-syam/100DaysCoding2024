import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        outerLoop: //ink untuk pelabelan break
            for(int b = 0; b<10 ; b++ ){
            System.out.println("jumlah perulangan : "+b);
            if (b == 7) {
                    System.out.println("Telah mencapai batas!!");
                break outerLoop;
                }
            }
        
        }
            
        
    }
