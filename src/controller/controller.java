/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.model;
import view.viewPanel;
/**
 *
 * @author Roberto Heredia Chaves
 */
public class controller {
    private model modeloCalculadora;
    private viewPanel vistaCalculadora;

    public controller(model modeloCalculadora, viewPanel vistaCalculadora) {
        this.modeloCalculadora = modeloCalculadora;
        this.vistaCalculadora = vistaCalculadora;
    }
    public void realizarCalculo(){
     int num1 = vistaCalculadora.getNumero1();
     int num2 = vistaCalculadora.getNumero2();
     float resultado = modeloCalculadora.imc(num1, num2);
     vistaCalculadora.setResultado(resultado);
    }

}