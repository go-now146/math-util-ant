/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimnoan.mathutil.core;

/**
 *
 * @author vutha
 */
//Đây là class mô phỏng lại các hàm tiện ích/ dùng chung cho mọi 
//class khác, mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dung chung, thưởng được thiết kế là static
public class MathUtil {

    public static final double PI = 3.1415;

    //Hàm tiện ích tính n! = 1.2.3..n
    //Lưu ý/quy ước
    //Không tính giai thừa số âm
    //0! =1!=1
    //Vì giai thừa tăng cực nhanh, nên 21! đã vượt quá 18 số 0
    //tràn kiểu long
    //Ta không tính 21! trở lên 
    //Illegal là kh hợp pháp nếu đưa vào sai sẽ chửi 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n.n must be between 0..20");
        }// hàm dừng kh cần return
        
        if (n == 0 || n == 1) {
            return 1;
        }
        //sống sót đến đây, sure n= 2..20!!
        //Chơi for hoặc đệ quy - recursion
        //CẤM KHÔNG XÀI ELSE NỮA KHI HÀM ĐÃ CÓ RETURN PHÍA TRƯỚC
        long product = 1; //biến cộng dồn, nhân dồn, biến con heo đất, dồn vào
        //acc/accmulation/gửi góp
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;

    }
}
//CODING CONVENTION: QUY TẮC VIẾT CODE CTY ÉP PHẢI THEO!!!
//ALT-SHIFT-F format



//HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
//LÀ KĨ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG
//CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
//TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn
//các bộ kiểm thử/viết luôn các test case/viết luôn các đoạn 
//code dùng thử hàm/class để kiểm tra tính đúng đắn của hàm/class

//viết code kèm với viết test cases
//viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//development  driven                  test
//SAU KHI CÓ ĐƯỢC TÊN HÀM (CHỈ TÊN HÀM MÀ THÔI)
//TA VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM
//CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
//SAU ĐÓ TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG
//QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG diễn ra liên tục(cycle)