/* 
 * File : LambdaHashmap.java  (06/06/2023)
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022) 
 * Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
*/

import java.util.HashMap;

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120022", "Aprilyanto Setiyawan Siburian");
        mahasiswaMap.put("24060121130102", "Sierra");
        mahasiswaMap.put("24060121140178", "Cipung");
        mahasiswaMap.put("24060121120021", "Popoy");

        // menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}