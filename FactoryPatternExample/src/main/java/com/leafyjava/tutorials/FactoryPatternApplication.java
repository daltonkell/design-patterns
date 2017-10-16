package com.leafyjava.tutorials;

import com.leafyjava.tutorials.domains.AbstractCheeseCake;
import com.leafyjava.tutorials.domains.CheeseCakeFactory;
import com.leafyjava.tutorials.utils.enums.CheeseCakeType;

public class FactoryPatternApplication {
    public static void main(String[] args) {
        AbstractCheeseCake cheeseCake = CheeseCakeFactory.getCheeseCake(CheeseCakeType.Original);
        System.out.println(cheeseCake);

        cheeseCake = CheeseCakeFactory.getCheeseCake(CheeseCakeType.Chocolate);
        System.out.println(cheeseCake);
    }
}
