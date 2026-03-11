/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.tiendajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author LABORATORIOS
 */
public class ProductoDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
    
    public void agregarProducto(Producto producto){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
        em.close();
        
        
    }
    
    
    public Producto buscar(int id){
        EntityManager em = emf.createEntityManager();
        Producto pe = em.find(Producto.class, id);
        return pe;
        
    }
    
    
    public void actualizar(Producto p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        
    }
    
    public void eliminar(int id ){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Producto pe = em.find(Producto.class, id);
        em.remove(pe);
        em.getTransaction().commit();
        em.close();
        
    }
    
}
