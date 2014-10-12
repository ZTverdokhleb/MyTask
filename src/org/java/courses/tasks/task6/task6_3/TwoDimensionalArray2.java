package org.java.courses.tasks.task6.task6_3;

public class TwoDimensionalArray2 {
    public static void main(String[] args) {
        int[][] a = new int[9][9];
        int max;
        int min;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //сумма элементов диагонали
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (i == j) {
                    s1 += a[i][j];
                }
            }

        }
        System.out.println("сумма элементов диагонали  = " + s1);

        //сумма элементов выше главной диагонали
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++) {
                if (j < i)
                    s2 += a[i][j];
            }
        System.out.println("сумма элементов выше главной диагонали   = " + s2);
    }
}

