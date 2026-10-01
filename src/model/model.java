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
    public float imc(int kg, int alturaCm) {
        float alturaM = alturaCm / 100f;
        return kg / (alturaM * alturaM);
    }
}
            

