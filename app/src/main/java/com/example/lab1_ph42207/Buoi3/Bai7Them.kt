package com.example.lab1_ph42207.Buoi3

import java.util.Scanner

//class Bai7Them {
//}

// Khai báo lớp Nguoi để quản lý thông tin cá nhân
open class Nguoi(
    val hoTen: String,
    val tuoi: Int,
    val queQuan: String,
    val maSo: String
)

// Khai báo lớp CBGV kế thừa từ lớp Nguoi và quản lý thông tin của cán bộ giáo viên
class CBGV(
    hoTen: String,
    tuoi: Int,
    queQuan: String,
    maSo: String,
    val luongCung: Double,
    val luongThuong: Double,
    val tienPhat: Double
) : Nguoi(hoTen, tuoi, queQuan, maSo) {
    // Phương thức tính lương thực lĩnh
    fun tinhLuongThucLinh(): Double {
        return luongCung + luongThuong - tienPhat
    }
}

// Khai báo lớp quản lý danh sách cán bộ giáo viên
class QuanLyCBGV {
    private val danhSachCBGV = mutableListOf<CBGV>()

    // Phương thức thêm một cán bộ giáo viên mới
    fun themCBGV(cbgv: CBGV) {
        danhSachCBGV.add(cbgv)
    }

    // Phương thức xoá một cán bộ giáo viên theo mã số giáo viên
    fun xoaCBGV(maSo: String) {
        val cbgvToRemove = danhSachCBGV.find { it.maSo == maSo }
        cbgvToRemove?.let { danhSachCBGV.remove(it) }
    }

    // Phương thức in thông tin và lương thực lĩnh của tất cả cán bộ giáo viên
    fun inThongTinVaLuong() {
        danhSachCBGV.forEach { cbgv ->
            println("Thông tin của cán bộ giáo viên:")
            println("Họ tên: ${cbgv.hoTen}")
            println("Tuổi: ${cbgv.tuoi}")
            println("Quê quán: ${cbgv.queQuan}")
            println("Mã số: ${cbgv.maSo}")
            println("Lương thực lĩnh: ${cbgv.tinhLuongThucLinh()}")
            println()
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    // Tạo đối tượng quản lý danh sách cán bộ giáo viên
    val quanLyCBGV = QuanLyCBGV()

    println("Nhập thông tin cho giáo viên:")
    print("Họ tên: ")
    val hoTen = scanner.nextLine()
    print("Tuổi: ")
    val tuoi = scanner.nextInt()
    scanner.nextLine() // consume the newline character
    print("Quê quán: ")
    val queQuan = scanner.nextLine()
    print("Mã số: ")
    val maSo = scanner.nextLine()
    print("Lương cứng: ")
    val luongCung = scanner.nextDouble()
    print("Lương thưởng: ")
    val luongThuong = scanner.nextDouble()
    print("Tiền phạt: ")
    val tienPhat = scanner.nextDouble()

    val cbgv = CBGV(hoTen, tuoi, queQuan, maSo, luongCung, luongThuong, tienPhat)
    quanLyCBGV.themCBGV(cbgv)

    println("Thông tin của cán bộ giáo viên sau khi thêm:")
    // In thông tin và lương thực lĩnh của tất cả cán bộ giáo viên
    quanLyCBGV.inThongTinVaLuong()

    // Xoá một cán bộ giáo viên theo mã số
    quanLyCBGV.xoaCBGV("GV002")

    println("Thông tin của cán bộ giáo viên sau khi xóa:")
    // In lại thông tin và lương thực lĩnh sau khi xoá
    quanLyCBGV.inThongTinVaLuong()
}



//////////////////////////////////////
// Yêu cầu 1: Xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi giáo viên.
//open class Nguoi(val hoTen: String, val tuoi: Int, val queQuan: String, val maSo: String)
//
//// Yêu cầu 2: Xây dựng lớp CBGV để quản lý các thông tin của các cán bộ giáo viên.
//class CBGV(
//    hoTen: String, tuoi: Int, queQuan: String, maSo: String,
//    val luongCung: Double, val luongThuong: Double, val tienPhat: Double
//) : Nguoi(hoTen, tuoi, queQuan, maSo) {
//
//    var luongThucLinh: Double = 0.0
//
//    // Yêu cầu 4: Tính lương thực lĩnh cho giáo viên: Lương thực = Lương cứng + lương thưởng – lương phạt.
//    fun tinhLuongThucLinh() {
//        luongThucLinh = luongCung + luongThuong - tienPhat
//    }
//}
//
//// Yêu cầu 3: Xây dựng các phương thức thêm, xoá các cán bộ giáo viên theo mã số giáo viên.
//class QuanLyCBGV {
//    val danhSachCBGV = mutableListOf<CBGV>()
//
//    // Phương thức thêm cán bộ giáo viên
//    fun themCBGV(giaoVien: CBGV) {
//        danhSachCBGV.add(giaoVien)
//    }
//
//    // Phương thức xoá cán bộ giáo viên theo mã số giáo viên
//    fun xoaCBGV(maSo: String) {
//        danhSachCBGV.removeAll { it.maSo == maSo }
//    }
//}
//
//fun main() {
//    // Tạo danh sách quản lý cán bộ giáo viên
//    val quanLy = QuanLyCBGV()
//
//    // Thêm cán bộ giáo viên vào danh sách
//    val giaoVien1 = CBGV("Nguyen Van A", 35, "Hanoi", "GV001", 5000000.0, 1000000.0, 500000.0)
//    val giaoVien2 = CBGV("Tran Thi B", 40, "HCMC", "GV002", 6000000.0, 1500000.0, 700000.0)
//    quanLy.themCBGV(giaoVien1)
//    quanLy.themCBGV(giaoVien2)
//
//    // Tính lương thực lĩnh cho từng giáo viên và hiển thị thông tin
//    for (giaoVien in quanLy.danhSachCBGV) {
//        giaoVien.tinhLuongThucLinh()
//        println("Tên: ${giaoVien.hoTen}, Mã số: ${giaoVien.maSo}, Lương thực lĩnh: ${giaoVien.luongThucLinh}")
//    }
//
//    // Xoá một giáo viên theo mã số
//    quanLy.xoaCBGV("GV001")
//
//    // Hiển thị danh sách cán bộ giáo viên sau khi xoá
//    println("Danh sách sau khi xoá:")
//    for (giaoVien in quanLy.danhSachCBGV) {
//        println("Tên: ${giaoVien.hoTen}, Mã số: ${giaoVien.maSo}, Lương thực lĩnh: ${giaoVien.luongThucLinh}")
//    }
//}
