/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DAVID
 */
@Entity
@Table(name = "estudiante_materia")
public class EstudianteMateria implements Serializable{
    
    @Id  
    @Column
    private int nota;
    
    @ManyToOne
    @JoinColumn(name = "id_estudiante",nullable = false)
    private Estudiante estudiante;
    
    @ManyToOne
    @JoinColumn(name = "id_materia",nullable = false)
    private Materia materia;

    public EstudianteMateria() {
    }

    public EstudianteMateria(int nota, Estudiante estudiante, Materia materia) {
        this.nota = nota;
        this.estudiante = estudiante;
        this.materia = materia;
    }
    
    

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
}
