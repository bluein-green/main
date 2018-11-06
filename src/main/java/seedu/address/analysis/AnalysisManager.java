package seedu.address.analysis;

import java.util.function.Predicate;

import seedu.address.commons.core.ComponentManager;
import seedu.address.model.drink.Price;
import seedu.address.model.transaction.Transaction;
import seedu.address.model.transaction.TransactionList;

/**
 * Represents functions to analyse profit, revenue, cost, quantity sold.
 */
public class AnalysisManager extends ComponentManager implements Analysis {
    private TransactionList transactionList;

    public AnalysisManager(TransactionList transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public Price analyseProfit(AnalysisPeriodType period) {
        return transactionList.calculateTotalProfit();
    }

    @Override
    public Price analyseCost(AnalysisPeriodType period) {
        return transactionList.calculateTotalCost();
    }

    @Override
    public Price analyseRevenue(AnalysisPeriodType period) {
        return transactionList.calculateTotalRevenue();
    }
}
