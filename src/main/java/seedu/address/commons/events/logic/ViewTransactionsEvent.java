package seedu.address.commons.events.logic;

import seedu.address.commons.events.BaseEvent;

/**
 * Indicates that the ViewTransactions command is called
 */
public class ViewTransactionsEvent extends BaseEvent {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
