/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.waterblock;

/**
 *
 * @author Fabiano Stingelin Cardoso
 */
public class Fluido {
    private float condutividadeFluido;
    private float massaEspecifica;
    private float viscosidadeDinamica;
    private float capacidadeCalorifica;

    public Fluido() {
        this.condutividadeFluido = 0;
        this.massaEspecifica = 0;
        this.viscosidadeDinamica = 0;
        this.capacidadeCalorifica = 0;
    }

    public float getCapacidadeCalorifica() {
        return capacidadeCalorifica;
    }

    public void setCapacidadeCalorifica(float capacidadeCalorifica) {
        this.capacidadeCalorifica = capacidadeCalorifica;
    }

    public float getCondutividadeFluido() {
        return condutividadeFluido;
    }

    public void setCondutividadeFluido(float condutividadeFluido) {
        this.condutividadeFluido = condutividadeFluido;
    }

    public float getMassaEspecifica() {
        return massaEspecifica;
    }

    public void setMassaEspecifica(float massaEspecifica) {
        this.massaEspecifica = massaEspecifica;
    }

    public float getViscosidadeDinamica() {
        return viscosidadeDinamica;
    }

    public void setViscosidadeDinamica(float viscosidadeDinamica) {
        this.viscosidadeDinamica = viscosidadeDinamica;
    }
  
}
