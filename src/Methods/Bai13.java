/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Nhập số nguyên n. Viết hàm tìm chữ số nhỏ nhất của số nguyên dương n (n > 0)
 */
public class Bai13 {
    public static int min(int n){
        int min = 9;
        for(;n > 0;n /= 10){
            int temp = n%10;
            if(temp < min){
                min = temp;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println("So nho nhat cua so " + n + " = " + min(n));
    }
}
