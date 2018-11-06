package seedu.address.analysis;

import java.util.function.Predicate;

import seedu.address.model.transaction.Transaction;

/**
 * Represents the possible analysis periods to be analysed.
 */
public enum AnalysisPeriodType {
    DAY() {
        @Override
        public Predicate<Transaction> predicateToFilter() {
            return new TransactionInDayPredicate();
        }
    },

    WEEK() {
        @Override
        public Predicate<Transaction> predicateToFilter() {
            return new TransactionInDayPredicate();
        }
    },

    MONTH {
        @Override
        public Predicate<Transaction> predicateToFilter() {
            return new TransactionInDayPredicate();
        }
    };

    public abstract Predicate<Transaction> predicateToFilter();
}
