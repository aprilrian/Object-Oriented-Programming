class A{
 int x;

 private A(){
 }

}

class B {

 B(){
  A a = new A();
 }

}

class ImprovedDesktop extends javax.swing.JFrame{
 //bagaimana caranya di turunan ini bisa menampilkan
 //langsung jendela dengan ukuran 300x300 dan auto close
  ImprovedDesktop(){
    setSize(300,300);
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  } 
}

public class Demo{
 public static void main(String[] args){
	ImprovedDesktop imp = new ImprovedDesktop();
	imp.setVisible(true);
 }
}