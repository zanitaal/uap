package mains;

import java.util.Scanner;
import java.util.Locale;
import models.Sphere;
import models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("id", "ID")); // supaya bisa input 3,5
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("ZANITA ALYA KHAIRUNNISA");
        System.out.println("245150707111019");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double jariJariLuar = scanner.nextDouble();

        System.out.print("Isikan radius   : ");
        double jariJariDalam = scanner.nextDouble();

        Torus torus = new Torus(jariJariLuar, jariJariDalam);
        torus.hitungVolume();
        torus.hitungLuasPermukaan();
        torus.setMassa(torus.getVolume() * 2.286);

        System.out.println("=============================================");
        System.out.printf("Volume          : %.1f\n", torus.getVolume());
        System.out.printf("Luas permukaan  : %.1f\n", torus.getLuasPermukaan());
        System.out.printf("Massa           : %.1f\n", torus.getMassa());
        System.out.printf("Massa dalam kg  : %.3f\n", torus.toKilogram());
        System.out.println("Biaya kirim     : Rp" + torus.hitungBiayaKirim());
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double jariJari = scanner.nextDouble();

        Sphere bola = new Sphere(jariJari);
        bola.hitungVolume();
        bola.hitungLuasPermukaan();
        bola.setMassa(bola.getVolume() * 0.5714);

        System.out.println("=============================================");
        System.out.printf("Volume          : %.1f\n", bola.getVolume());
        System.out.printf("Luas permukaan  : %.1f\n", bola.getLuasPermukaan());
        System.out.printf("Massa           : %.1f\n", bola.getMassa());
        System.out.printf("Massa dalam kg  : %.3f\n", bola.toKilogram());
        System.out.println("Biaya kirim     : Rp" + bola.hitungBiayaKirim());
        System.out.println("=============================================");
    }
}
