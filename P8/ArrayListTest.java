/*
 * File : ArrayListTest.java  17/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : Representasi dari objek Array List
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        //Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        //Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        //Menghapus elemen
        strings.remove("praktikum");

        //Iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}
