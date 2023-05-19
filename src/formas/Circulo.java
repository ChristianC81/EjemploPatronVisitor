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
public class Circulo extends Punto{
     private int radius;

    public Circulo(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String aceptar(Visitor visitor) {
        return visitor.visitCirculo(this);
    }

    public int getRadius() {
        return radius;
    }
}
