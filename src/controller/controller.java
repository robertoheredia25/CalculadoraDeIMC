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
public void realizarCalculo() {
    double peso = vistaCalculadora.getNumero1();
    double altura = vistaCalculadora.getNumero2();

    double imc = modeloCalculadora.imc(peso, altura);
    String categoria = modeloCalculadora.categoria(imc);

    vistaCalculadora.setResultado(String.format("%.2f - %s", imc, categoria), imc);
}

}  