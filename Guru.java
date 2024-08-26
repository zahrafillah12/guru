public class Guru {
    //variabel
    int nip;
    String nama;
    String mapel;
    String status;

    //Constructor Parameter
    public Guru(int i, String n, String m, String s) {
        nip = i;
        nama = n;
        mapel = m;
        status = s;
    }
    public void print(){
        System.out.println("NIP : "+nip);
        System.out.println("Nama : "+nama);
        System.out.println("Mata pelajaran : "+mapel);
        System.out.println("Status : "+status);

    }
}
    

