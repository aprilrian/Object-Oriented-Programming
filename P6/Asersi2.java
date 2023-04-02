/*
 * File : Asersi2.java
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/* Pertanyaan 
 * Ada yang kurang tepat pada program Asersi2 di atas?
 */ 
/* Penyelesaian
 * Iyaa ada, yaitu terdapat pada program Asersi2 yang kurang tepat yaitu jariJari > 0, lebih baik sintaks yang tepat adalah jariJari != 0 bukan > 0 karena ketika yang diinginkan
 angka yang bukan nol maka angka negatif juga dapat masuk sehingga jika > 0 digunakan maka untuk
 jari-jari yang bernilai negatif akan tidak bisa dijalankan. Jadi, tanda yang paling tepat adalah jariJari != 0
 */