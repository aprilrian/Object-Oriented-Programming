class MTitik
{
	public static void main(String[] args)
	{
		Titik t1;
		Titik t2;
		Titik t3;
		
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		
		t2 = new Titik();
		t2.setAbsis(3);
		t2.setOrdinat(4);
		
		t3 = new Titik(5,6);
		
		System.out.println("Absis t1 adalah " + t1.getAbsis());
		System.out.println("Ordinat dari t1 adalah " + t1.getOrdinat());
		System.out.println("Absis t2 adalah " + t2.getAbsis());
		System.out.println("Ordinat dari t2 adalah " + t2.getOrdinat());
		System.out.println("Absis t3 adalah " + t3.getAbsis());
		System.out.println("Ordinat dari t3 adalah " + t3.getOrdinat());
		System.out.println("Jumlah objek titik adalah " + t1.getCounterTitik());
	}
}