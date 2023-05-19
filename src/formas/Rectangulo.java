/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import visitor.Visitor;

/**
 *
 * @author chris
 */
public class Rectangulo implements Forma{
    private int id;
    private int x;
    private int y;
    private int ancho;
    private int altura;

    public Rectangulo (int id, int x, int y, int ancho, int altura) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.altura = altura;
    }
    @Override
    public String aceptar(Visitor visitor) {
        return visitor.visitRectagulo(this);
    }

    @Override
    public void mover(int x, int y) {
        // move shape
    }

    @Override
    public void dibujar() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
