package com.example.helloworld;

public class OperatorEx {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        //사칙 연산
        System.out.println(a/b);//정수 나누기 정수
        System.out.println(a%b);//나머지 구하기

        System.out.println((float)a / (float)b);
        System.out.println((float)a/b);

        //증감연산자: ++,--;
        //위치에 주의하자
        System.out.println("Origin: "+a);
        System.out.println("++a: "+ ++a);
        System.out.println("Final: "+ a);

        System.out.println("Origin: "+b);
        System.out.println("b++: "+ b++);
        System.out.println("Final: "+b);
    }
}
