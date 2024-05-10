package com.example.lab1_ph42207.Buoi3

class SinhVien(val hoTen: String, val tuoi: Int, val lop: String)

class TheMuon(val maPhieuMuon: Int, val ngayMuon: Int, val hanTra: Int, val soHieuSach: Int, val sinhVien: SinhVien)

class QuanLyThuVien {
    private val danhSachTheMuon = mutableListOf<TheMuon>()

    fun themTheMuon(theMuon: TheMuon) {
        danhSachTheMuon.add(theMuon)
    }

    fun xoaTheMuon(maPhieuMuon: Int) {
        val theMuon = danhSachTheMuon.find { it.maPhieuMuon == maPhieuMuon }
        theMuon?.let {
            danhSachTheMuon.remove(it)
        }
    }

    fun hienThiDanhSachTheMuon() {
        if (danhSachTheMuon.isEmpty()) {
            println("Danh sách thẻ mượn trống.")
        } else {
            println("Danh sách thẻ mượn:")
            for (theMuon in danhSachTheMuon) {
                println("Mã phiếu mượn: ${theMuon.maPhieuMuon}")
                println("Ngày mượn: ${theMuon.ngayMuon}")
                println("Hạn trả: ${theMuon.hanTra}")
                println("Số hiệu sách: ${theMuon.soHieuSach}")
                println("Thông tin sinh viên:")
                println("Họ tên: ${theMuon.sinhVien.hoTen}")
                println("Tuổi: ${theMuon.sinhVien.tuoi}")
                println("Lớp: ${theMuon.sinhVien.lop}")
                println()
            }
        }
    }
}

// Sử dụng các lớp và phương thức đã xây dựng
fun main() {
    val quanLyThuVien = QuanLyThuVien()

    val sinhVien1 = SinhVien("Nguyen Van A", 20, "12A")
    val theMuon1 = TheMuon(1, 1, 7, 123, sinhVien1)
    quanLyThuVien.themTheMuon(theMuon1)

    val sinhVien2 = SinhVien("Tran Thi B", 21, "11B")
    val theMuon2 = TheMuon(2, 3, 9, 456, sinhVien2)
    quanLyThuVien.themTheMuon(theMuon2)

    quanLyThuVien.hienThiDanhSachTheMuon()

    quanLyThuVien.xoaTheMuon(1)
    println("Danh sách thẻ mượn còn lại sau khi xóa:")
    quanLyThuVien.hienThiDanhSachTheMuon()
}