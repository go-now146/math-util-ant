/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimnoan.mathutil.core;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Admin7
 */
public class MathUtilTest {
   //Ta đi test ngoại lệ, tức so sánh/đo lường xem ngoại lệ
    //có xuất hiện hay không khi ta đưa data cà chớn, n <0 || n > 20
    // thay vì so sánh expected value vs. actual value
    // LÚC NÀY TA SẼ ĐI SO SÁNH// ƯỚC LƯỢNG XRM NGOẠI LỆ CÓ XUẤT HIỆN NHƯ KÌ VỌNG 
    // NẾU NGOẠI LỆ XH NHƯ KÌ VỌNG, THÌ MÀU XANH - THẤY MÀU ĐỎ NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    
    @Test(expected = Exception.class)
     public void testFactorialGivenWrongArgumentThrowsException(){
        
        //Test case #3: đưa data cà chớn, n âm, n quá lớn 
        //              hàm dược thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        // thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh 
        
        System.out.println("Hope to see the Exception| Illegal Argument Exception");
        MathUtil.getFactorial(-5);
        
        
                
    }
    
    
    
    
    @Test
      public void testFactorialGivenRightArgumentReturnsWell2(){ 
                       
                //Test case #4: n = 3, hy vọng hàm trả về 6, thực tế??
                Assert.assertEquals(6, MathUtil.getFactorial(3));
                        
                        
                        
                //Test case #5: n = 4, hy vọng hàm trả về 25, thực tế??       
                 Assert.assertEquals(24, MathUtil.getFactorial(4));
                 
                 
                //Test case #:6 n = 5, hy vọng hàm trả về 120, thực tế??       
                 Assert.assertEquals(120, MathUtil.getFactorial(5));
                              
                
               
           }
 
 
        //@ Test ra lệnh cho thư viện JUnit mà mình đã add/import tự động 
        //genarate ra cái hàm public static void main()
        //biến hàm tryJUnitComparison() thành hàm main()
        // và gửi main() này cho JVM chạy - Java Vitural MAchine
        //@Test ~~~ main()
        // k @Test thì class kh có main(), lấy gì mà chạy no runable method
    
    
           @Test   //coding convention - quy tắc viết code
                    // Tên hàm kiểm thử/tên hàm của test script
                    // phải nói lên ý nghĩa của việc kiểm thử 
                    // tình huống này, ta muốn test hàm getF() tham số tử tế
                    //n = 0... 20!!!
           public void testFactorialGivenRightArgumentReturnsWell(){
               //Test case số  #1: n = 0, hy vọng hàm trả về 1
               //                         THỰC tế hàm trả về mấy, đoán xem!!!
               long expected = 1;
               long actual = MathUtil.getFactorial(0); // hàm chạy thì mới biết
                        //so sánh giữa expected vs .actual, máy tự so. không cần 
                       //sout() khổ cực
                Assert.assertEquals(expected, actual);
                       
                       
                //Test case #2: n = 1, hy vọng hàm trả về 1, thực tế??
                Assert.assertEquals(1, MathUtil.getFactorial(1));
                        
                        
                        
                 //Test case #3: n = 2, hy vọng hàm trả về 2, thực tế??       
                 Assert.assertEquals(2, MathUtil.getFactorial(2));
                              
                
               
           }
           
             @Test 
    public void tryJUnitComparison(){
        
        //Hàm này thử nghiệm việc so sánh expected & .actual
        //coi sai đúng ra màu như thế nào !!!!
        //ta đang xài hàm của thư viện JUnit nhưng kh xài bừa
        //bãi mà phải viết theo quy tắc định trước 
        //quy tắc định trước nằm ở @ - annotation
        
        
        Assert.assertEquals(100, 100);
    
    }
    
}

//Xài hàm theo quy tắc 

//CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM 
//CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL
//Có những lệnh so sáng giữa EXPECTED và ACTUAL
//Giống mình đã làm test bên MAIN()
// nhưng khác ở chỗ, SAI -> MÀU ĐỎ, ĐÚNG -> MÀU XANH 
// mắt kh càn nhìn các dòng output từ hàm system.out cho mất sức
//mắt giờ chỉ nhìn 2 màu XANH ĐỎ 
// muốn có được điều này ta se dùng thêm các UNIT TESTING FRAMEWORK
//Ví dụ: JUnit, TestNG(Java)
//       xUnit, MSTest, NUnit( C#)
//       PHPUnit (PHP)
//       .....


//VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING
// ĐOẠN CODE TRONG CLASS NÀY DUNG JUNIT/UNIT TESTING FRAMEWORK
//ĐOẠN CODE KIỂM THỬ NÀY ĐƯỢC GỌI LÀ: TEST SCRIPT
//Code dùng để test code (chính) gọi là test script
//Test script là các đoạn code được viết ra để test code chính (DAO
// DTO, Controller, API...)
//Muốn test thì cần phải phác thảo các TEST CASE
// Test Script sẽ sử dụng các Test Case
// Ví dụ: Viết code để test hàm getFactorial() với các case
// n = -5, 0, 1....


//QUY TẮC XANH ĐỎ:
// *MÀU XANH KHI TẤT CẢ CÁC TEST CASE CÙNG PHẢI LÀ XANH, tức là expected == actual 
//cho tất cả các case các tình huống test


// *MÀU ĐỎ: CHỈ CẦN 1 TRONG NHỮNG TEST CASE BỊ SAI,
// CHỈ CẦN 1 CÁI EXPECTED != ACTUAL, KẾT LUẬN MẠNH TAY/GẮT: HÀM SAI QUÁ SAI

//Ý nghĩa của quy tắc: nếu đã test, nếu đã liệt kệ các test case, thì chúng 
// phải đúng hết còn chỉ cần 1 thằng sai, hàm kh ổn định về việc return -> hàm sai
// ĐÚNG ĐÚNG hết , SAI CHỈ CẦN 1 THẰNG

//EXPECTED == ACTUAL -> CASE ĐÚNG, TEST CASE PASSED
//EXPECTED != ACTUAL -> CASE FAILLED
        // NẾU EXPEXTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÍ SAI, BUG
        // CŨNG CÓ KHI EXPECTED, CÁI TA KÌ VỌNG quá nhiều và  BỊ SAI với kết quả dự đoán !!! LỖI DO QC TÍNH Toán 
        // BẰNG TAY BỊ SAI !!

