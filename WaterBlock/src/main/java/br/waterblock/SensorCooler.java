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
public class SensorCooler {
    
    private float qReal2;
    private float  tAmb;
        
    public SensorCooler() {
        this.qReal2 = 0;
        this.tAmb = 0;
    }

    public float getqReal2() {
        return qReal2;
    }

    public void setqReal2(float qReal2) {
        this.qReal2 = qReal2;
    }

    public float gettAmb() {
        return tAmb;
    }

    public void settAmb(float tAmb) {
        this.tAmb = tAmb;
    }
}
