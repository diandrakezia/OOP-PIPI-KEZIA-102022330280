public class MakananKering extends Makanan {
    private boolean tahanLama;

    public MakananKering(String nama, double harga, int stok, boolean tahanLama) {
        super(nama, harga, stok);
        this.tahanLama = tahanLama;
    }

    @Override
    public String toString() {
        return super.toString() + ", MakananKering{" +
                "tahanLama=" + tahanLama +
                '}';
    }
}

