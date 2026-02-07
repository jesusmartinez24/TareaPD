package models;

import processing.core.PApplet;

public abstract class Figura {

    protected float x, y;
    protected float size;
    protected int r, g, b;

    public Figura(float x, float y, float size, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public abstract void dibujar(PApplet app);
}