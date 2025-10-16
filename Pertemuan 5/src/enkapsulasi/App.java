package enkapsulasi;
public class App {
    public static void main(String[] args) throws Exception {
        /*
        Person orang1 = new Person();
        orang1.setNama("suki");
        orang1.setUmur(21);
        orang1.setAlamat("bogor");

        System.out.println(orang1.getNama());
        System.out.println(orang1.getUmur());
        System.out.println(orang1.getAlamat());

        orang1.setNama("kuki");
        orang1.setUmur(21);
        orang1.setAlamat("bekasi");

        System.out.println(orang1.getNama());
        System.out.println(orang1.getUmur());
        System.out.println(orang1.getAlamat());
         */
        Animal kucing = new Animal();
        kucing.setNama("kucing");
        kucing.setUmur(2);

        System.out.println(kucing.getNama() + " " + kucing.getUmur() + " " + "tahun sedang bermain");
    }
}
