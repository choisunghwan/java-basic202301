package org.example.basic;


import org.example.inherit.IdolDancer;

import static java.lang.Math.*;
import static java.lang.System.*;
import static org.example.basic.DanceLevel.*;

public class Dancer extends Object { //extends를 안 붙이면 자동으로 Object 클래스가 붙는다. (자바 제일 상단 클래스:object)


    private final String crewName; //팀의 이름 . final필수, dancer로 태어나면 불변값.
    private final String myName; // 내 이름

    private  DanceLevel level = PRO; //춤 수준(전문가. 중수, 하수. 초보자) //필수 불변 값은 아니니까 final 안 붙였음.

    // 스트레칭 했는지
    private  boolean stretch;

    //유연성 운동 했는지
    private  boolean flexible;

    public Dancer(){
        this("기본크루","이름없음");
//        this.crewName="기본크루";
//        this.myName="이름없음";
    }
    //생성자 : 객체가 처음 생성될때 호출되는 메서드
    public Dancer(String crewName, String myName){
        this.crewName = crewName;
        this.myName=myName;
        out.println("그냥 dancer 생성됨!");

        random(); //import 로 설정시 math.random() 안해도 됨. (alt +enter 누르면 됨)
        ceil(1.1 * PI);
        out.println(); //sout 단축키 + import 로 인해 System.을 때도 됨.
    }


    // 스트레칭
    private void stretch(){
        out.println(myName+"님이 스트레칭합니다.");
        this.stretch=true;
    }
    //다리찢기
    private void makeFlexible(){
        if(!stretch){
            out.println("스트레칭 안해서 죽었습니다");
            return;
        }
        out.println(myName+"님이 유연성 운동을 합니다.");
        this.flexible=true;
    }

    //춤추기
    public void dance(){

        stretch();
        makeFlexible();

        if(!flexible){
            out.println("유연성 운동 안해서 죽었습니다.");
            return;
        }
        out.println(myName+"님이 충을 춥니다");
    }
}
