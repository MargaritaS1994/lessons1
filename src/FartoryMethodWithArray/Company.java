/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FartoryMethodWithArray;

import java.util.List;

/**
 *
 * @author user1
 */
public abstract class Company {
    List getEmploees() {
        return null;
    };
    
    void startWorking(List<Employee> empoeers) {
        for (Employee emp : empoeers) {
            emp.doWork();
        }
    }
    
};
