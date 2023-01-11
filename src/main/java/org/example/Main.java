package org.example;

import org.example.basic.Dancer;
import org.example.beans.Goods;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.PerformanceTeam;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //단축키 ctrl alt v (변수 생성) , ctrl+d (복사)
        Goods goods1= new Goods("세탁기",300000);
        Goods goods2= new Goods("세탁기",300000);

        //soutv 단축키
        System.out.println("goods1 = " + goods1.toString());
        System.out.println("goods2 = " + goods2);

        System.out.println("(goods1 == goods2) ="+(goods1 == goods2));
        System.out.println("(goods1 equals goods2) ="+(goods1.equals(goods2)));
//        System.out.println(goods1.hashCode());

        Set<String> set1 = new HashSet<>();
        set1.add("짜장면");
        set1.add("짬뽕");
        set1.add("짜장면");

        System.out.println("set = " + set1);
        System.out.println("set1.size()=" + set1.size());

        Set<Goods> set2 = new HashSet<>();
        set2.add(goods1);
        set2.add(goods2);

        System.out.println("set2 ="+ set2);
        System.out.println("set2.size() =" +set2.size());

        System.out.println(goods1.hashCode());
        System.out.println(goods2.hashCode());


    }
}
//
//        Dancer idolDancer1 = new IdolDancer("아이돌팀1","아이돌1");
//        Dancer idolDancer2 = new IdolDancer("아이돌팀2","아이돌2");
//        Dancer idolDancer3 = new IdolDancer("아이돌팀3","아이돌3");
//
//        Dancer streetDancer1 = new StreetDancer("스트릿팀1","스트릿댄서1");
//        Dancer streetDancer2 = new StreetDancer("스트릿팀2","스트릿댄서2");
//        Dancer streetDancer3 = new StreetDancer("스트릿팀3","스트릿댄서3");
//
//        PerformanceTeam team = new PerformanceTeam();
//
//        team.joinDancer(idolDancer1);
//        team.joinDancer(idolDancer3);
//        team.joinDancer(streetDancer3);
//        team.joinDancer(streetDancer1);
//
//        System.out.println();
//
//        team.groupDance();



//        Dancer dc = new Dancer();
//
////ctrl + alt +v 를 new dancer에 가져다가 누르면 자동으로 변수 생성
////      Dancer dancer = new Dancer(crewName "총알탄소년단", myName "춤신춤왕"); ==> 여기서 "총알탄소년단" , "춤신춤왕"만 입력하면 된다.
//        Dancer dancer = new Dancer("총알탄소년단","춤신춤왕");
//
//
//        dancer.dance();
//
//        IdolDancer idolDancer =
//                new IdolDancer("ABC", "홍길동");
//
//        StreetDancer streetDancer =
//                new StreetDancer("길거리춤군돌", "박격포");
//
//        idolDancer.dance();
//        System.out.println();
//
//        streetDancer.dance();
