/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2D;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Nhập ma trận n hàng, m cột (n > 0, m > 0). Tính tổng các giá trị nằm trên biên của
ma trận
 */
public class Bai38 {
    public static Scanner sc = new Scanner(System.in);
    public static void input(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }        
    }
    public static void output(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int sumNumberBien(int [][]a, int row, int col){
        int sum = 0;
        for(int i = 0; i < row; i++){
            sum = sum + a[0][i];
            sum = sum + a[col - 1][i];
        }
        for(int j = 1; j < col - 1; j++){
            sum = sum + a[j][0];
            sum = sum + a[j][row - 1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int row, col;
        
        do{
            System.out.print("Row = ");
            row = sc.nextInt();
            if(row <= 0){
                System.out.println("Input again Row > 0 !!!");
            }
        }while(row <= 0);
        
        do{
            System.out.print("Column = ");
            col = sc.nextInt();
            if(row <= 0){
                System.out.println("Input again Column > 0 !!!");
            }
        }while(col <= 0);
        
        int [][]a = new int[row][col];
        input(a);
        System.out.println("Mang vua nhap: ");
        output(a);
        System.out.println("Tong cac gia tri tren bien: " + sumNumberBien(a, row, col));
    }
}
