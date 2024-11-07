import java.util.Scanner;

/**
 * Program untuk menghitung luas lingkaran dan volume tabung.

 *
 * @author Hafiizh Alif Syahyudi 10121013
 * @version 1.0
 */
public class Main {
    /**
     * Menghitung volume tabung berdasarkan jari-jari dan tinggi yang diberikan.
     * @param radius jari-jari tabung
     * @param height tinggi tabung
     * @return volume tabung
     */
    public static double hitungVolumeTabung(double radius, double height) {
        double luasLingkaran = hitungLuasLingkaran(radius);
        return luasLingkaran * height;
    }

    /**
     * Menghitung luas lingkaran berdasarkan jari-jari yang diberikan.
     *
     * @param radius jari-jari lingkaran
     * @return luas lingkaran
     */
    public static double hitungLuasLingkaran(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }



    /**
     * input pengguna untuk jari-jari dan tinggi sebelum dihitung
     * dan volume tabung.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Panjang jari-jari lingkaran: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double height = scanner.nextDouble();

        double luasLingkaran = hitungLuasLingkaran(radius);
        double volumeTabung = hitungVolumeTabung(radius, height);

        System.out.printf("Luas lingkaran adalah: %.2f%n", luasLingkaran);
        System.out.printf("Volume tabung adalah: %.2f%n", volumeTabung);
    }
}
