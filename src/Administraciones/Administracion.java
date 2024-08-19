/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administraciones;

/**
 *
 * @author Student
 */
public class Administracion {
    private int numero;
    private String Tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Administracion(int numero, String Tipo) {
        this.numero = numero;
        this.Tipo = Tipo;
    }

    public Administracion() {
    }

    @Override
    public String toString() {
        return "Administracion{" + "numero=" + numero + ", Tipo=" + Tipo + '}';
    }
}
