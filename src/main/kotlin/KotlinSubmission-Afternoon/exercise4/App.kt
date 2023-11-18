package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        // Potongan kode yang mungkin menyebabkan exception
        val result = divideNumbers(10, 2)
        println("Hasil pembagian adalah: $result")

        // Memasukkan input yang tidak valid untuk menimbulkan NumberFormatException
        val invalidInput = "abc"
        val number = invalidInput.toInt()
        println("Angka yang diperoleh dari input: $number")
    } catch (e: ArithmeticException) {
        // Menangkap ArithmeticException jika terjadi pembagian oleh angka nol
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } catch (e: NumberFormatException) {
        // Menangkap NumberFormatException jika terjadi kesalahan konversi tipe data
        println("Terjadi kesalahan konversi tipe data: ${e.message}")
    } finally {
        // Blok ini akan dijalankan, baik terjadi exception atau tidak
        println("Program selesai.")
    }
}

fun divideNumbers(a: Int, b: Int): Int {
    return a / b
}


