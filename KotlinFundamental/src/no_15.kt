/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 15 : untuk memilih mana string yang termasuk dalam fungsi/kondisi when
fun main() {
    val items = setOf("apple", "banana", "kiwifruit")   // setOf adalah kumpulan elemen yang tdk dapat diubah dan tdk memiliki urutan tertentu
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}