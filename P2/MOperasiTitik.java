public class MOperasiTitik {
    public static void main(String[] args)
    {
        Titik t = new Titik(1,2);
        OperasiTitik o = new OperasiTitik();

        System.out.println("TITIK SEBELUM DIREFLEKSIKAN");
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
        System.out.println("TITIK DILAKUKAN REFLEKSI X");
        o.refleksiSumbuX(t);
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
        System.out.println("TITIK DILAKUKAN REFLEKSI Y");
        o.refleksiSumbuY(t);
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
    }
}
