/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Concrete;

import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.Filter.Criteria.Criterial;

/**
 *
 * @author Perla Sarahi
 */
public class CriteriaProveedor implements Criterial {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> provPersons = new ArrayList<Person>();
        for (Person person : persons){
            if(person.getGenero().equalsIgnoreCase("Proveedor")){
                provPersons.add(person);
            }
        }
        return provPersons;
    }
    
    
}
