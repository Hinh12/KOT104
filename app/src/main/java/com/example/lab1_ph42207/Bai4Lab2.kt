package com.example.lab1_ph42207

//class Bai4Lab2 {
//}
fun main () {
    val sv1 = SinhvienModel("Nguyen Van Long", "PH11341", 8f)

    val sv2 = SinhvienModel("Tran Tuan Anh", "PH12541", 9f)

    sv2.daTotNghiep = false
    sv2.tuoi = 22

    val sv3 = SinhvienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)

    val listSV = mutableListOf<SinhvienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    listSV.removeAt(listSV.size - 1)

    for (sinhvien in listSV) {
        println(sinhvien.getThongTin())
    }

    for (i in listSV.indices) {
        println("SV thu $i: \n ${listSV.get(i).getThongTin()}")
    }
}