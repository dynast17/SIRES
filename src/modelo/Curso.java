/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gollo011
 */
public class Curso {

    private String nombre;
    private String sigla;
    private int creditos;
    
    public Curso(String nombre, String sigla, int creditos) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", sigla=" + sigla + ", creditos=" + creditos + '}';
    }
    
    
}
