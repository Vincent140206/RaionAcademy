package com.example.raionacademy

data class AppEntity(
    val name: String,
    val rating: String,
    val image: String
)

data class AppDetail(
    val name: String,
    val rating: String,
    val image: String,
    val harga: String,
    val deskripsi: String
)

object AppObject {
    val sepatu = AppEntity(
        name = "Sepatu Lari",
        rating = "4.6 Stars",
        image = "https://www.tas.id/wp-content/uploads/JSKB33-IDR.-184.000-MATERIAL-PU-COLOR-BLACK-WEIGHT-500GR-SIZE-2930313233.jpg"
    )
    val celana = AppEntity(
        name = "Celana Pendek",
        rating = "4.1 Stars",
        image = "https://nahproject.com/cdn/shop/products/Basik_Short_Pants_Olive_1_grande.jpg?v=1670487524.jpg"
    )
    val kaos = AppEntity(
        name = "T-Shirt Kece",
        rating = "4.5 Stars",
       image = "https://dynamic.zacdn.com/ciDQh1cTek1Bf74ik4O8YQxapHU=/filters:quality(70):format(webp)/https://static-id.zacdn.com/p/jipclo-7775-0635823-4.jpg"
    )
    val earbuds = AppEntity(
        name = "Earbuds - R82",
        rating = "4.2 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4YIJrN42cmNOIczxMVHavoVJeWVpzonAfoQ&s.jpg"
    )
    val keyboard = AppEntity(
        name = "Mechanical Keyboard",
        rating = "4.8 Stars",
        image = "https://resource.logitechg.com/w_692,c_lpad,ar_4:3,q_auto,f_auto,dpr_1.0/d_transparent.gif/content/dam/gaming/en/products/g413-se/g413-se-gallery-1-new.png?v=1.jpg"
    )
    val handphone = AppEntity(
        name = "Handphone 128 GB",
        rating = "4.1 Stars",
        image = "https://static.retailworldvn.com/Products/Images/12220/318039/smartphone-iphone-15-plus-6gb-256gb-yellow-thumb-600x600.jpg"
    )
    val laptop = AppEntity(
        name = "Laptop Geming",
        rating = "4.1 Stars",
        image = "https://images.tokopedia.net/img/JFrBQq/2024/1/16/4b9cc476-f5fc-45ee-a469-8b077a51d5e7.jpg"
    )
    val vga = AppEntity(
        name = "RTX 3060 Ti",
        rating = "4.9 Stars",
        image = "https://dlcdnwebimgs.asus.com/gain/ab20b970-c683-4be5-b3ca-ad0f5f759beb/.png"
    )
    val meja = AppEntity(
        name = "Meja 100x150 Cm",
        rating = "3.9 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa1nQ4ItZOHlKermMyCdyjHMaRdSCdR7hInQ&s.png"
    )
    val mio = AppEntity(
        name = "Mio Anggorawwww",
        rating = "4.1 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE1TZL4AQTZOBQH9MLq9gkXGbg3F9JJlpXQQ&s.jpg"
    )
    val jamtangan = AppEntity(
        name = "Jam Tangan Lelaki",
        rating = "4.1 Stars",
        image = "https://dynamic.zacdn.com/luS9V354f6xYOEFqBa2qFizcDuM=/filters:quality(70):format(webp)/https://static-id.zacdn.com/p/chronox-3863-4919493-1.jpg"
    )
    val tipex = AppEntity(
        name = "Tipe-x Trondol",
        rating = "4.2 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXkpr_oMOqiHEBYAvefxolyC6sKtecmk4tYA&s.jpg"
    )
    val horeg = AppEntity(
        name = "Horegggggg",
        rating = "4.7 Stars",
        image = "https://asset-2.tstatic.net/suryamalang/foto/bank/images/Sound-Horeg-Malang.jpg"
    )
    val parfum = AppEntity(
        name = "Pucelle Perfume",
        rating = "4.0 Stars",
        image = "https://images.tokopedia.net/img/cache/700/VqbcmM/2023/4/4/b37d01a1-9e13-4d89-9cd5-e7b5ac20faac.jpg"
    )
}

object ProductDetail {
    val sepatu = AppDetail(
        name = "Sepatu Lari",
        rating = "4.6 Stars",
        image = "https://www.tas.id/wp-content/uploads/JSKB33-IDR.-184.000-MATERIAL-PU-COLOR-BLACK-WEIGHT-500GR-SIZE-2930313233.jpg",
        harga = "RP 120.000",
        deskripsi = "Dirancang khusus untuk mendukung aktivitas lari Anda dengan kenyamanan dan performa maksimal. Terbuat dari material ringan dan bernapas, sepatu ini menjaga kaki tetap sejuk selama latihan intensif. Solnya dilengkapi dengan teknologi bantalan canggih yang memberikan penyerapan kejut optimal, mengurangi risiko cedera, serta meningkatkan stabilitas."
    )
    val celana = AppDetail(
        name = "Celana Pendek",
        rating = "4.1 Stars",
        image = "https://nahproject.com/cdn/shop/products/Basik_Short_Pants_Olive_1_grande.jpg?v=1670487524.jpg",
        harga = "Rp 45.000",
        deskripsi = "Terbuat dari bahan ringan dan breathable, celana ini ideal untuk cuaca panas atau aktivitas santai. Dengan desain modern dan potongan yang pas, celana ini memberikan kebebasan bergerak tanpa mengorbankan penampilan. Cocok untuk olahraga ringan, jalan-jalan, atau bersantai di rumah. Tersedia dalam berbagai warna dan ukuran, sempurna untuk melengkapi gaya kasual Anda!"
    )
    val kaos = AppDetail(
        name = "T-Shirt Kece",
        rating = "4.5 Stars",
        image = "https://dynamic.zacdn.com/ciDQh1cTek1Bf74ik4O8YQxapHU=/filters:quality(70):format(webp)/https://static-id.zacdn.com/p/jipclo-7775-0635823-4.jpg",
        harga = "Rp 75.999",
        deskripsi = "Dibuat dari bahan katun lembut dan breathable, kaos ini nyaman dipakai sepanjang hari. Dengan potongan yang pas dan desain minimalis, cocok untuk berbagai aktivitas, mulai dari bersantai di rumah hingga hangout bersama teman. Tersedia dalam berbagai warna dan ukuran, kaos ini adalah item wajib untuk melengkapi koleksi pakaian kasual Anda!"
    )
    val earbuds = AppDetail(
        name = "Earbuds - R82",
        rating = "4.2 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4YIJrN42cmNOIczxMVHavoVJeWVpzonAfoQ&s.jpg",
        harga = "Rp 259.000",
        deskripsi = "Dengan konektivitas Bluetooth terbaru, pairing cepat dan stabil menjadi keunggulan, sementara fitur noise cancellation membantu Anda fokus tanpa gangguan. Baterai tahan lama memberikan hingga 12 jam pemakaian, ditambah casing pengisi daya portabel untuk kenyamanan maksimal."
    )
    val keyboard = AppDetail(
        name = "Mechanical Keyboard",
        rating = "4.8 Stars",
        image = "https://resource.logitechg.com/w_692,c_lpad,ar_4:3,q_auto,f_auto,dpr_1.0/d_transparent.gif/content/dam/gaming/en/products/g413-se/g413-se-gallery-1-new.png?v=1.jpg",
        harga = "Rp 399.999",
        deskripsi = "Dirancang untuk menghadirkan pengalaman mengetik dan gaming yang optimal. Dengan switch mekanis berkualitas tinggi, keyboard ini menawarkan responsivitas cepat, tactile feedback, dan daya tahan hingga jutaan penekanan tombol."
    )
    val handphone = AppDetail(
        name = "Handphone 128 GB",
        rating = "4.1 Stars",
        image = "https://static.retailworldvn.com/Products/Images/12220/318039/smartphone-iphone-15-plus-6gb-256gb-yellow-thumb-600x600.jpg",
        harga = "Rp 5.456.321",
        deskripsi = "Layar berkualitas tinggi dengan resolusi tajam dan warna hidup memberikan pengalaman visual yang memukau, baik untuk menonton video maupun menjelajah media sosial. Kamera beresolusi tinggi dilengkapi fitur AI menghasilkan foto dan video yang jernih dan detail, bahkan dalam kondisi cahaya rendah."
    )
    val laptop = AppDetail(
        name = "Laptop Geming",
        rating = "4.1 Stars",
        image = "https://images.tokopedia.net/img/JFrBQq/2024/1/16/4b9cc476-f5fc-45ee-a469-8b077a51d5e7.jpg",
        harga = "Rp 12.545.000",
        deskripsi = "Layar 16 inci dengan resolusi 4K dan refresh rate tinggi (144Hz) memberikan visual tajam dan respons cepat, menjadikan pengalaman bermain lebih imersif. Sistem pendingin canggih menjaga suhu tetap optimal meski dalam sesi gaming intensif."
    )
    val vga = AppDetail(
        name = "RTX 3060 Ti",
        rating = "4.9 Stars",
        image = "https://dlcdnwebimgs.asus.com/gain/ab20b970-c683-4be5-b3ca-ad0f5f759beb/.png",
        harga = "Rp 3.999.999",
        deskripsi = "VGA NVIDIA GeForce RTX 3060 Ti adalah kartu grafis yang dirancang untuk menghadirkan performa gaming dan kreativitas kelas atas. Berbasis arsitektur NVIDIA Ampere, GPU ini menawarkan 4864 CUDA cores dan memori GDDR6 8GB, memberikan kombinasi sempurna antara kecepatan, efisiensi daya, dan kemampuan multitasking."
    )
    val meja = AppDetail(
        name = "Meja 100x150 Cm",
        rating = "3.9 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa1nQ4ItZOHlKermMyCdyjHMaRdSCdR7hInQ&s.png",
        harga = "Rp 290.000",
        deskripsi = "Meja Kayu berukuran 150x100 cm ini menawarkan kombinasi sempurna antara keindahan alami dan fungsionalitas. Dibuat dari kayu solid berkualitas tinggi, meja ini memiliki permukaan halus dengan serat kayu yang terlihat jelas, memberikan sentuhan elegan pada ruang Anda."
    )
    val mio = AppDetail(
        name = "Mio Anggorawwww",
        rating = "4.1 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE1TZL4AQTZOBQH9MLq9gkXGbg3F9JJlpXQQ&s.jpg",
        harga = "Rp 9.021.142",
        deskripsi = "Mio Anggora adalah sepeda motor matic yang populer karena desainnya yang elegan dan performa yang andal. Dilengkapi dengan mesin berkapasitas [XX cc], Mio Anggora memberikan tenaga optimal untuk perjalanan harian, baik di jalanan perkotaan maupun jarak jauh."
    )
    val jamtangan = AppDetail(
        name = "Jam Tangan Lelaki",
        rating = "4.1 Stars",
        image = "https://dynamic.zacdn.com/luS9V354f6xYOEFqBa2qFizcDuM=/filters:quality(70):format(webp)/https://static-id.zacdn.com/p/chronox-3863-4919493-1.jpg",
        harga = "Rp 120.000",
        deskripsi = "Kombinasi sempurna antara gaya dan fungsionalitas. Didesain dengan bahan berkualitas tinggi, jam ini menawarkan ketahanan dan kenyamanan sepanjang hari. Dengan desain elegan dan modern, cocok digunakan dalam berbagai kesempatan, dari acara formal hingga santai."
    )
    val tipex = AppDetail(
        name = "Tipe-x Trondol",
        rating = "4.2 Stars",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXkpr_oMOqiHEBYAvefxolyC6sKtecmk4tYA&s.jpg",
        harga = "Rp 99.999",
        deskripsi = "Tipex Trondol adalah penghapus tinta yang praktis dan efektif untuk memperbaiki kesalahan penulisan pada kertas. Dengan bentuk stik yang mudah digenggam, Tipex Trondol menawarkan aplikasi yang bersih dan rapi tanpa meninggalkan noda atau bekas."
    )
    val horeg = AppDetail(
        name = "Horegggggg",
        rating = "4.7 Stars",
        image = "https://asset-2.tstatic.net/suryamalang/foto/bank/images/Sound-Horeg-Malang.jpg",
        harga = "Rp 50.000.000",
        deskripsi = "Sound Horeg adalah speaker portable dengan kualitas suara jernih dan bass yang kuat, dirancang untuk memberikan pengalaman audio terbaik dalam berbagai situasi. Dengan desain kompak dan mudah dibawa, Sound Horeg cocok untuk digunakan di dalam ruangan, di luar ruangan, atau saat bepergian."
    )
    val parfum = AppDetail(
        name = "Pucelle Perfume",
        rating = "4.0 Stars",
        image = "https://images.tokopedia.net/img/cache/700/VqbcmM/2023/4/4/b37d01a1-9e13-4d89-9cd5-e7b5ac20faac.jpg",
        harga = "Rp 46.000",
        deskripsi = "Pucelle Perfume adalah parfum elegan dengan kombinasi aroma yang memikat dan tahan lama. Dikenal karena keharumannya yang mewah, Pucelle Perfume dirancang untuk memberikan sentuhan kemewahan pada setiap momen. Dengan top notes yang segar dan floral, dipadukan dengan middle notes yang manis dan hangat, serta base notes yang kaya dan menggoda, parfum ini menciptakan keseimbangan sempurna antara keanggunan dan sensualitas."
    )
}