package bases;

public abstract class Bentuk {
    public double volume;
    public double luasPermukaan;
    public double massa; // dalam gram

    public abstract void hitungVolume();
    public abstract void hitungLuasPermukaan();

    public void hitungMassa(double ketebalan, double density) {
        // Massa = Volume * ketebalan * density
        // ketebalan dalam cm, density dalam gram/cm3
        massa = volume * ketebalan * density;
    }
}
