/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 14 : fungsi describe yang menerima parameter obj dengan tipe data Any (bisa berupa tipe data apapun)
fun describe(obj: Any): String =
    when (obj) {        // when mengevaluasi objek yang diberikan dan memberikan deskripsi
        1           -> "One"    // jika objek angka 1 maka deskripsinya adalah "One".
        "Hello"     -> "Greeting"   // jika objek adalah string "Hello" maka deskripsinya adalah "Greeting".
        is Long     -> "Long"       // ....
        !is String  -> "Not a string"
        else        -> "Unknown"
    }

fun main() {    // fungsi describe di bawah dengan berbagai jenis objek sebagai argumen kemudian mencetaknya ke konsol
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

}