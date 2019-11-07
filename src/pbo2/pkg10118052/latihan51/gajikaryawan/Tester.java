/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis objek untuk menghitung gaji
 * karyawan
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(sc.nextLine());
        System.out.print("Masukkan Nama : ");
        manager.setNama(sc.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(sc.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(sc.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + manager.getNik());
        System.out.println("NAMA\t: " + manager.getNama());
        System.out.println("GOLONGAN: " + manager.getGolongan());
        System.out.println("JABATAN : " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t: "
                + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "
                + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "
                + manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL\t: " + manager.gajiTotal());
    }
    
}
