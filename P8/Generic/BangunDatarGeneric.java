/*
 * File : BangunDatarGeneric.java  17/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
*/


public class BangunDatarGeneric<A extends BangunDatar> {
    private A bangunDatar;

    public void set(A tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public A get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

