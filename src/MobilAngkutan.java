public class MobilAngkutan extends Mobil{
    private int maximumLoad;

    public MobilAngkutan(String nomorKendaraan, String warna, String merk, int maximumLoad) {
        super(nomorKendaraan, warna, merk);
        this.maximumLoad = maximumLoad;
        super.setJenis("Mobil Angkutan");
    }

    public void getMaximumLoad() {
        System.out.println("Maksimum Muatan Mobil : " + maximumLoad +"kg");
    }

    @Override
    public void hitungSewa(int hours) {
        int hargaSewa = 75000 * hours;
        System.out.println("Harga Sewa Mobil : " + hargaSewa);
    }

    @Override
    public void getHorsePower() {
        System.out.println("Daya Mobil : "+getDayaMobil() + "hp");
    }


}