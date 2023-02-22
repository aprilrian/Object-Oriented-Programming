class Titik
{
	double absis; //atribut
	double ordinat; //atribut
	static int counterTitik; //counter untuk menghitung objek titik
	Titik(double a, double o) //konstruktor
	{
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	Titik()
	{
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	void setAbsis(double a) //method
	{
		absis = a;
	}
	void setOrdinat(double o) //method
	{
		ordinat = o;
	}
	double getAbsis()
	{
		return absis;
	}
	double getOrdinat()
	{
		return ordinat;
	}
	int getCounterTitik()
	{
		return counterTitik;
	}
}