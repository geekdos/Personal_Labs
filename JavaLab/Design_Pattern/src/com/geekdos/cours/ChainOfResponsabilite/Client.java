package com.geekdos.cours.ChainOfResponsabilite;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static List<Integer> myList = new ArrayList<Integer>();

    public static OperationListNumbers getInstance(){
        myList.add(1);myList.add(1);
        myList.add(3);myList.add(5);
        myList.add(25);myList.add(78);
        myList.add(5);myList.add(7);
        myList.add(2);myList.add(2);
        myList.add(6);myList.add(3);

        OperationListNumbers listSorted = new Sort(myList, OperationListNumbers.TRIE);
        OperationListNumbers listNotDouble = new Doublant((ArrayList) myList, OperationListNumbers.DOUBLANT);
        OperationListNumbers listSortedAndNotDouble = new Sort(myList, OperationListNumbers.TRIE_DOUBLANT);

        listSorted.setNext(listNotDouble);
        listNotDouble.setNext(null);
        listSortedAndNotDouble.setNext(null);

        return listSorted;
    }

    public static void main(String[] args){

        OperationListNumbers operationListNumbers = getInstance();
        operationListNumbers.operation(3);
        for (Object o: operationListNumbers.numbersLists) {
            System.out.println(o);
        }

    }

}
