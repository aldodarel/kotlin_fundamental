/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 9 menggunakan fungsi maxOf untuk mencari nilai tertinggi menggunakan if dan unit tipe Integer

fun maxOf(a: Int, b:Int): Int {
    if (a > b){
        return a
    } else {
        return b
    }
}

fun main(){
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}