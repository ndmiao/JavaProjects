/**
 * @author ndmiao
 * @date 2021/9/20 11:14
 */
package com.ndmiao.bank;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Account {
    private int id; //账号
    private double balance;  //余额
    private double annualInterestRate; //年利率
    public Account (int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getBlance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //判断余额是否满足提款数额的要求
    public void withdraw (double amount) {//取钱
        if(balance < amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出：" + amount);
    }
    public void deposit (double amount) {//存钱
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入：" + amount);
        }

    }
}
