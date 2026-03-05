/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOS;

import Entidades.SuperHeroe;
import java.util.List;

/**
 *
 * @author LABORATORIOS
 */
public interface ISuperHeroesDAO {
    public void insertar(SuperHeroe e);
    public void actualizar (SuperHeroe e);
    public void eliminar (Long id);
    SuperHeroe buscar(Long id);
    List<SuperHeroe> listar();
    
    
}
