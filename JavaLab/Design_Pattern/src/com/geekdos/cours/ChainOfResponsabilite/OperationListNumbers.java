package com.geekdos.cours.ChainOfResponsabilite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by theXuser on 19/12/2016.
 */
public abstract class OperationListNumbers {

    OperationListNumbers nextOp = null;
    protected List numbersLists = null;
    protected int operation;
    public static final int TRIE = 1;
    public static final int DOUBLANT = 2;
    public static final int TRIE_DOUBLANT = 3;

    public void operation(int operation){

        if (this.operation <= operation){
            this.doOperation();
        }
        if (this.nextOp != null){
            this.nextOp.operation(operation);
        }
    }

    public abstract void doOperation();

    void setNext(OperationListNumbers nextOp){
        this.nextOp = nextOp;
    }
}
