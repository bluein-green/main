package seedu.address.commons.events.model;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.transaction.TransactionList;

/**
 * Indicates the InventoryList in the model has changed
 */
public class TransactionListChangedEvent extends BaseEvent {

    public final TransactionList data;

    public TransactionListChangedEvent(TransactionList data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "number of transactions: " + data.getTransactionList().size();
    }

    public TransactionList getData() {
        return data;
    }
}
