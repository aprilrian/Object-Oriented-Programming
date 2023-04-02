/*
 * File : AngkaSial.java 
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/* Pertanyaan
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 */
/* Penyelesaian: 
 * karena class AngkaSialException belum dibuat sehingga baris 12 dan baris 21 tidak bisa dieksekusi,
 jadi diperlukan sebuah pembuatan class AngkaSialException terlebih dahulu yang merupakan inheritance dari class exception
 */