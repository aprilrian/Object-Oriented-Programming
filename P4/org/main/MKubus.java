/**
 * File      : MKubus.java		                     15/03/23
 * Penulis   : Aprilyanto Setiyawan Siburian
 * Deskripsi : Driver class untuk bujur sangkar dan kubus
 */

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Volume Kubus: "+kubus.hitungVolume());
        System.out.println("Luas Kubus: "+kubus.hitungLuasAlas());
    }
}
