/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal1;

/**
 *
 * @author Lenovo
 */
public class Bab9Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1; // Variabel untuk baris

        while (i <= 5) {
            int j = 1; // Variabel untuk kolom pada setiap baris
            
            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println(); // Baris baru
            i++;
        }
    }
}