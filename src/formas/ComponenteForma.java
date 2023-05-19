/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import java.util.ArrayList;
import java.util.List;
import visitor.Visitor;

/**
 *
 * @author chris
 */
public class ComponenteForma implements Forma{
    public int id;
    public List<Forma> children = new ArrayList<>();

    public ComponenteForma(int id) {
        this.id = id;
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

    @Override
    public String aceptar(Visitor visitor) {
        return visitor.visitComponenteForma(this);
    }

    public void añadir(Forma forma) {
        children.add(forma);
    }
}
