/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

import formas.Rectangulo;
import formas.Circulo;
import formas.ComponenteForma;
import formas.Punto;

/**
 *
 * @author chris
 */
public interface Visitor {
    String visitPunto(Punto dot);

    String visitCirculo(Circulo circle);

    String visitRectagulo(Rectangulo rectangle);

    String visitComponenteForma(ComponenteForma cg);
}
