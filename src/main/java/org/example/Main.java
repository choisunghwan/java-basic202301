package org.example;

import org.example.basic.Dancer;

public class Main {
    public static void main(String[] args) {

//ctrl + alt +v 를 new dancer에 가져다가 누르면 자동으로 변수 생성
//      Dancer dancer = new Dancer(crewName "총알탄소년단", myName "춤신춤왕"); ==> 여기서 "총알탄소년단" , "춤신춤왕"만 입력하면 된다.
        Dancer dancer = new Dancer("총알탄소년단","춤신춤왕");


        dancer.dance();
    }
}