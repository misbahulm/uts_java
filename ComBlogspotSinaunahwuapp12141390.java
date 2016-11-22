
package com.blogspot.sinaunahwuapp12141390;

import java.util.Scanner;


/**
 *
 *@author 12141390
 */
public class ComBlogspotSinaunahwuapp12141390 {
    
    public static void main(String[] args) {
        int acak = (int) (Math.random()*100)+1; //angka acak
        int tebakan;
        Scanner input = new Scanner(System.in); //untuk inputan
        
        System.out.print("Masukkan nama anda untuk memulai atau tekan 'y' untuk keluar,\nkemudian tekan enter : ");
	String nama_user = new Scanner(System.in).nextLine(); //input user name
	System.out.print("\n\n");
        
        System.out.println("#Level 1\n");
        System.out.println("Selamat datang "+nama_user);
        System.out.println("\nSilahkan tebak antara angka 1 s/d 100");
        System.out.println("\nAnda mempunyai kesempatan 5 kali");
        System.out.println("\n");
        
        
        
        
        do{
            
            System.out.println("\nTebakan Anda ? ");
            tebakan = input.nextInt();
            if (tebakan <= acak){
                System.out.println("Tebakan anda terlalu kecil! Anda mempunyai kesempatan kali lagi");
            }else if (tebakan >= acak){
                System.out.println("Tebakan anda terlalu besar! Anda mempunyai kesempatan kali lagi");
            }
        }while (tebakan != acak);
        System.out.println("Tebakan anda benar");
}



   
        












    

