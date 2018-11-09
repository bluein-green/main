package seedu.address.commons.events.logic;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.transaction.TransactionList;

/**
 * Indicates that the ViewTransactions command is called
 */
public class ViewTransactionsEvent extends BaseEvent {
    public final TransactionList data;

    public ViewTransactionsEvent(TransactionList data) {
        this.data = data;
    }

    public TransactionList getData() {
        return data;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
