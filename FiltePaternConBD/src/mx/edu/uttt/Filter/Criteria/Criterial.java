/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Criteria;

import java.util.List;
import mx.edu.uttt.Filter.Entidad.Modelo.BD;

/**
 *
 * @author moy
 */
public interface Criterial {
     public List<BD> meetCriteria(List<BD> producto);
    
}
