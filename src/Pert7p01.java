public class Pert7p01 {
    public static void main(String[] args) {
        Mahasiswa dtMhs = new Mahasiswa();


//        memanggil method overloading yang dibedakan dengan jlmh parameter
        dtMhs.dataMhs(); /* No Parameter */
        dtMhs.dataMhs("20101059"); /* 1 Parameter */
        dtMhs.dataMhs("20101059","Agustina"); /* 2 Parameter */
    }
}
