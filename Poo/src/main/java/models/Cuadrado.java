package models;

import processing.core.PApplet;

public class Cuadrado extends Figura {

    public Cuadrado(float x, float y, float size, int r, int g, int b) {
        super(x, y, size, r, g, b);
    }

    @Override
    public void dibujar(PApplet app) {
        app.fill(r, g, b);
        app.rect(x, y, size, size);
    }
}