/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Concrete;

import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.Filter.Criteria.Criterial;
import mx.edu.uttt.Filter.Entidad.Modelo.BD;

/**
 *
 * @author Perla Sarahi
 */
public class CriteriaProveedor implements Criterial {
    @Override
    public List<BD> meetCriteria(List<BD> producto) {
        List<BD> provProd = new ArrayList<BD>();
        for (BD produc : producto){
            if(produc.getProveedor().equalsIgnoreCase("Proveedor")){
                provProd.add(produc);
            }
        }
        return provProd;
    }
    
    
}
