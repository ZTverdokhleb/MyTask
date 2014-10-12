package org.java.courses.tasks.task6.task6_1;

import static java.lang.Math.random;
public class DimensionalArray {
    public static void main(String[] args) {
        int[] a = new int[100];
        int min=50;
        int max=100;
        int sum = 0;
        double sr;
        sr = 0;
        for (int i = 50; i <a.length; i++){
            a[i] = (int)(random()*50)+50;{
            System.out.println(a[i]);}
        }
        for(int i =50; i<a.length; i++){
            if(max < a[i]){
                max=a[i];
            }
            if(min > a[i]){
                min=a[i];
            }
            sum+=a[i];
            sr = sum /50;
        }
        System.out.println("Сумма составляет " + sum + " \n");
        System.out.println("Максимальный элемент " + max + "\n ");
        System.out.println("Минимальный элемент " + min + " \n");
        System.out.println("Среднее значение " + sr);
    }
}


