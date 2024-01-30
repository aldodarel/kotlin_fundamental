/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 7 : Top-level variables
val PI = 3.14
var x = 0
fun incrementX() {
    x += 1          // increment yaitu menambahkan 1 pada variabel x
}

fun main() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}
