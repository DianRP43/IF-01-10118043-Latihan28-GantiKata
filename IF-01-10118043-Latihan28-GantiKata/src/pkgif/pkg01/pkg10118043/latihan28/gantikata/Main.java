/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat, sebelum, setelah;
        System.out.println("Program Ganti Kata");
        System.out.println("__________________");
        System.out.print  ("Masukan Kalimat   : ");
        Scanner scanner = new Scanner(System.in);
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata        : ");
        sebelum = scanner.nextLine();
        System.out.print("Menjadi Kata      : ");
        setelah = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Hasil Formating");
        System.out.println("_______________");
        System.out.println("Kalimat Awal   "+ kalimat);
        System.out.println("Kalimat Baru   "+ kalimat.replaceAll(sebelum, setelah));
        
        
                
                
        
    }
    
}
