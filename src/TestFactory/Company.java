/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory;

/**
 *
 * @author user1
 */
public class Company {
    void createSoftware() {
//        System.out.println("Starting company acrivity");
//        Employee[] employee = new Employee[3]; // primer bez kollekcij
//        employee[0] = new Desinger();
//        employee[1] = new Programmer ();
//        employee[2] = new Tester ();
//        
//        for (Employee employeeEach : employee) {
//            employeeEach.doWork();


        System.out.println("Starting company acrivity");
        Desinger desinger = new Desinger();
        desinger.desingerArchitecture();
        Programmer programmer = new Programmer();
        programmer.programmingCode();
        Tester tester = new Tester();
        tester.TestingCode();

        }

//    void createSoftware() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    }

