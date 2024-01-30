/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 10 menggunakan fungsi maxOf untuk mencari nilai tertinggi dengan assign langsung if
fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun main(){
    println("max of 0 and 42 is ${maxOf2(0,42)}")
}