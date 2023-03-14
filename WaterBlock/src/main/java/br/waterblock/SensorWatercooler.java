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
public class SensorWatercooler {
    
    private float qReal1;
    private float  areaContato;
    private float  tCpu;
    private float  tIn;
    private float  tOut;
    private float  vazao;
    private float tempo;
    
    public SensorWatercooler() {
        this.qReal1 = 0;
        this.areaContato = 0;
        this.tCpu = 0;
        this.tIn = 0;
        this.tOut = 0;
        this.vazao = 0;
        this.tempo = 0;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public float getqReal1() {
        return qReal1;
    }

    public void setqReal1(float qReal1) {
        this.qReal1 = qReal1;
    }

    public float getAreaContato() {
        return areaContato;
    }

    public void setAreaContato(float areaContato) {
        this.areaContato = areaContato;
    }

    public float gettCpu() {
        return tCpu;
    }

    public void settCpu(float tCpu) {
        this.tCpu = tCpu;
    }

    public float gettIn() {
        return tIn;
    }

    public void settIn(float tIn) {
        this.tIn = tIn;
    }

    public float gettOut() {
        return tOut;
    }

    public void settOut(float tOut) {
        this.tOut = tOut;
    }

    public float getVazao() {
        return vazao;
    }

    public void setVazao(float vazao) {
        this.vazao = vazao;
    } 
}
