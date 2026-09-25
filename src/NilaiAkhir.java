import java.util.Scanner;

public class KalkulatorNilaiAkhir {
    public static void main(String[] args) {
        final double BOBOT_PRAKTIKUM = 0.30;
        final double BOBOT_TUGAS = 0.20;
        final double BOBOT_MID = 0.20;
        final double BOBOT_FINAL = 0.30;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();
        System.out.print("Nilai tugas     : ");
        double tugas = scanner.nextDouble();
        System.out.print("Nilai MID       : ");
        double mid = scanner.nextDouble();
        System.out.print("Nilai final     : ");
        double nilaiFinal = scanner.nextDouble();

        double nilaiAkhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;
        nilaiAkhir += nilaiFinal * BOBOT_FINAL;

        int praktikumInt = (int) praktikum;
        int tugasInt = (int) tugas;
        int midInt = (int) mid;
        int finalInt = (int) nilaiFinal;
        int nilaiAkhirInt = praktikumInt * 30 / 100 + tugasInt * 20 / 100 + midInt * 20 / 100 + finalInt * 30 / 100;

        int dibulatkan = (int) nilaiAkhir;
        double selisih = nilaiAkhir - dibulatkan;
        boolean lulus = nilaiAkhir >= 60;