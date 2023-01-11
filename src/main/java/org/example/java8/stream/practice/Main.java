package org.example.java8.stream.practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        //연습1: 2021년에 발생한 모든 거래를 찾아 거래에 오름차 정렬(작은 값에서 큰값)
        // List<Transaction>으로 결과가 나옴.
        List<Transaction> tr2021 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        tr2021.forEach(out::println);
        
        //연습2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>으로 결과가 나옴.
        // 거래목록에서 거래자들을 추출한담에 거래자안에 있는 도시이름을 추출
        // filter : 10개중에 조건에 맞는 3개를 필터링
        // map : 10개중에 10개를 가져오는데 조건에 맞게 추출
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        out.println("cities = " + cities);

        
        //연습3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차 정렬.
        // List<Trader>으로 결과가 나옴.
        List<Trader> cambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());

        cambridge.forEach(out::println);
        //연습4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차순정렬하여 반환
        // List<String>으로 결과가 나옴.
        List<String>names = transactions.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted() // 정렬리스트 대상이 string 이나 숫자타입이면 comparator를 안써도 정렬
                .collect(toList());

        out.println("names = " + names);
    }
}
