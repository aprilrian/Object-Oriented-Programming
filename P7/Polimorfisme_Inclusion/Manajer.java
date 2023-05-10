/*
 * File : Manajer.java  10/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Representasi dari objek manajer
*/

package Polimorfisme_Inclusion;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super.setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan = " + tunjangan + "\n");
    }
}