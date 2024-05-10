package com.example.lab1_ph42207

//class Lab2 {
//}

fun main() {

    do {
        println("Nhap masv: ")

        var masv: String? = null
        var tenSV: String?

        //val tenSV : String = null

        var s = readLine()
        if (s != null) masv = s.toString()
        tenSV = getTenSV(masv!!)
        println("Ten Sinh Vien vou ma $masv la : $tenSV ")
        print("Tiep khong?(Y/N):")
        s = readLine()
        if (s == "N")
            break;
    }while (true)
    println("Ket thuc chuong trinh")
}


val danhsachSV: Map<String, String> =
    mutableMapOf("PH42207" to "Nguyen Van Hinh", "PH32222" to "Nguyen ")

fun getTenSV(masv: String): String? {
    val tenSV = danhsachSV.get(masv)
    return tenSV
}
