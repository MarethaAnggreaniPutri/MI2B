/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author win 10
 */
public class mobil {
    int tahunpembutan;
    String namamodel;
    
    public mobil(int tahun, String nama){
          tahunpembutan = tahun;
          namamodel = nama;
    }
    public static void main (String[] args) {
        mobil m = new mobil(2020,"avanza");
        System.out.println("nama model : " +m.namamodel+
                "\ntahun pembuatan : "+m.tahunpembutan);
        
    }
    
}
