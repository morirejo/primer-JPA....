/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.tiendajpa;

/**
 *
 * @author LABORATORIOS
 */
public class TiendaJPA {

    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();
        
        Producto p = new Producto(0, "papitas", 19.90);
        Producto p2 = new Producto(0, "tortillas", 15.00);
        Producto p3 = new Producto(0, "dulce ", 6.50);
        Producto p4 = new Producto(0, "galletsa", 25.50);
        
       // productoDAO.agregarProducto(p);
       // productoDAO.agregarProducto(p2);
       // productoDAO.agregarProducto(p3);
       // productoDAO.agregarProducto(p4);
        
        Producto pbuscar = productoDAO.buscar(3);
        System.out.println("Producto: " + pbuscar.getNombre());
        
        pbuscar.setPrecio(9.99);
        
        productoDAO.actualizar(p);
        
        productoDAO.eliminar(3);
        
    }
}
