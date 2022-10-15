/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimnoan.mathutil.core;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.kimnoan.mathutil.core.MathUtil.*; // đưa thẳng tên hàm vào
                                                                // .* thì import tất cả các hàm


/**
 *
 * @author Admin
 */

 @RunWith(value = Parameterized.class) // chơi theo kiểu tham số, 
                                        // mảng là khai báo nhiều biến cùng kiểu 
                                         // có bao nhiêu thì bấy nhiêu mảng, kh quan tâm bên trong mảng con 
 
    
public class MathUtilDDTTest {
     
     //1. Chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với Expected và 
     //                                     n dòng ứng với các test case
     
     //mảng Object, số thì dùng Wrepper class -class gói các primitive 
     //Integer -> int, Long -> long 
     
     
     @Parameterized.Parameters
     public static Object[][] initData() {
         int a[] = {5, 10, 15, 20, 25}; //Liệt kê các phẩn tử mảng cách nhau bởi dấu phẩy
//         int b[][] ={{1, 0},
//                     {1, 1},
//                     {2, 2},
//                     {6, 3},
//                     {24, 4},
//                     {120, 5},
//                     {720, 6}
 //                  };
         

    return new Integer[][] {{1, 0},
                            {1, 1},
                            {2, 2},
                            {6, 3},
                            {24, 4},
                            {120, 5},
                            {720, 6}
                            };
     }
    
      //Ta sẽ map/ánh xạ các cột của mỗi dòng, ví dụ dòng đầu tiên 
      //có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến expected, 0 vào biến n 
      //tương tự các hàm còn lại
     
     
     @Parameterized.Parameter(value = 0)
     public long expected; // map vào cột 0 của mảng
     
     
     @Parameterized.Parameter(value = 1)
     public int n; //map vào cột 1 mảng
     
     
     @Test  //kiểm thử các test case với data được trích ra từ mảng 
            // vào 2 biến tương ứng 
     
     public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtil.getFactorial(n) );
     }
     
     
     
    }
  
    
    //Phân tích cách ta viết code cho phần test hàm getF() hôm trước 
    //Assert.assertEquals(1, MathUtil.getFactorial(0)); lệnh dùng để test  
    
    //hàm/method. Lệnh này lawo đi lặp lại cho các data ta đău vào 
    //để kiểm tra các tình huống xài hàm/test case
    //Lát hồi ta thay data 1 0 thành các data tương ứng khác 
    // ví dụ 
    //Expected      n!
    //1             0 -> có ổn kh 
    //1             1
    //2             2
    //6             3
    //24            4
    //120           5
    //720           6
    //...........

    //Assert.assertEquals(???, MathUtil.getFactorial(???));
    //NẾU TA CÓ ĐƯỢC CÁCH NÀO ĐÓ, MÀ TÁCH ĐÁM DATA RIÊNG RA 1 CHỖ
    //SAU ĐÓ TỪ TỪ NHỒI/MỚM/FEED DATA NÀY VÀO CÂU LỆNH TEST HÀM Ở TRÊN
    //COI NHƯ CHỈ CẦN 1 LỆNH GỌI TEST HÀM, DATA CỨ THẾ TUẦN TỰ ĐẨY VÀO 
    //KĨ THUẬT TÁCH DATA RA KHỎI CÁC CÂU LỆNH TEST, SAU ĐÓ NHỒI NÓ VÔ 
    //CÁI CÂU LỆN TEST, GIÚP RÚT GỌN SỐ CÂU LỆNH TEST, GIÚP DỄ DUÀNG 
    //KIỂM TRA TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
    //KĨ THUẬT NÀY GỌI TÊN LÀ DDT - DATA DRIVEN TESTING 
    //Viết code kiểm thử theo hướng tách data
    //CÒN GỌI 1 TÊN KHÁC LÀ: KIỂM THỬ THEO KIỂU THAM SÔ HÓA - PARAMETERIZE
    //DẤU ??? ở câu lệnh gọi hàm chính là tên biến sẽ dùng để cảm nhận 
    //data từ tập data đã tách ra - CONVERT DATA THÀNH BIẾN 
    
    
    
    //Chơi với DDT ta cần 
    //Bộ data test - tách riêng 
    //Các tham số ứng vợi bộ data - chính là các biến dùng trích data ra
    // Gọi hàm kiểm thử xài các tham số

    //TOÀN BỘ CODE TRONG CLASS NÀY ĐƯỢC VIẾT RA ĐỂ DÙNG ĐỂ TEST CODE CHÍNH Ở
    // BÊN SRC PACKAGES
    // CODE ĐƯỢC VIẾT RA DÙNG ĐỂ ĐI TEST CODE KHÁC
    // THÌ CODE NÀY ĐƯỢC GỌI LÀ TEST SCRIPT 
    // 1 TEST SCRIPT SẼ CHỨA NHIỀU CODE ĐỂ TEST HÀM CHÍNH 
    // 1 TEST SCRIPT SẼ CHỨA NHIỀU TEST CASE
    //                              TEST CASE: CÁC TÌNH HUỐNG XÀI HÀM
    // 1 TEST SCRIPT CÓ THỂ XÀI DDT DỄ BẢO TRÒ CODE TEST
    // VIẾT, VIẾT CODE CHÍNH CÓ THỂ XÀI TDD
    
 /// nén tất cả các file  thành ... .jar

