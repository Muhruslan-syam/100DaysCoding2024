import java.util.Scanner;
public class tugasmentor {
    
    public static void main(String[] args) {
        int []a = {5,3,6,10};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i <a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
            else if(a[i] > max){
                max = a[i];
            }
        }
        double b = max / min;
        System.out.println("angka maksimal = "+min);
        System.out.println("angka minimal = "+max);
        System.out.println("rata rata angka = "+b);
        
    }
    
}
