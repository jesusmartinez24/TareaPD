package models;

import processing.core.PApplet;

public class Circulo extends Figura {

    public Circulo(float x, float y, float size, int r, int g, int b) {
        super(x, y, size, r, g, b);
    }

    @Override
    public void dibujar(PApplet app) {
        app.fill(r, g, b);
        app.ellipse(x, y, size, size);
    }
}
