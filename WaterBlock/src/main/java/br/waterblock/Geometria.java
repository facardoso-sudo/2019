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
public class Geometria {
    private float condutividadeMaterial;
    private int qtdaMicrocanais;
    private float alturaMicrocanal;
    private float larguraMicrocanal;
    private int qtdaAletas;
    private float areaSuperficieContato;
    private float perimetroMicrocanal;

    public Geometria() {
        this.condutividadeMaterial = 0;
        this.qtdaMicrocanais = 0;
        this.alturaMicrocanal = 0;
        this.larguraMicrocanal = 0;
        this.qtdaAletas = 0;
        this.areaSuperficieContato = 0;
        this.perimetroMicrocanal = 0;
        
    }

    public float getCondutividadeMaterial() {
        return condutividadeMaterial;
    }

    public void setCondutividadeMaterial(float condutividadeMaterial) {
        this.condutividadeMaterial = condutividadeMaterial;
    }

    public int getQtdaMicrocanais() {
        return qtdaMicrocanais;
    }

    public void setQtdaMicrocanais(int qtdaMicrocanais) {
        this.qtdaMicrocanais = qtdaMicrocanais;
    }

    public float getAlturaMicrocanal() {
        return alturaMicrocanal;
    }

    public void setAlturaMicrocanal(float alturaMicrocanal) {
        this.alturaMicrocanal = alturaMicrocanal;
    }

    public float getLarguraMicrocanal() {
        return larguraMicrocanal;
    }

    public void setLarguraMicrocanal(float larguraMicrocanal) {
        this.larguraMicrocanal = larguraMicrocanal;
    }

    public int getQtdaAletas() {
        return qtdaAletas;
    }

    public void setQtdaAletas(int qtdaAletas) {
        this.qtdaAletas = qtdaAletas;
    }

    public float getAreaSuperficieContato() {
        return areaSuperficieContato;
    }

    public void setAreaSuperficieContato(float areaSuperficieContato) {
        this.areaSuperficieContato = areaSuperficieContato;
    }

    public float getPerimetroMicrocanal() {
        return perimetroMicrocanal;
    }

    public void setPerimetroMicrocanal(float perimetroMicrocanal) {
        this.perimetroMicrocanal = perimetroMicrocanal;
    }
  
}
