package seedu.address.analysis;

import static org.junit.Assert.assertTrue;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import org.junit.Test;

import seedu.address.model.drink.Date;
import seedu.address.model.drink.Drink;
import seedu.address.model.drink.Price;
import seedu.address.model.drink.Quantity;
import seedu.address.model.transaction.Transaction;
import seedu.address.model.transaction.TransactionType;
import seedu.address.testutil.transaction.TransactionBuilder;

public class TransactionInADayPredicateTest {
    @Test
    public void test_isWithinDay_returnsTrue() {
        TransactionInDayPredicate predicate = new TransactionInDayPredicate();
        Transaction transactionToday = new TransactionBuilder().withDrink("Pepsi").withDateToday()
                .withTransactionType("sale")
                .withAmountMoney("5.00")
                .withQuantity("40")
                .build();
        assertTrue(predicate.test(transactionToday));
    }

    // TODO: test for failure, but with Transaction initialising date to current date, it is not possible to test
//    @Test
//    public void test_isNotWithinDay_returnsFalse() {
//        TransactionInDayPredicate predicate = new TransactionInDayPredicate();
//        Transaction transactionToday = new TransactionBuilder().withDrink("Pepsi").withDateToday()
//                .withTransactionType("sale")
//                .withAmountMoney("5.00")
//                .withQuantity("40")
//                .build();
//    }
//
//
//    private class TransactionStub extends Transaction {
//        private TransactionType transactionType;
//        private Date transactionDate;
//        private Drink drinkTransacted;
//        private Quantity quantityTransacted;
//        private Price amountMoney;
//        private long id;
//
//        public TransactionStub(TransactionType transactionType, Drink drinkTransacted,
//                               Quantity quantityTransacted, Price amountMoney, Date date) {
//            requireAllNonNull(transactionType, drinkTransacted, quantityTransacted, amountMoney);
//            this.transactionType = transactionType;
//            this.drinkTransacted = drinkTransacted;
//            this.quantityTransacted = quantityTransacted;
//            this.amountMoney = amountMoney;
//            this.transactionDate = date;
//            id = new java.util.Date().getTime();
//        }
//    }
}
