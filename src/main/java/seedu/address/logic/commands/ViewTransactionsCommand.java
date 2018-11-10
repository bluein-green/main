package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_TRANSACTIONS;

import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;
import seedu.address.model.user.stocktaker.StockTakerModel;

/**
 * Sell a drink from inventory.
 * // TODO: STUB
 */
public class ViewTransactionsCommand extends Command {

    public static final String COMMAND_WORD = "viewTrans";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": View all transactions recorded in Drink I/O ";

    public static final String MESSAGE_SUCCESS = "Listed all %s";


    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        requireNonNull(model);
        assert model instanceof StockTakerModel;
        StockTakerModel stockTakerModel = (StockTakerModel) model;

        stockTakerModel.updateFilteredTransactionList(PREDICATE_SHOW_ALL_TRANSACTIONS);

        return new CommandResult(String.format(MESSAGE_SUCCESS + stockTakerModel.getTransactionList()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ViewTransactionsCommand); // instanceof handles nulls;
    }
}
