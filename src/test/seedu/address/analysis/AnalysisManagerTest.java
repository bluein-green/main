package seedu.address.analysis;

import static seedu.address.testutil.transaction.TypicalTransactions.getTypicalFilteredTransactions;
import static seedu.address.testutil.transaction.TypicalTransactions.getTypicalTransactionList;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AnalysisManagerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private AnalysisManager analysisManager = new AnalysisManager(getTypicalTransactionList(),
            getTypicalFilteredTransactions());


    // analyseProfit
    // analyseCost
    // analyseRevenue
    // calculateTotalProfit
    // calculateTotalCost
    // calculateTotalRevenue


    @Test
    public void calculateTotalProfit() {
        //analysisManager.analyseProfit()
    }
}
