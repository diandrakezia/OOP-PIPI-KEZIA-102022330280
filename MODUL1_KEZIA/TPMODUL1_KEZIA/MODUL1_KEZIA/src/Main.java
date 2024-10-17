public class Main {
    public static void main(String[] args) {
        ManajemenInventaris inventaris = new ManajemenInventaris();

        MakananBasah nasi = new MakananBasah("Nasi", 2000, 50, 3);
        MakananKering kerupuk = new MakananKering("Kerupuk", 5000, 100, true);

        inventaris.tambahMakanan(nasi);
        inventaris.tambahMakanan(kerupuk);

        inventaris.tampilkanInventaris();
    }
}
