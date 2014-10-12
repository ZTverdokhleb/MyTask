package org.java.courses.tasks.task5.task5_2;
public class Prime {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i=3; i<=10;i++){
            boolean b=false;
            for (int j=2; j<i; j++){
                b=(i%j==0);
                if (b)
                    break;
            }
            if(!b)
                System.out.print(i+",");
        }
    }
}

