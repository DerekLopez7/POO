/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegodb;

/**
 *
 * @author hecto
 */
public class Personaje {
    private int ki;
    private int fuerza;

    public Personaje(int ki, int fuerza) {
        this.ki = ki;
        this.fuerza = fuerza;
    }

    public void entrenar() {
        this.ki += this.ki * 0.2; // Incremento del 20%
        this.fuerza += this.fuerza * 0.2;
        
        if (ki > 200000) ki = 200000;
        if (fuerza > 200000) fuerza = 200000;        
    }

    // Getters y Setters
    public int getKi() { 
        return ki; 
    }
    public int getFuerza() { 
        return fuerza; 
    }
    
    public void atq1(){
        if(ki-800<0) this.ki=0;
        this.ki -= 800;
        this.fuerza -=800;
    }
    
    public void atq2(){
        if(ki-1500<0) this.ki=0;
        this.ki -= 1500;
        this.fuerza -=1500;
    }
    
    public void atq3(){
        if(ki-8000<=0) this.ki=0;
        this.ki -= 8000;
        this.fuerza -=8000;
    }
    
    public void atq4(){
        if(ki-2500<0) this.ki=0;
        this.ki -= 2500;
        this.fuerza -=2500;
    }

    public void atq5(){
        if(ki-4000<0) this.ki=0;
        this.ki -= 4000;
        this.fuerza -=4000;
    }

}


