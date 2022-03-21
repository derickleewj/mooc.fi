/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Derick
 */
public class Debt {
    
    private double balance;
    private double interestRate;
    
    public Debt (double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        if (this.balance > 0) {
            this.balance *= this.interestRate;
            
        }                
    }
    
}
