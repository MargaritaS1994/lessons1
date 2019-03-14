/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.State3;


/**
 *
 * @author user
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    
public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
 @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 @Override
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 @Override
    public String toString() {
        return "waiting for quarter";
    }

    @Override
    public void refill() {
    }
}
