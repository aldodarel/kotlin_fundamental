/*
*  NAMA   : ALDO DAREL
*  NIM    : 11422004
*  Kelas  : 42 TRPL 1
*  Matkul : Pengembangan Aplikasi Mobile
* */

// 8 : mendeklarasi variabel a dan me-replace dengan fungsi replace lalu menampilkan pesan
fun main() {
    var a = 1
//    simple name in template:
    val s1 = "a is $a"

    a = 2
//    arbitary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2);
}