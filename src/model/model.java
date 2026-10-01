/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Roberto Heredia Chaves
 */
public class model {

    public double imc(double peso, double alturaMetros) {
        return peso / (alturaMetros * alturaMetros);
    }

    public String categoria(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidad grado I";
        } else if (imc < 40) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III";
        }
    }
}
