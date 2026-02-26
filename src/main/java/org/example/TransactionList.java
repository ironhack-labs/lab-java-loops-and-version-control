package org.example;

import java.util.Date;
import java.util.List;

public interface TransactionList {
    Transaction getLastTranscation();
    void addTrancastion(Transaction transaction);
    Transaction buyerAccountNumber(Date date);
    List<Transaction> getAllTransaction();
}
