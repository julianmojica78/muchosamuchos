/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.EstudianteMateriaFacadeLocal;
import Interfaces.AbstractFacade;
import Entity.EstudianteMateria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DAVID
 */
@Stateless
public class EstudianteMateriaFacade extends AbstractFacade<EstudianteMateria> implements EstudianteMateriaFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_muchos-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudianteMateriaFacade() {
        super(EstudianteMateria.class);
    }
    
}
