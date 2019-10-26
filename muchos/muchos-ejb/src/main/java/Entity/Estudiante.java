/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DAVID
 */
@Entity
@Table
public class Estudiante implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(columnDefinition = "serial")
    private int id;
    
    @Column
    private String nombre;
    
    @OneToMany(mappedBy = "estudiante",fetch = FetchType.LAZY)
    private List<EstudianteMateria> estudianteMateria; 

    public Estudiante() {
    }

    public Estudiante(String nombre) {
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

    public List<EstudianteMateria> getEstudianteMateria() {
        return estudianteMateria;
    }

    public void setEstudianteMateria(List<EstudianteMateria> estudianteMateria) {
        this.estudianteMateria = estudianteMateria;
    }
    
    
}
