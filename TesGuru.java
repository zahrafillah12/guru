import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String Mapel = input.nextLine();
        System.out.println("Status : ");
        String Status = input.nextLine();
        System.out.println("ID : ");
        int id = input.nextInt();
        input.close();

        Guru Jevi = new Guru(id, nama, Mapel,Status);
        Jevi.print();
        Guru Aulia = new Guru(3003, "Aulia", "Produktif rpl", "tepat" );
        Guru Diaur = new Guru(2590, "Diaur", "pjok", "tepat" );
        Guru Falah = new Guru(1234, "Falah", "Bahasa indonesia", "tepat" );
        Guru Feni = new Guru(3082, "Feni", "Matematika", "tepat" );
        Guru Pasya = new Guru(4531, "Pasya", "Produktif rpl", "tepat" );

        Aulia.print();
        Diaur.print();
        Falah.print();
        Feni.print();
        Pasya.print();
    }    
}
