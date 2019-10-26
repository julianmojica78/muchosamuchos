/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entity.*;
import Modelo.*;
import Persistencia.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author DAVID
 */
@Named(value = "logica")
@SessionScoped
public class Logica implements Serializable {

    @EJB
    LibroFacade libroFacade;
    
    @EJB
    AutorFacade autorFacade;
    
    private Libro libro;
    
    private Autor autor;   
    
    private LibroModelo libromodelo;
    
    private Persona persona;
    
    private String nombreAutor;
    
    private String nombreLibro;
    
    
    public Logica() {
    }

    public void guardarAutor(Persona persona1){
        autor = new Autor(persona1.getNombre());
        autorFacade.create(autor);
    }
    
    public void guardarLibro(Libro libro1){
        libro = new Libro(libro1.getNombre());
        libroFacade.create(libro1);
    }
    
    public List<Autor> traerAutores(){
        List<Autor> autore = new ArrayList<>();
        return autore;
    }
    
    public LibroModelo getLibromodelo() {
        return libromodelo;
    }

    public void setLibromodelo(LibroModelo libromodelo) {
        this.libromodelo = libromodelo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    
    
}
