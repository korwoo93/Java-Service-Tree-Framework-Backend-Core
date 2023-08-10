package com.arms.korwoo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Start {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    public Start(){
        logger.info("start korwoo--");
        /*Tv tv=new Tv();
        tv.colour="black";
        logger.info(tv.colour);*/

        /*Quetion 3-3
        int num=10;
        logger.info((num>0) ? "Positive" : (num<0) ? "Negative" : "0");*/

        /*Question 3-4
        int num=789;
        logger.info(String.valueOf(num-(num%100)));
         */

        /*Question 3-5
        int num=789;
        logger.info(String.valueOf(num-(num%10)+1));
        */


        /*Question 3-6
        int num=24;
        logger.info(String.valueOf(((num/10+1)*10)-num));
        */

       /* Question 3-8
        byte a=10;
        byte b=20;
        byte c= (byte) (a+b);

        char ch='A';
        ch= (char) (ch+2);

        float f=3/2f;
        long l=3000*3000*3000L;

        float f2=0.1f;
        double d=0.1;

        boolean result= (float)d==f2;
        logger.info(String.valueOf(c= (byte) +c));
        logger.info(String.valueOf(ch));
        logger.info(String.valueOf(f));
        logger.info(String.valueOf(l));
        logger.info(String.valueOf(result));
        */

        /*Question 3-9
        char a='Z';
        boolean b=((int)a>=65 && (int)a<=90) ||((int)a>=97 && (int)a<=122) || ((int)a>=49 && (int)a<=57) ? true:false;
        logger.info(String.valueOf(b));
        */


        /*Question 3-10
        char ch='A';
        char lowercase= ((int)ch>=65 && (int)ch<=90) ? (char) ((int) ch + 32) : ch;
        logger.info(String.valueOf(lowercase));
        */

        /*Question 4-2
        int sum=0;
        for(int i=1; i<=20; i++){
            if(i%2!=0 && i%3!=0){
                sum+=1;
            }
        }
        logger.info(String.valueOf(sum));
        */









    }

    public String test(){
        logger.info("Hello korwoo!");
        return "asd";
    }
}
