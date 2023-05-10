/*
 * File : Pegawai.java  10/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Representasi dari objek pegawai
*/

package Polimorfisme_Inclusion;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void tampilData(){
        System.out.println("Nama = " + nama + ", Gaji Pokok = " + gajiPokok);
    }    
}