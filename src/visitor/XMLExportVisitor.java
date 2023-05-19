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
public class XMLExportVisitor implements Visitor{

    public String exportar(Forma... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Forma shape : args) {
            sb.append(shape.aceptar(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitPunto(Punto d) {
        return "<dot>" + "\n" +
                "    <id>" + d.getId() + "</id>" + "\n" +
                "    <x>" + d.getX() + "</x>" + "\n" +
                "    <y>" + d.getY() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visitCirculo(Circulo c) {
        return "<circle>" + "\n" +
                "    <id>" + c.getId() + "</id>" + "\n" +
                "    <x>" + c.getX() + "</x>" + "\n" +
                "    <y>" + c.getY() + "</y>" + "\n" +
                "    <radius>" + c.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectagulo(Rectangulo r) {
        return "<rectangle>" + "\n" +
                "    <id>" + r.getId() + "</id>" + "\n" +
                "    <x>" + r.getX() + "</x>" + "\n" +
                "    <y>" + r.getY() + "</y>" + "\n" +
                "    <width>" + r.getAncho()+ "</width>" + "\n" +
                "    <height>" + r.getAltura()+ "</height>" + "\n" +
                "</rectangle>";
    }

    @Override
    public String visitComponenteForma(ComponenteForma cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _visitComponenteForma(cg) +
                "</compound_graphic>";
    }

    private String _visitComponenteForma(ComponenteForma cg) {
        StringBuilder sb = new StringBuilder();
        for (Forma shape : cg.children) {
            String obj = shape.aceptar(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }

   
}
