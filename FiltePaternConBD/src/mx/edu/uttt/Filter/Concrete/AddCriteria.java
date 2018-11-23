/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Concrete;

import java.util.List;
import mx.edu.uttt.Filter.Criteria.Criterial;

/**
 *
 * @author moy-c
 */
public class AddCriteria implements Criterial{
   private Criterial criteria;
    private Criterial otherCriteria;
    
public  AndCriteria(Criterial criteria, Criterial othCriteria){
    this.criteria=criteria;
    this.otherCriteria=othCriteria;
}
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
         List<Person> firsCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firsCriteriaPersons);
    }
   
    }
    

