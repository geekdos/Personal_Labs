package com.geekdos.tps.TP3.Exercice2.PrototypeStart;

public abstract class Soldier
{
    private String image;
    private int px, py;
    
    public Soldier(String s, int x, int y)
    {
        image=s;
        px=x;
        py=y;
    }
    
    public void paintOver(MyImage i)
    {
        i.paintOver(image, px, py);
    }
    
    public void setx(int x) {px=x;}
    public void sety(int y) {py=y;}
}
