/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 12 :  program menggunakan list untuk menampilkan items dengan diawali index ke 0 menggunakan for loop
// dideklarasikan secara langsung menggunakan in items.indices
fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }
}