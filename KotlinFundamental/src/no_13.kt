/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 13 : program menggunakan list untuk menampilkan items berisi string dengan diawali index ke 0 menggunakan while loop
//// dideklarasikan secara tidak langsung variabel loop index dan menaikannya dengan index++
fun main(){
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}