package org.java.courses.tasks.task5.task5_1;
public class Triangle {
    public static void main(String[] args)
    // TODO Auto-generated method stub
    {
        for (int i=0; i<4; i++)
        {
            for (int k=0; k<4-i; k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}