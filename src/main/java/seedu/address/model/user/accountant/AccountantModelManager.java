package seedu.address.model.user.accountant;

import seedu.address.model.LoginInfoManager;
import seedu.address.model.ModelManager;
import seedu.address.model.ReadOnlyInventoryList;
import seedu.address.model.UserPrefs;
import seedu.address.model.drink.Price;
import seedu.address.model.transaction.TransactionList;

/**
 * Represents the in-memory model of the accountant command
 */
public class AccountantModelManager extends ModelManager implements AccountantModel {
    public AccountantModelManager(ReadOnlyInventoryList inventoryList,
                                  UserPrefs userPrefs, LoginInfoManager loginInfoManager,
                                  TransactionList transactionList) {
        super(inventoryList, userPrefs, loginInfoManager, transactionList);
    }

    @Override
    public Price analyseCosts() {
        return analysis.analyseCost();
    }

    @Override
    public Price analyseRevenue() {
        return analysis.analyseRevenue();
    }

    @Override
    public Price analyseProfit() {
        return analysis.analyseProfit();
    }

}
