package kr.hs.study;

import java.util.Scanner;

public class TestBean {
    private int a;
    private int b;

    //public TestBean(){
       // this.a=0;
       // this.b=0;
    //}

    public TestBean(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void prData(){
        if (a>b){
            System.out.println("1");
        }
        if(a<b){
            System.out.println("0");
        }
        if(a==b){
            System.out.println("a==b");
        }

    }


}
