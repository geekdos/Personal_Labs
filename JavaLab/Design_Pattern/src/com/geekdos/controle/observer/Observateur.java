package com.geekdos.controle.observer;

import com.geekdos.controle.common.IntegerSet;

/**
 * Created by theXuser on 1/1/2017.
 */
public interface Observateur {

    public void setIntegerSet(IntegerSet integerSet);
    /**
     * Méthode appelée par l'objet observé
     * pour notifier une mise à jour
     */
    public void update();
}
