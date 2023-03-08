/**
 * File      : MPoligon.java		                 08/03/23
 * Penulis   : Aprilyanto Setiyawan Siburian
 * Deskripsi : Driver class untuk poligon dan persegi panjang
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        Segitiga segitiga = new Segitiga(5,4,3);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: \n"+persegi.hitungLuas());
        segitiga.printInfo();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
    }
}
