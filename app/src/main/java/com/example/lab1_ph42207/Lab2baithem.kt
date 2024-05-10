package com.example.lab1_ph42207

import java.util.Scanner

data class Student(
    var name: String = "",
    var mssv: String = "",
    var diemTB: Float = 0.0f,
    var daTotNghiep: Boolean? = null,
    var tuoi: Int? = null
)

class StudentManager {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun updateStudent(index: Int, updatedStudent: Student) {
        if (index in 0 until students.size) {
            students[index] = updatedStudent
        } else {
            println("Invalid index")
        }
    }

    fun removeStudent(index: Int) {
        if (index in 0 until students.size) {
            students.removeAt(index)
        } else {
            println("Invalid index")
        }
    }

    fun displayStudents() {
        if (students.isEmpty()) {
            println("No students found.")
        } else {
            println("List of Students:")
            students.forEachIndexed { index, student ->
                println("${index + 1}. Name: ${student.name}, MSSV: ${student.mssv}, Điểm TB: ${student.diemTB}, Đã tốt nghiệp: ${student.daTotNghiep}, Tuổi: ${student.tuoi}")
            }
        }
    }

    // Phương thức getter cho danh sách sinh viên
    fun getStudents(): List<Student> {
        return students.toList()
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val manager = StudentManager()

    while (true) {
        println("1. Thêm sinh viên")
        println("2. Sửa thông tin sinh viên")
        println("3. Xóa sinh viên")
        println("4. Xem danh sách sinh viên")
        println("5. Thoát")

        print("Chọn chức năng: ")
        when (scanner.nextInt()) {
            1 -> {
                println("Nhập thông tin sinh viên mới:")
                print("Tên: ")
                val name = readLine() ?: ""
                print("MSSV: ")
                val mssv = readLine() ?: ""
                print("Điểm TB: ")
                val diemTB = scanner.nextFloat()
                print("Đã tốt nghiệp? (true/false): ")
                val daTotNghiep = scanner.nextBoolean()
                print("Tuổi: ")
                val tuoi = scanner.nextInt()

                manager.addStudent(Student(name, mssv, diemTB, daTotNghiep, tuoi))
            }
            2 -> {
                print("Nhập chỉ số của sinh viên cần sửa: ")
                val index = scanner.nextInt()
                if (index in 1..manager.getStudents().size) {
                    println("Nhập thông tin mới cho sinh viên:")
                    print("Tên: ")
                    val name = readLine() ?: ""
                    print("MSSV: ")
                    val mssv = readLine() ?: ""
                    print("Điểm TB: ")
                    val diemTB = scanner.nextFloat()
                    print("Đã tốt nghiệp? (true/false): ")
                    val daTotNghiep = scanner.nextBoolean()
                    print("Tuổi: ")
                    val tuoi = scanner.nextInt()

                    manager.updateStudent(index - 1, Student(name, mssv, diemTB, daTotNghiep, tuoi))
                } else {
                    println("Chỉ số không hợp lệ.")
                }
            }
            3 -> {
                print("Nhập chỉ số của sinh viên cần xóa: ")
                val index = scanner.nextInt()
                if (index in 1..manager.getStudents().size) {
                    manager.removeStudent(index - 1)
                } else {
                    println("Chỉ số không hợp lệ.")
                }
            }
            4 -> manager.displayStudents()
            5 -> {
                println("Thoát chương trình.")
                return
            }
            else -> println("Chức năng không hợp lệ.")
        }
        println()
    }
}
