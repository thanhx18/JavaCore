/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
 */
public class Bai18f {
    public static void main(String[] args) {
        int n, a;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        a = (int) sqrt(n);
        
        if((a*a) == n){
            System.out.println(n + " la so chinh phuong");
        }else{
            System.out.println(n + " khong phai so chinh phuong");
        }
    }
}
