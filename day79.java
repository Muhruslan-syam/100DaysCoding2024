import java.util.Scanner;
class person{
String x;
    int y;
    
    public person (String x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "nama = " + x +",umur = "+ y;
    }
}

public class b {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama = ");
        String x = sc.nextLine();
        System.out.print("masukkan umur = ");
        int y = sc.nextInt();
        person person = new person (x,y);
        
        System.out.print(person.toString());
        
    }
}
