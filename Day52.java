import java.util.Scanner;
public class day52 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("masukkan angka: ");
		int a = input.nextInt();
		String n = a >=10? ("lebih besar atau samadengan 10"):("lebih kecil dari 10");
		System.out.println(n);
	}
}
