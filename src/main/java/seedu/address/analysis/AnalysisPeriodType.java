package seedu.address.analysis;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.HYPHEN_DAY;
import static seedu.address.logic.parser.CliSyntax.HYPHEN_MONTH;
import static seedu.address.logic.parser.CliSyntax.HYPHEN_WEEK;

import java.util.function.Predicate;

import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.transaction.Transaction;


/**
 * Represents the possible analysis periods to be analysed.
 */
public enum AnalysisPeriodType {
    DAY() {
        @Override
        public Predicate<Transaction> getPeriodFilterPredicate() {
            return new TransactionInDayPredicate();
        }
    },

    WEEK() {
        @Override
        public Predicate<Transaction> getPeriodFilterPredicate() {
            return new TransactionInSevenDaysPredicate();
        }
    },

    MONTH {
        @Override
        public Predicate<Transaction> getPeriodFilterPredicate() {
            return new TransactionInThirtyDaysPredicate();
        }
    };


    public static final String WRONG_PERIOD_MESSAGE = "You have entered an invalid period";

    public abstract Predicate<Transaction> getPeriodFilterPredicate();

}
