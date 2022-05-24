package com.example.apotekcanon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apotekcanonlist= listOf<ApotekCanon>(
            ApotekCanon(
                R.drawable.aminofilin,
                "Aminofilin",
                "Aminofilin adalah obat yang digunakan untuk meredakan beberapa keluhan, seperti sesak napas, mengi, atau sulit bernapas, yang disebabkan oleh asma, penyakit paru obstruktif kronis (PPOK), bronkitis, atau emfisema. Obat ini juga terkadang digunakan untuk menangani gagal jantung atau gangguan pernapasan pada bayi prematur."
            ),
            ApotekCanon(
                R.drawable.antibiotik,
                "Antibiotik",
                "Antibiotik adalah jenis obat yang digunakan untuk mengatasi infeksi bakteri. Beberapa jenis antibiotik juga bisa digunakan untuk mencegah terjadinya infeksi bakteri pada kondisi-kondisi tertentu. Antibiotik tidak dapat digunakan untuk mengatasi infeksi akibat virus, seperti flu."
            ),
            ApotekCanon(
                R.drawable.amoxicillin,
                "Amoxicillin",
                "Amoxillin adalah salah satu merek obat yang digunakan untuk mengatasi infeksi bakteri. Jenis infeksi yang bisa diobati dengan obat ini antara lain infeksi saluran kemih atau infeksi saluran pernapasan."
            ),
            ApotekCanon(
                R.drawable.antimania,
                "Antimania",
                "Antimania atau mood stabilizers adalah kelompok obat yang digunakan untuk mengendalikan suasana hati atau mood pada penderita gangguan bipolar, yang bisa berupa depresi atau episode mania."
            ),
            ApotekCanon(
                R.drawable.asamglikolat,
                "Asam Glikolat",
                "Asam glikolat adalah bahan aktif yang berfungsi mempercepat pergantian sel kulit mati, sehingga bisa melembutkan dan memberikan efek cerah pada kulit. Asam glikolat sering digunakan dalam produk perawatan kulit. Bahan ini tersedia dalam bentuk krim dan losion dengan kadar 10%, 30%, atau di atas 70%."
            ),
            ApotekCanon(
                R.drawable.asenapine,
                "Asenapine",
                "Asenapine adalah obat untuk meredakan gejala skizofrenia dan gangguan bipolar. Obat ini bisa digunakan sebagai pengobatan tunggal atau dikombinasikan dengan obat lain. Kombinasi asenapine dengan obat lain biasanya digunakan untuk meredakan episode mania pada gangguan bipolar."
            ),
            ApotekCanon(
                R.drawable.atenolol,
                "Atenolol",
                "Atenolol adalah obat untuk menangani nyeri dada angina dan menurunkan tekanan darah pada hipertensi. Obat ini juga bisa digunakan dalam pengobatan denyut jantung tidak teratur (aritmia)."
            ),
            ApotekCanon(
                R.drawable.aceinhibitor,
                "ACE Inhibitor",
                "Angiotensin-converting enzyme (ACE) inhibitor atau penghambat enzim pengubah angiotensin adalah kelompok obat yang digunakan untuk mengobati hipertensi, gagal jantung, dan gagal ginjal kronis. Obat ini membuat dinding pembuluh darah rileks sehingga tekanan darah dapat menurun."
            ),
            ApotekCanon(
                R.drawable.avifavir,
                "Avifar",
                "Avifavir adalah obat antivirus yang mengandung favipiravir. Obat ini sudah mendapatkan izin penggunaan darurat dari Badan Pengawas Obat dan Makanan (BPOM) RI untuk digunakan dalam pengobatan COVID-19, yaitu pada pasien berusia 18 tahun ke atas dengan gejala ringan hingga sedang."

            ),
            ApotekCanon(
                R.drawable.attapulgite,
                "Attapulgite",
                "Attapulgite adalah obat untuk meredakan diare. Walaupun termasuk dalam obat bebas yang bisa dibeli tanpa resep dokter, obat ini perlu digunakan sesuai anjuran dokter agar lebih aman."
            )
        )
        val recycleView=findViewById<RecyclerView>(R.id.rv_apotekcanon)
        recycleView.layoutManager=LinearLayoutManager(this)
        recycleView.setHasFixedSize(true)
        recycleView.adapter=ApotekCanonAdapter(this,apotekcanonlist){

        }
    }
}