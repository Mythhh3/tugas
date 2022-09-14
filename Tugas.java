package tugas;

import java.util.Scanner;

/**
 *
 * @author revin
 */
public class Tugas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jalur, nilai;
        boolean ulang = true;
        while (ulang == true) {
        System.out.println("pilih jalur yang dipilih :");
        System.out.print("1.SBMPTN\n2.SNMPTN\n3.MANDIRI\n");
        jalur = input.next();

        if (jalur.equalsIgnoreCase("SBMPTN")) {
            ulang = false;
            boolean loop = true;
            while (loop == true){
            System.out.println("pilih golongan pendaftaran : \nA\nB\nC");
            nilai = input.next();
            if (nilai.equalsIgnoreCase("A")) {
                loop = false;
                System.out.println("DSP = 5 JUTA");
                System.out.println("SPP = 500 RIBU");
            } else if (nilai.equalsIgnoreCase("B")) {
                loop = false;
                System.out.println("DSP = 15 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (nilai.equalsIgnoreCase("C")) {
                loop = false;
                System.out.println("DSP = 30 JUTA");
                System.out.println("SPP = 2 JUTA");
            } else {
                System.out.println("Golongan Pendaftaran tidak di temukan");
            }}

        } else if (jalur.equalsIgnoreCase("SNMPTN")) {
            ulang = false;
            boolean loop = true;
            while (loop == true){
            System.out.println("pilih golongan pendaftaran: \nA\nB\nC");
            nilai = input.next();
            if (nilai.equalsIgnoreCase("a")) {
                loop = false;
                System.out.println("DSP = 7 JUTA");
                System.out.println("SPP = 500 RIBU");
            } else if (nilai.equalsIgnoreCase("b")) {
                loop = false;
                System.out.println("DSP = 17 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (nilai.equalsIgnoreCase("c")) {
                loop = false;
                System.out.println("DSP = 35 JUTA");
                System.out.println("SSP = 2 JUTA");
            } else {
                System.out.println("Golongan Pendaftaran tidak di temukan");
            }}
        } else if (jalur.equalsIgnoreCase("MANDIRI")) {
            ulang = false;
            boolean loop = true;
            while (loop == true){
            System.out.println("pilih golongan pendaftaran: \nA\nB\nC");
            nilai = input.next();
            if (nilai.equalsIgnoreCase("a")) {
                loop = false;
                System.out.println("DSP = 10 JUTA");
                System.out.println("SPP = 1 JUTA");
            } else if (nilai.equalsIgnoreCase("b")) {
                loop = false;
                System.out.println("DSP = 25 JUTA");
                System.out.println("SPP = 2 JUTA");
            } else if (nilai.equalsIgnoreCase("c")) {
                loop = false;
                System.out.println("DSP = 50 JUTA");
                System.out.println("SPP = 3 JUTA");
            } else {
                System.out.println("Golongan Pendaftaram tidak di temukan");
            }}
        } else {
            System.out.println("Jalur tidak ditemukan");
        }

    }
  }  
}