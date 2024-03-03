/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan4soal2;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan4Soal2 {

    public static void main(String[] args) {
       Scanner sisi = new Scanner(System.in);
       int sisi1,sisi2,sisi3;
       char ulang;
     do{
        System.out.println("Masukkan 3 Sisi");
        sisi1 = sisi.nextInt();
        sisi2 = sisi.nextInt();
        sisi3 = sisi.nextInt();
        
        if(sisi1 == sisi2 && sisi2 == sisi3){
            System.out.println("Termasuk Kubus");
        }else{
            System.out.println("Bukan Kubus wle");
        }
        
        System.out.println("Nambah Sisi Lagi Ga? (y/Y)");
         ulang = sisi.next().charAt(0);
        
     }while(ulang == 'y' || ulang=='Y');
    }
}
