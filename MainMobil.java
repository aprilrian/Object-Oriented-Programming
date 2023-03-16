class Pemilik{
 private Mobil mobil;
 private String nama;
 
 Pemilik(String nama){
  this.nama = nama;
 }
 
 void setMobil(Mobil mobil){
   this.mobil = mobil;
 }

 Mobil getMobil(){
   return this.mobil;
 }
 
 String getNama(){
  return this.nama;
 }
}

class Mobil{
 private Pemilik pemilik;
 private String platNomor;

 Mobil(String platNomor){
   this.platNomor=platNomor;
 }
 void setPemilik(Pemilik pemilik){
   this.pemilik = pemilik;
 }

 Pemilik getPemilik(){
  return this.pemilik;
 }
}

public class MainMobil{
 public static void main(String[] args){
   Mobil mobil = new Mobil("H 1234 RR");
   Pemilik pemilik = new Pemilik("Budi");
   mobil.setPemilik(pemilik);
   pemilik.setMobil(mobil);
   //cara 1:
   Pemilik pml = mobil.getPemilik();
   System.out.println(pml.getNama());
   //cara 2: 
   System.out.println(mobil.getPemilik().getNama());
 }

 private static void print(String toPrint){
   System.out.println(toPrint);
 }
}