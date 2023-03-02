/**
 * File      : Titik.java		01/03/23
 * Penulis   : Aprilyanto Setiyawan Siburian
 * Deskripsi : Kelas yang berisi main dari Titik
 * 
 */

public class Titik
{
	public double absis; //atribut
	public double ordinat; //atribut
	public static int counterTitik; //counter untuk menghitung objek titik
	public Titik(double a, double o) //konstruktor
	{
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	public Titik()
	{
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	public void setAbsis(double a) //method
	{
		absis = a;
	}
	public void setOrdinat(double o) //method
	{
		ordinat = o;
	}
	public double getAbsis()
	{
		return absis;
	}
	public double getOrdinat()
	{
		return ordinat;
	}
	public int getCounterTitik()
	{
		return counterTitik;
	}
}
