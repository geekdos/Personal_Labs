package com.geekdos.tps.TP3.Exercice2.PrototypeStart;

public class Main {
    public static void main(String[] args) {
        Scene l = new LordOfTheRing();
        for (int i = 0; i < 20; i++) {
            int px = (int) (Math.random() * (l.getMaxX() - l.getMinX()) + l.getMinX());
            int py = (int) (Math.random() * (l.getMaxY() - l.getMinY()) + l.getMinY());
            l.addSoldier(new Knight(px, py));
        }
        for (int i = 0; i < 20; i++) {
            int px = (int) (Math.random() * (l.getMaxX() - l.getMinX()) + l.getMinX());
            int py = (int) (Math.random() * (l.getMaxY() - l.getMinY()) + l.getMinY());
            l.addSoldier(new Orc(px, py));
        }
        l.render();
    }
}
