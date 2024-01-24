package Interface;

public class Persegi extends BangunDatar implements Keliling {

    // atribut
    public int panjang;
    public int lebar;

    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.lebar + this.panjang);
    }

    public double luas(double s) {
        return (s * s);
    }

    public double keliling(double s) {
        return (4 * s);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Persegi");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    
    }
}

