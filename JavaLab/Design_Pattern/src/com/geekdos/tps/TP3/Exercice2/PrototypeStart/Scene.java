package com.geekdos.tps.TP3.Exercice2.PrototypeStart;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Scene
{
    private String decor;
    private int maxX, maxY, minX, minY;
    private ArrayList<Soldier> characters;
    
    public Scene(String d, int maxx, int maxy, int minx, int miny)
    {
        decor=d;
        maxX=maxx;
        maxY=maxy;
        minX=minx;
        minY=miny;
        characters = new ArrayList<Soldier>();
    }

    public int getMaxX() {return maxX;}
    public int getMaxY() {return maxY;}
    public int getMinX() {return minX;}
    public int getMinY() {return minY;}
    
    public void addSoldier(Soldier s)
    {
        characters.add(s);
    }
    
    public void render()
    {
        Soldier s;
        MyImage m = new MyImage(decor);
        Iterator<Soldier> i = characters.iterator();
        while(i.hasNext())
        {
            s=i.next();
            s.paintOver(m);
        }
        m.display();
    }
}
