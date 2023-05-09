/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica02.fernandezj_pallom_Controlador;

import ec.edu.ups.java.practica02.fernandezj_pallom_Clases.Persona;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorPersona implements IControlador {
    
    private List<Persona> persona;

    public void imprimir (){
        
    }
    
    public Persona buscarPorNombre(String valor){
        
        return null;
        
    }
    
    public Persona buscarPorTitulo(String valor){
        
        return null;
        
    }
    
    
    
    @Override
    public void create(Persona obj) {
        if (obj instanceof Persona) {

            String cedula = ((Persona) obj).getCedula();
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.getCedula().equals(cedula)) {
                    personas.set(i, (Persona) obj);
                    break;
                }
            }

        }

    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                    break;
                }
            }

        }
    }

    @Override
    public void list() {
        for(Persona persona : personas){
            //personas.stream().forEach(p -> System.out.println(p));
            System.out.println(persona.toString());
        }
    }
    }

    @Override
    public Persona read(Persona obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Persona obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Persona obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
