/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author genharunari
 * Tạo bảng số như dưới
0 1 2 3 4 5 6 7 8 9
10 11 12 13 14 15 16 17 18 19
…
90 91 92 93 94 95 96 97 98 99
 * 
 */
public class Bai7w {
    public static void main(String[] args) {
        int i = 0; 
        
        while(i <= 99){
            if(i%10 == 0 && i != 0){
                System.out.println("");
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
