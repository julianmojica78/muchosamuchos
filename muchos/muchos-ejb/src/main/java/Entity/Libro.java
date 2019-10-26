/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author DAVID
 */
@Entity
@Table(name = "libro")
public class Libro implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(columnDefinition = "serial")
    private int id;
    
    @Column
    private String nombre;
    
    @JoinTable(name = "autor_libro", 
            joinColumns = @JoinColumn(name = "id_libro", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_autor", nullable = false))
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Autor> listaAutor;
    
    public Libro() {
    }

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getListaAutor() {
        return listaAutor;
    }

    public void setListaAutor(List<Autor> listaAutor) {
        this.listaAutor = listaAutor;
    }
}
