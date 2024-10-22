import java.util.Scanner;

public class day51{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Jadwal Matkul semester 1");
        System.out.print("masukan hari = ");
        
        while (true){
        String Hari = sc.nextLine();
            
        switch (Hari) {
            case "senin":
                System.out.println(Hari + " Matematika Dasar jam 10:50");
                System.out.println();
                System.out.print("masukan hari = ");
                break;
            case "selasa":
                System.out.println(Hari + " Fisika elektronika jam 13:00");
                System.out.println();
                System.out.print("masukan hari = ");
                break;
            case "rabu":
                System.out.println(Hari + " PSTI jam 9:50");
                System.out.println(Hari + " DDP jam 13:00");
                System.out.println();
                System.out.print("masukan hari = ");
                break;
            case "kamis":
                System.out.println(Hari + " PKN 10:00");
                System.out.println(Hari + " WSB & Ipteks jam 13:00");
                System.out.println(Hari + " Agama Islam jam 16:00");
                System.out.println();
                System.out.print("masukan hari = ");
                break;
            case "jumat":
                System.out.println(Hari + " AOK jam 14:00");
                System.out.println();
                System.out.print("masukan hari = ");
                break;
            case "semua":
                System.out.println(Hari + " Matematika Dasar jam 10:50");
                System.out.println(Hari + " Fisika elektronika jam 13:00");
                System.out.println(Hari + " PSTI jam 9:50");
                System.out.println(Hari + " DDP jam 13:00");
                System.out.println(Hari + " PKN 10:00");
                System.out.println(Hari + " WSB & Ipteks jam 13:00");
                System.out.println(Hari + " Agama Islam jam 16:00");
                System.out.println(Hari + " AOK jam 14:00");
                System.out.println();
                System.out.print("masukan hari = ");
        }
        }
        
    }
}
