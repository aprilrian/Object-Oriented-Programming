class Motor{

 private String merk;
 private boolean mahal;

 public String getMerk(){
   return merk.toUpperCase();
 }

 public void setMerk(String mrk){
   merk = mrk;
 }

 public boolean isMahal(){
   return mahal;
 }

}

public class MainMotor{
  public static void main(String[] args){
    Motor motor = new Motor();
    motor.setMerk(args[0]); 
    System.out.println(motor.getMerk()); 
    System.out.println(motor.isMahal()?"Ya":"Tidak Mahal"); 
  }
}