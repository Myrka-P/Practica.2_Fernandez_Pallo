/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.java.practica02.fernandezj_pallom_Clases;

/**
 *
 * @author ESTUDIANTE
 */
public interface IControlador {
    public abstract  void create (Persona obj);
    public abstract Persona read (Persona obj);
    public abstract void update (Persona obj);
    public abstract void delete (Persona obj);
    public abstract void list ();
}
