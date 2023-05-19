/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package formas;

import visitor.Visitor;

/**
 *
 * @author chris
 */
public class Punto implements Forma{
    private int id;
    private int x;
    private int y;

    public Punto() {
    }
    
 @Override
    public void mover(int x, int y) {
        // mover forma
    }

    @Override
    public void dibujar() {
        // dibujar forma
    }
    
     @Override
    public String aceptar(Visitor visitor) {
        return visitor.visitPunto(this);
    }
    public Punto(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
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
}
