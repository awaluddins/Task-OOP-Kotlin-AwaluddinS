package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    //Variable nama depan
    var nade: String = "Awaluddin"

    //Variable nama belakang
    var nabe: String = "Sampe"

    //Variable umur
    var umur: Int = 20

    //Variable status
    var status: Boolean = true

    //Variable print myprofile
    println("Nama Depan: $nade")
    println("Nama Belakang: $nabe")
    println("Umur: $umur Tahun")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Gruop Id: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val endgame = listOf<String>("Luvy","Awaluddin","Angelica","Dhea","Resta","Abdul","Iqbal","Arya","Nayandra","Rifky","Ibnu")
    return listOf(endgame[1])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Bang Reynaldi","Bang Malik")
    val countOfGroup = arrayOf<String>("Luvy","Awaluddin","Angelica","Dhea","Resta","Abdul","Iqbal","Arya","Nayandra","Rifky","Ibnu")
    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("endgame", listOf("Luvy","Awaluddin","Angelica","Dhea","Resta","Abdul","Iqbal","Arya","Nayandra","Rifky","Ibnu"), "Siang")

}