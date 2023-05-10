/*
 * File : PegawaiDanGaji.java  10/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Main program dari Pegawai dan Gaji
*/

package Polimorfisme_Inclusion;

public class PegawaiDanGaji {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
