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
 * Nhập ma trận n hàng, m cột (n > 0, m > 0). Liệt kê các dòng có tổng lớn nhất
 */
public class Bai40 {
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
    public static int sumRow(int [][]a, int row){
        int sum = 0;
        for(int i = 0; i < a[row].length;i++){
            sum += a[row][i];
        }
        return sum;
    }
    public static int indexHasMaxSumRow(int [][]a){
        int row = 0;
        int maxSum = sumRow(a, row);
        
        for(int i = 1; i < a.length; i++){
            int sum = sumRow(a,i);
            if(sum > maxSum){
                row = i;
                maxSum = sum;
            }
        }
        return row + 1;
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
        int index = indexHasMaxSumRow(a);
        System.out.println("Dong co tong lon nhat: " + index);
    }
}
