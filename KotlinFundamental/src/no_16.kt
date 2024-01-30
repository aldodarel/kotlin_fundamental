/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 16 :  mendeklarasikan list berisi string nama-nama buah, lalu diberikan fungsi untuk mencari items yang diawali dengan huruf 'a' dan ditampilkan
fun main() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }  // memfilter
        .sortedBy { it }        // lalu mengurutkan elemen-elemen secara alamiah dengan { it } sbg lambda expression
        .map { it.toUpperCase() }   // mengubah string menjadi uppercase (huruf kapital)
        .forEach { println(it) }    // hanya mencetak setiap elemen yang telah melalui operasi 'map'
}
