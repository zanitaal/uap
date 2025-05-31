package models;

public class Sphere {
    private double jariJari;
    private double volume;
    private double luasPermukaan;
    private double massa;

    public Sphere(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getMassa() {
        return massa;
    }

    public double toKilogram() {
        return massa / 1000.0;
    }

    public int hitungBiayaKirim() {
        double kg = toKilogram();
        return (int) (Math.ceil(kg / 2) * 8000);
    }
}
