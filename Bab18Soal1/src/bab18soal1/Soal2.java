/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab18soal1;

/**
 *
 * @author Lenovo
 */
public class Soal2 {
    
 public static void main(String[] args) {
        try {
            validateAge(15); // Akan melempar exception karena usia di bawah 18
        } catch (Exception e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah penanganan exception.");
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Usia tidak valid, harus 18 atau lebih.");
        } else {
            System.out.println("Usia valid, akses diperbolehkan.");
        }
    }
}
    

