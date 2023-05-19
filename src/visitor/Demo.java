/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

import formas.Circulo;
import formas.ComponenteForma;
import formas.Forma;
import formas.Punto;
import formas.Rectangulo;

/**
 *
 * @author chris
 */
public class Demo {
    public static void main(String[] args) {
        
        Punto dot = new Punto(1, 10, 55);
        Circulo circle = new Circulo(2, 23, 15, 10);
        Rectangulo rectangle = new Rectangulo(3, 10, 17, 20, 30);

        ComponenteForma componenteForma = new ComponenteForma(4);
        componenteForma.añadir(dot);
        componenteForma.añadir(circle);
        componenteForma.añadir(rectangle);

        ComponenteForma c = new ComponenteForma(5);
        c.añadir(dot);
        componenteForma.añadir(c);

        export(circle, componenteForma);
    }

    private static void export(Forma... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.exportar(shapes));
    
    }
}
