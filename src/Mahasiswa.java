/* Penerapan Method Overloading = Membuat method dengan nama yang sama namun memiliki parameter
 yang berbeda */

public class Mahasiswa {

    private String Nim,Nama;


    public void dataMhs(){
        System.out.println("Menampilkan Data Mahasiswa");
    }

    public void dataMhs(String N){
        this.Nim = N;
        System.out.println("Data Mahasiswa");
        System.out.println("Nim  : "+ this.Nim);
    }

    public void dataMhs(String N1, String N2){
        this.Nim = N1;
        this.Nama = N2;
        System.out.println("Data Mahasiswa");
        System.out.println("Nama  : " + this.Nama);
        System.out.println("Nim   : " + this.Nim);
    }
}
