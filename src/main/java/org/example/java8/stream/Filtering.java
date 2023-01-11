package org.example.java8.stream;

import java.util.List;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.*;
import static org.example.java8.stream.Dish.menu;

public class Filtering {
    public static void main(String[] args) {

        // stream의 filter : 리턴 조건에 맞는 데이터만 필터링
        // 요리 목록중에 채식주의자가 먹을 수 있는 음식만 필터링해주세요
        List<Dish> vegeterianDishes = menu.stream()
                .filter(Dish::isVegeterian)
                .collect(toList());

//        for (Dish vegeterianDish : vegeterianDishes) {
//            System.out.println("vegeterianDish = " + vegeterianDish);
//        }
        vegeterianDishes.forEach(System.out::println);


        System.out.println("=========================================");
        // 요리 목록 중에 육류이면서 600칼로리 미만인 요리만 필터링
        menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .collect(toList())
                .forEach(System.out::println);


        System.out.println("=========================================");

        List<Integer> nums = List.of(1,2,1,3,3,2,4,4,5,6);
        //nums 리스트에서 짝수만 필터링한 후 중복을 제거해주세요.
        nums.stream()
                .filter(n->n%2==0)
                .distinct() //중복제거
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("=========================================");
        //원하는 개수만 필터링 하기
        // 칼로리가 300칼로리보다 큰 요리중에 처음 발견된 3개만 필터링

        menu.stream()
                .filter(d->d.getCalories()>300)
                .limit(3) //앞에서 부터 3개만 추출
                .collect(toList())
                .forEach(System.out::println);

        // 요소 생략해서 필터링
        // 칼로리가 300칼로리보다 큰 요리중에 처음 2개는 제끼고 필터링
        menu.stream()
                .filter(d->d.getCalories()>300)
                .skip(2)
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("=========================================");
        //스트림을 사용해서 처음 등장하는 고기 요리 2개를 필터링하세요.
        List<Dish> dishes = menu.stream()
                .filter(m->m.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(toList());
        System.out.println("dishes = " + dishes);
    }

}
