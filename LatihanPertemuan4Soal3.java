/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan4soal3;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan4Soal3 {

    public static void main(String[] args) {
        Scanner segitiga = new Scanner(System.in);
        int s1,s2,s3;
        char ulang;
       do{         
        System.out.println("Masukkan 3 sisi Segitiga");
        s1 = segitiga.nextInt();
        s2 = segitiga.nextInt();
        s3 = segitiga.nextInt();
        
        if(s1 * s1 + s2 * s2 == s3 * s3){
             System.out.println("Segitiga Siku - Siku");
        }else if(s1 * s1 + s2 * s2 > s3 * s3){
            System.out.println("Segitiga Lancip");
        }else{
            System.out.println("Segitiga Tumpul");
        }
       System.out.println("Masukin sisi lagi ga? (y/Y)");
         ulang = segitiga.next().charAt(0);
        
     }while(ulang == 'y' || ulang=='Y');
       }
}
