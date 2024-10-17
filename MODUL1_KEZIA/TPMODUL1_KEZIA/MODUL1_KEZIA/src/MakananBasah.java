public class MakananBasah extends Makanan {
    private int masaSimpan; // dalam hari

    public MakananBasah(String nama, double harga, int stok, int masaSimpan) {
        super(nama, harga, stok);
        this.masaSimpan = masaSimpan;
    }

    @Override
    public String toString() {
        return super.toString() + ", MakananBasah{" +
                "masaSimpan=" + masaSimpan +
                '}';
    }
}

