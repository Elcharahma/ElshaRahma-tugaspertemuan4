/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan4soal1;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan4Soal1 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        int nilai = angka.nextInt();
        
        for(int i=1; i<=nilai; i++){
            System.out.println(i);
        }
    }
}
