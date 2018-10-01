/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Nama      : Rizal Arif Nugraha
 * Kelas             : PBO2
 * NIM               : 10117048 
 * Deskripsi Program : Program yang berisi tentang waktu saat ini.
 */
public class PBO210117048Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE,d MMMM yyyy, "
                + "hh:mm:ss");

        String kalendar = tanggal.format(calendar.getTime());

        System.out.println("Hari Ini Adalah Hari : " + kalendar);
    }

}
