public class MobilPenumpang extends Mobil{
    private String tipeKendaraan;
    private boolean turboMode = false;

    public MobilPenumpang(String nomorKendaraan, String warna, String merk, String tipe) {
        super(nomorKendaraan, warna, merk);
        this.tipeKendaraan = tipe;
        super.setJenis("Mobil Penumpang");
    }

    public void getTipe() {
        System.out.println("Tipe Mobil : " + tipeKendaraan);
    }

    public void setModeTurbo(boolean turboMode){
        if (tipeKendaraan.equalsIgnoreCase("sport")){
            if (turboMode == true){
                this.turboMode = true;
            }
            else{
                this.turboMode = false;
            }
        }
        else {
            System.out.println("Mobil tidak memiliki mode turbo");
        }
    }

    public Boolean getTurboMode() {
        return turboMode;
    }

    @Override
    public void hitungSewa(int hours) {
        int hargaSewa = 50000 * hours;
        System.out.println("Harga Sewa Mobil : "+ hargaSewa);
    }

    @Override
    public void getHorsePower() {
        if(tipeKendaraan.equalsIgnoreCase("sport")){
            if(turboMode == true){
                System.out.println("Daya Mobil Mode Turbo : "+(super.getDayaMobil() + 30) + "hp");
            }
            else{
                System.out.println("Daya Mobil : "+super.getDayaMobil() + "hp");
            }
        }
        else{
            System.out.println("Daya Mobil : "+super.getDayaMobil() + "hp");
        }
    }
}