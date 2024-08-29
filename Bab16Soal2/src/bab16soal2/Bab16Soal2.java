/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab16soal2;

/**
 *
 * @author Lenovo
 */
public class Bab16Soal2 {

        public static void main(String[] args) {
        OperasiAritmatika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        System.out.println("Penjumlahan: " + operasi[0].hitung());
        System.out.println("Pengurangan: " + operasi[1].hitung());
        System.out.println("Perkalian: " + operasi[2].hitung());
        System.out.println("Pembagian: " + operasi[3].hitung());
    }
}