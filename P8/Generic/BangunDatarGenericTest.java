/*
 * File : BangunDatarGenericTest.java  17/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : main class untuk generic bangun datar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe generic : "+bdg.get().getClass().getName());
    }
}

/*
Default nama objek generic sering kali dipilih sebagai "T" karena itu 
merupakan singkatan dari "Type" (Tipe) dan digunakan untuk mewakili tipe data 
yang tidak diketahui atau dapat bervariasi. Penggunaan "T" sebagai nama objek 
generic hanyalah konvensi. Kode yang baik harus memilih nama yang sesuai dan 
deskriptif sesuai konteksnya. Jika ada kebutuhan yang lebih spesifik atau nama 
yang lebih deskriptif diperlukan, maka pengembang dapat memilih nama yang lebih 
relevan dan bermakna untuk objek generic tersebut.
*/
