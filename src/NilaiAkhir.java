import java.util.Scanner;

public class NilaiAkhir {
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

        System.out.println();
        System.out.println("===== NILAI AKHIR =====");
        System.out.println("Praktikum : " + praktikum + " (30%)");
        System.out.println("Tugas     : " + tugas + " (20%)");
        System.out.println("MID       : " + mid + " (20%)");
        System.out.println("Final     : " + nilaiFinal + " (30%)");
        System.out.println();
        System.out.println("Nilai akhir  : " + nilaiAkhir);
        System.out.println("Dibulatkan   : " + dibulatkan);
        System.out.println("Selisih      : " + selisih);
        System.out.println("Lulus (>=60) : " + lulus);
        System.out.println();
        System.out.println("Versi bilangan bulat (int) : " + nilaiAkhirInt);

        scanner.close();
    }
}