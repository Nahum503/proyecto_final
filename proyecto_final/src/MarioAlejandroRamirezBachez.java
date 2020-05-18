/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MarioAlejandroRamirezBachez {
    
     private long NumCuenta;
    private double CargoCuenta;
    private double AbonoCuenta;
    private double SaldoCuenta;
    private char EstadoCuenta;

    //set and get
    public long getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.NumCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return CargoCuenta;
    }

    public void setCargoCuenta(double cargoCuenta) {
        this.CargoCuenta = cargoCuenta;
    }

    public double getAbonoCuenta() {
        return AbonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.AbonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return SaldoCuenta;
    }
//aca ed donde modificamos
    public void setSaldoCuenta() {//se elimina  el atributo double 
        //se escrive la formula siguiente para calcular saldo
        this.SaldoCuenta = SaldoCuenta + this.AbonoCuenta - this.CargoCuenta;
    }

    public char getEstadoCuenta() {
        return EstadoCuenta;
    }

    public void setEstadoCuenta(char estadoCuenta) {
        this.EstadoCuenta = estadoCuenta;
    }
}


