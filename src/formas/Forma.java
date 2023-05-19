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
public interface Forma {
    void mover(int x, int y);
    void dibujar();
    String aceptar(Visitor visitor);
}
