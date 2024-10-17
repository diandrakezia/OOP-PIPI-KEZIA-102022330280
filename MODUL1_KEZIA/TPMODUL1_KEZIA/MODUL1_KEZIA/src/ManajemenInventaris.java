import java.util.ArrayList;

public class ManajemenInventaris {
    private ArrayList<Makanan> inventaris;

    public ManajemenInventaris() {
        this.inventaris = new ArrayList<>();
    }

    public void tambahMakanan(Makanan makanan) {
        inventaris.add(makanan);
    }

    public void tampilkanInventaris() {
        for (Makanan makanan : inventaris) {
            System.out.println(makanan);
        }
    }
}
