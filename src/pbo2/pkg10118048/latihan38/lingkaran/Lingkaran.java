/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan38.lingkaran;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung jari-jari, keliling dan luas lingkaran
 */
public class Lingkaran {
    
    private int diameter;

    public void cekDiameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======PERHITUNGAN LINGKARAN======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            System.out.print("Masukan Nilai Diameter Lingkaran : ");
            scanner.next();
        }
        diameter = scanner.nextInt();
    }
    
    private int hitungJariJari() {
        return diameter / 2;
    }
    
    private double hitungKeliling() {
        return 2 * Math.PI * hitungJariJari();
    }
    
    private double hitungLuas() {
        return Math.PI * hitungJariJari() * hitungJariJari();
    }
    
    public void tampilHasil() {
        System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran\t= " +hitungJariJari() +" cm");
        System.out.printf("Luas Lingkaran = %.2f cm%n" ,hitungLuas());
        System.out.printf("Keliling Lingkaran = %.2f cm%n" ,hitungKeliling());
    }

}
