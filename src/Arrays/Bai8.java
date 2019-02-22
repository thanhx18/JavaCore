/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tìm số
chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1
 */
public class Bai8 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArray(int []array){
        for(int i = 0; i < array.length;i++){
            System.out.print("(" + i + ") = ");
            array[i] = sc.nextInt();
        }
    }
    public static void outputArray(int []array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");
        }
    }
    public static int soChanCuoiCungArray(int []array){
        for(int i = array.length - 1; i >= 0; i--){
            if(array[i] % 2 == 0){
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        int []array;
        
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Input again n > 0");
            }
        }while(n <= 0);
        
        array = new int[n];
        inputArray(array);
        System.out.println("Mang vua nhap: ");
        outputArray(array);
        System.out.println("\nSo chan cuoi cung trong mang: " + soChanCuoiCungArray(array));
    }
}
