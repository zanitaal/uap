package models;

public class Torus {
    private double jariJariLuar;
    private double jariJariDalam;
    private double volume;
    private double luasPermukaan;
    private double massa;

    public Torus(double jariJariLuar, double jariJariDalam) {
        this.jariJariLuar = jariJariLuar;
        this.jariJariDalam = jariJariDalam;
    }

    public void hitungVolume() {
        volume = 2 * Math.PI * Math.PI * jariJariDalam * jariJariDalam * jariJariLuar;
    }

    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.PI * jariJariLuar * jariJariDalam;
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
