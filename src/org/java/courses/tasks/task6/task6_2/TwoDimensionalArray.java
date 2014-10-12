package org.java.courses.tasks.task6.task6_2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] a = new int[8][5];
        int max;
        int min;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)((Math.random() * 99)+1);
            }
        }
        for (int i = 0; i<a.length; i++){
            for (int j=0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}


