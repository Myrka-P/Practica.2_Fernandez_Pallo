/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica02.fernandezj_pallom_Clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Cancion {
    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinu;

    public Cancion() {
    }

    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinu) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinu = tiempoEnMinu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getTiempoEnMinu() {
        return tiempoEnMinu;
    }

    public void setTiempoEnMinu(double tiempoEnMinu) {
        this.tiempoEnMinu = tiempoEnMinu;
    }
    
}
