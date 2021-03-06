/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays1D;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Liệt kê
các phần tử là số chính phương
 */
public class Bai6 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void inputArray(int []array){
        for(int i = 0; i < array.length;i++){
            System.out.print("a[" + i + "]= ");
            array[i] = sc.nextInt();
        }
    }
    public static void outputArray(int []array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");
        }
    }
    public static boolean isSquareNumber(int n){
        int a;
        a = (int) sqrt(n);
        if(n == a*a){
            return true;
        }
        return false;
    }
    public static void outputSquareNumber(int []array){
        for(int i = 0;i < array.length;i++){
            if(isSquareNumber(array[i])){
                System.out.print(array[i] + "; ");
            }
        }
    }
    public static void main(String[] args) {
        int n;
        
        do{
            System.out.print("nhap so phan tu co trong mang = ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Input again n > 0");
            }
        }while(n <= 0);
        
        int []array = new int[n];
        
        inputArray(array);
        System.out.println("Mang vua nhap: ");
        outputArray(array);
        System.out.println("Cac phan tu la so chinh phuong: ");
        outputSquareNumber(array);
    }
}
