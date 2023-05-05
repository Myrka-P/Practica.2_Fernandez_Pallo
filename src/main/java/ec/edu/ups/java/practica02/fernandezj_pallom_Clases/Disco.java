/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica02.fernandezj_pallom_Clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Disco {
    
    private int codigo;
    private String nombre;
    private int anioDeLanza;

    public Disco() {
    }

    public Disco(int codigo, String nombre, int anioDeLanza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioDeLanza = anioDeLanza;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioDeLanza() {
        return anioDeLanza;
    }

    public void setAnioDeLanza(int anioDeLanza) {
        this.anioDeLanza = anioDeLanza;
    }
    
    
    
           
}
