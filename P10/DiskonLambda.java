/**
 * File : DiskonLambda.java 31/05/2023
 * Nama/NIM : Aprilyanto Setiyawan Siburian
 * Deskripsi : ekspresi lambda dasar, digunakan untuk menghitung diskon
**/

interface IDiskon{
	public double hitungDiskon(int harga);
}

public class DiskonLambda{
	public static void main(String[] args){
	//tanpa lambda
	IDiskon diskonMerdeka = new IDiskon(){
		public double hitungDiskon(int harga){
			return harga-(harga*0.3);
		}	
	};
	//dengan lambda
	IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
	//dengan lambda dengan block statement
	IDiskon diskonBiasa = harga -> {
		return harga - (harga * 0.1);
	};
	System.out.println("Diskon Merdeka : "+diskonMerdeka.hitungDiskon(45000));
	System.out.println("Diskon Lebaran : "+diskonLebaran.hitungDiskon(45000));
	System.out.println("Diskon Biasa : "+diskonBiasa.hitungDiskon(45000));
	}
}