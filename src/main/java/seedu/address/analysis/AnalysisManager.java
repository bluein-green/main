package seedu.address.analysis;

import javafx.collections.transformation.FilteredList;
import seedu.address.commons.core.ComponentManager;
import seedu.address.model.drink.Price;
import seedu.address.model.transaction.Transaction;
import seedu.address.model.transaction.TransactionList;
import seedu.address.model.transaction.TransactionType;

/**
 * Represents functions to analyse profit, revenue, cost, quantity sold.
 * Functions are performed on the filteredTransactions list
 */
public class AnalysisManager extends ComponentManager implements Analysis {
    private TransactionList transactionList;
    private FilteredList<Transaction> filteredTransactions;

    public AnalysisManager(TransactionList transactionList, FilteredList<Transaction> filteredTransactions) {
        this.transactionList = transactionList;
        this.filteredTransactions = filteredTransactions;
    }

    @Override
    public Price analyseProfit(AnalysisPeriodType period) {
        // return transactionList.calculateTotalProfit();
        return null;
    }

    @Override
    public Price analyseCost(AnalysisPeriodType period) {
        return calculateTotalCost();
    }

    @Override
    public Price analyseRevenue(AnalysisPeriodType period) {
        return calculateTotalRevenue();
    }


    /**
     * Calculates the total cost of all the transactions.
     *
     * @return total cost incurred for all transactions
     */
    private Price calculateTotalCost() {
        float totalCost = 0;
        for (Transaction transaction : filteredTransactions) {
            if (transaction.getTransactionType() == TransactionType.PURCHASE) {
                totalCost += transaction.getAmountMoney().getValue();
            }
        }

        return new Price(Float.toString(totalCost));
    }

    /**
     * Calculates the total revenue of the transactions in the {@code filteredTransactions}.
     *
     * @return total revenue earned for the transactions listed.
     */
    private Price calculateTotalRevenue() {
        float totalCost = 0;
        for (Transaction transaction : filteredTransactions) {
            if (transaction.getTransactionType() == TransactionType.SALE) {
                totalCost += transaction.getAmountMoney().getValue();
            }
        }

        return new Price(Float.toString(totalCost));
    }


}
