/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 6 : mendeklarasikan variabel a,b,c dengan cara yang berbeda dan mencetak nilai-nilai variabel tersebut

fun main() {
    val a: Int = 1 // immediate assignment
    val b = 2       // 'Int' type is inferred
    val c: Int      // Type required when no initializer is provided
    c = 3   // deffered assignment
    println("a = $a, b = $b, c = $c")
}