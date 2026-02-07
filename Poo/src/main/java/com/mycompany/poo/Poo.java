package com.mycompany.tareapoo;

import processing.core.PApplet;
import models.*;

public class Poo extends PApplet {
    Figura[] figuras;

    public static void main(String[] args) {
        PApplet.main("com.mycompany.tareapoo.Poo");
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        figuras = new Figura[25];
        
        figuras[0] = new Cuadrado(350, 250, 100, 240, 240, 240);
        figuras[1] = new Cuadrado(375, 220, 50, 220, 50, 50);
        figuras[2] = new Circulo(400, 280, 30, 100, 150, 255);
        figuras[3] = new Circulo(400, 330, 30, 100, 150, 255);
        figuras[4] = new Cuadrado(320, 320, 40, 200, 50, 50);
        figuras[5] = new Cuadrado(310, 350, 30, 180, 40, 40);
        figuras[6] = new Cuadrado(440, 320, 40, 200, 50, 50);
        figuras[7] = new Cuadrado(460, 350, 30, 180, 40, 40);
        figuras[8] = new Cuadrado(350, 350, 100, 150, 150, 150);
        figuras[9] = new Circulo(370, 380, 25, 255, 150, 0);
        figuras[10] = new Circulo(400, 380, 25, 255, 120, 0);
        figuras[11] = new Circulo(430, 380, 25, 255, 150, 0);
        figuras[12] = new Circulo(370, 400, 20, 255, 200, 0);
        figuras[13] = new Circulo(400, 410, 25, 255, 220, 0);
        figuras[14] = new Circulo(430, 400, 20, 255, 200, 0);
        figuras[15] = new Circulo(370, 420, 15, 255, 150, 50);
        figuras[16] = new Circulo(400, 430, 20, 255, 180, 30);
        figuras[17] = new Circulo(430, 420, 15, 255, 150, 50);
        figuras[18] = new Circulo(150, 100, 8, 255, 255, 200);
        figuras[19] = new Circulo(600, 150, 6, 255, 255, 255);
        figuras[20] = new Circulo(200, 400, 7, 255, 255, 200);
        figuras[21] = new Circulo(650, 350, 8, 255, 255, 255);
        figuras[22] = new Circulo(100, 250, 6, 255, 255, 200);
        figuras[23] = new Circulo(650, 100, 80, 220, 220, 220);
        figuras[24] = new Circulo(660, 90, 20, 180, 180, 180);
    }

    @Override
    public void draw() {
        background(10, 10, 40);
        
        for (Figura f : figuras) {
            f.dibujar(this);
        }
    }
}