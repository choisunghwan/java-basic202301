package org.example.inherit;

import org.example.basic.Dancer;
import org.example.basic.Rapper;

public class StreetDancer extends Dancer
        implements Rapper {

    // alt + insert 로 빠르게 생성자 만듦
    public StreetDancer(String crewName, String myName) {
        super(crewName, myName);
    }

//    @Override
    public void Dance(){
        System.out.println("비보잉을 합니다");
    }

    @Override
    public void rap() {
    }
}
