package com.geekdos.cours.ChainOfResponsabilite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by theXuser on 19/12/2016.
 */
public class Sort extends OperationListNumbers {

    public Sort(List list, int operation) {
        this.numbersLists = list;
        this.operation = operation;
    }

    @Override
    public void doOperation() {
        Collections.sort(this.numbersLists);
    }
}
