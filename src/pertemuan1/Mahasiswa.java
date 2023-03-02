/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author win 10
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args) {
       Mahasiswa mhs = new Mahasiswa ();
       mhs.nama="maretha";
       mhs.nobp="21092053";
       mhs.kelas="B";
       mhs.prodi="mi";
       mhs.jurusan="teknologi informasi";
       
       System.out.println("nama : " +mhs.nama+ "\n"
              + "no bp : "+mhs.nobp+"\n"
                  + "jurusan : "+mhs.jurusan+"\n"
                      + "prodi : "+mhs.prodi+"\n"
                           + "kelas : "+mhs.kelas+"\n");
       
       System.out.println("\n");
       
       Mahasiswa mhs2 = new Mahasiswa ();
       mhs2.nama="wiwin";
       mhs2.nobp="210920";
       mhs2.kelas="B";
       mhs2.prodi="mi";
       mhs2.jurusan="teknologi informasi";
       
       System.out.println("nama : " +mhs2.nama+ "\n"
              + "no bp : "+mhs2.nobp+"\n"
                  + "jurusan : "+mhs2.jurusan+"\n"
                      + "prodi : "+mhs2.prodi+"\n"
                           + "kelas : "+mhs2.kelas+"\n");
    
  }
    
}
