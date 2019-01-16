package com.example.helloworld;

public class CastingEx {
    public static void main(String[] args) {
        //암묵적 형변환
        //표현 범위가 작은 데이터 타입 -> 큰 데이터 타입
        byte b = 25;//1바이트
        System.out.println(b);
        //조금 더 넓은 범위인 short으로 옮겨보자
        short s = b;//2바이트
        System.out.println(s);
        //short보다도 넓은 범위인 int로 옮기자
        int i = s;//4바이트
        System.out.println(i);
        //이번엔 long으로 넘겨보자
        long l = i;//8바이트
        System.out.println(l);

    }
}
