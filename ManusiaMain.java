class Manusia{
 String nama;

 public String getNama(){ 
   return this.nama; 
 }

 public void setNama(String nama){ 
   this.nama = nama; 
 }
 
}

class Mahasiswa extends Manusia{

 //meng-override method getNama di kelas Manusia
 public String getNama(){ 
   return this.nama.toUpperCase(); 
 } 

}

public class ManusiaMain{
 public static void main(String[] args){
  Mahasiswa mhs1 = new Mahasiswa();
  mhs1.setNama("Budi");
  System.out.println(mhs1.getNama());
 }
}