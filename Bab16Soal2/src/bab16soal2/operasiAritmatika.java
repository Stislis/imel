/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab16soal2;

/**
 *
 * @author Lenovo
 */
class OperasiAritmatika {
    protected double A = 9.5;
    protected double B = 2.5;

    protected double hitung() {
        return 0;
    }
}
class Penjumlahan extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A + B;
    }
}
class Pengurangan extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A - B;
    }
}
class Perkalian extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A * B;
    }
}
class Pembagian extends OperasiAritmatika {
    @Override
    protected double hitung() {
        return A / B;
    }
}