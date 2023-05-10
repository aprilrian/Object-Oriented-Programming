/*
 * File : Programmer.java  10/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Representasi dari objek programmer
*/

package Polimorfisme_Inclusion;

public class Programmer extends Pegawai{
    private int bonus = 450000;
    
    public Programmer(String nama){
        super.setNama(nama);
    }
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus = " + bonus + "\n");
    }
}
