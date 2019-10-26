/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Interfaces.LibroFacadeLocal;
import Interfaces.AbstractFacade;
import Entity.Libro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DAVID
 */
@Stateless
public class LibroFacade extends AbstractFacade<Libro> implements LibroFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_muchos-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroFacade() {
        super(Libro.class);
    }
    
}
