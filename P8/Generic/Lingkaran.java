/*
 * File : Lingkaran.java  17/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * 3.14 * jejari;
    }
}