package org.example;

import java.util.Date;

public class Transaction {
     private String sellerAcountNumber;
     private String buyerAccountNumber;
     private double amount;
     private Date date;

     public  Transaction (String sellerAcountNumber, String buyerAccountNumber, double amount, Date date){
         this.sellerAcountNumber = sellerAcountNumber;
         this.buyerAccountNumber = buyerAccountNumber;
         this.amount = amount;
         this.date = date;
     }
     public String getSellerAcountNumber(){
     return sellerAcountNumber;
     }
     public void setSellerAcountNumer(String sellerAcountNumber){
         this.sellerAcountNumber =sellerAcountNumber;
     }


    public String getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(String buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

