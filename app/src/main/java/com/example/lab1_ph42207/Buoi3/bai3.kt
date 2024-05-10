package com.example.lab1_ph42207.Buoi3

import com.example.lab1_ph42207.SinhvienModel

//class bai3 {
//}

//fun main () {
//
//    val soA = 5
//    var soB = 10
//
//    with(soB) {
//        soB = this.inc()
//        println("Số B: $soB")
//    }
//
//    val sv1 = SinhvienModel("Long", "PH11321", 8f)
//    sv1.apply {
//        tenSV = "Tuan"
//        diemTB = 9f
//    }
//    println(sv1)
//
//    val luyThuaBac3CuaA = soA.let {
//        val kq = it * it * it
//        kq
//    }
//
//    val title : String? = "Buổii 3 - Android Kotlin"
//    val length = title?.run {
//        if (isEmpty()) {
//            0
//        } else {
//            length
//        }
//    }
//
//    println("Do dai chuoi $title = $length")
//
//    println(luyThuaBac3CuaA)
//
//    println("Tong 2 so $soA va $soB = ${tinhTong(soA, soB)}")
//    println("Tich 2 so $soA va $soB = ${phepNhan(soA, soB)}")
//    println("Thuong 2 so $soA va $soB = ${phepChia(soA.toFloat(), soB.toFloat()) ()}")
//
//    println("Lũy thừa của số $soA = ${luyThua(soA)}")
//}
//
//val tinhTong = {soA: Int, soB: Int -> (soA + soB)}
//
//val phepNhan : (Int, Int) -> Int
//        = {soA: Int, soB: Int -> (soA * soB)}
//
//val luyThua : (Int) -> Int = { it * it }
//
//val phepChia = {soA: Float, soB: Float -> {
//    if (soB == 0f) {
//        "Số bị chia phải khác 0!"
//    } else {
//        val kq = soA / soB
//        kq
//    }
//}
//}


fun main () {
    // khai báo va su dung lambda function
    val soA : Int? = 5
    val soB : Int? = 10
    val tong = tinhTong(soA!!, soB!!)
    println("Tổng 2 số $soA và $soB = $tong")

    println("Hiệu 2 só $soA và $soB = ${tinhHieu(soA, soB)}")

    println("Bình phương $soA = ${binhPhuong(soA)}")

    println("Thương 2 số $soA và $soB = ${tinhThuong(soA.toFloat(), soB.toFloat()) ()}")

    val tenSV = "nguyen van long"
    println("In hoa chuỗi $tenSV = ${inHoa(tenSV)}")
}

val inHoa: (String) -> String = String::uppercase


val tinhTong : (Int, Int) -> Int
        = {soA: Int, soB: Int -> (soA + soB)}

val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
    if (soB == 0f) {
        "só bị chia phải khác 0!"
    } else {
        val c = soA / soB
        c
    }

}
}