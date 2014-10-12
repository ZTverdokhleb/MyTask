package org.java.courses.tasks.task5.task5_5;
public class DecimalToHex {
         public static String FromDecToHex(float x){
                String res="";
                int q = 0;
                int c = 2;
                while(c!=0){
                    q=(int)(16*(x/16-Math.floor(x/16)));
                    c=(int) Math.floor(x/16);
                    x=c;
                    if(q<10){
                        res=q+res;
                        }
                    else{
                        switch(q){
                            case 10:
                                res="A"+res;
                                break;
                            case 11:
                                res="B"+res;
                                break;
                            case 12:
                                res="C"+res;
                                break;
                            case 13:
                                res="D"+res;
                                break;
                            case 14:
                                res="E"+res;
                                break;
                            case 15:
                                res="F"+res;
                                break;
                            }
                        }
                    }
                return res;
                }
            public static void main(String[] args) {
                System.out.println(FromDecToHex(950));
                }
            }




