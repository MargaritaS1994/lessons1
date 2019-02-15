/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3;

/**
 *
 * @author user1
 */

  public class ConstructionCompany extends Company { 
     @Override
    Employee[] getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity" +ConstructionCompany.class.getSimpleName() + "/n");
        Employee[] employee = new Employee[13];
        employee[0] = new Builder();
        employee[1] = new Builder();
        employee[2] = new Builder();
        employee[3] = new Builder();
        employee[4] = new Builder();
        employee[5] = new Builder();
        employee[6] = new Builder();
        employee[7] = new Builder();
        employee[8] = new Builder();
        employee[9] = new Builder();
       
       
        employee[10] = new Electric();
        employee[11] = new Prorab();
        employee[12] = new Direktor();
       
        
        return employee;
    }
}  

