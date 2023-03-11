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
import java.util.Scanner;

public class Kelasinput {
     public static void main (String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.print("masukan nama : ");
         person p = new person();
         p.setName(sc.nextLine());
         System.out.println("nama anda adalah "+
                           p.getName());
       
     }
    
}
