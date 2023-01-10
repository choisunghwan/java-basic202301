package org.example.inherit;

import org.example.basic.Dancer;

public class StreetDancer extends Dancer {

    // alt + insert 로 빠르게 생성자 만듦
    public StreetDancer(String crewName, String myName) {
        super(crewName, myName);
    }

    @Override
    public void dance(){
        super.dance();
        System.out.println("비보잉을 합니다");
    }
}
