package org.example.java8.lambda;

import java.util.List;

import static org.example.java8.lambda.Color.RED;
import static org.example.java8.lambda.FilteringApple.*;

public class Main {

    public static void main(String[] args) {
        //사과바구니 생성
        List<Apple> appleList = List.of(
                new Apple(88,Color.GREEN)
                ,new Apple(155,Color.GREEN)
                ,new Apple(120, RED)
                ,new Apple(97, RED)
                ,new Apple(200,Color.GREEN)
                ,new Apple(50, RED)
                ,new Apple(85,Color.YELLOW)
                ,new Apple(75,Color.YELLOW)

        );

        List<Apple> greenApples
                = filterGreenApples(appleList);
        System.out.println("====녹색 사과 필터링 =====");
        for (Apple greenApple:greenApples){
            System.out.println(greenApples);
        }

        System.out.println("======원하는 색 사과 필터링 ====");
        List<Apple> wantedColorApples = filterApplesByColor(appleList, RED);
        for(Apple wantedColorApple: wantedColorApples){
            System.out.println(wantedColorApple);
        }


    }
}
