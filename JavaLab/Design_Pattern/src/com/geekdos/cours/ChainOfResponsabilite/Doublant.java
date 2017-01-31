package com.geekdos.cours.ChainOfResponsabilite;

import java.util.*;

public class Doublant extends OperationListNumbers {

    public Doublant(ArrayList list, int operation) {
        this.numbersLists = list;
        this.operation = operation;
    }

    public void doOperation() {

        Set<Integer> hs = new HashSet<>();
        hs.addAll(numbersLists);
        numbersLists.clear();
        numbersLists.addAll(hs);

    }
}
