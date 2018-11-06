package seedu.address.ui;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;
import seedu.address.model.transaction.Transaction;

/**
 * Pane containing Transactions
 */
public class TransactionsPanel extends UiPart<Region> {
    private static final String FXML = "TransactionsPanel.fxml";

    @javafx.fxml.FXML
    private ListView<Transaction> transactionListView;

    public TransactionsPanel(ObservableList<Transaction> transactions) {
        super(FXML);
        setConnections(transactions);
        registerAsAnEventHandler(this);
    }

    private void setConnections(ObservableList<Transaction> transactionsList) {
        transactionListView.setItems(transactionsList);
        transactionListView.setCellFactory(listView -> new TransactionListViewCell());
        // setEventHandlerForSelectionChangeEvent();
    }

//    /**
//     * Scrolls to the {@code DrinkCard} at the {@code index} and selects it.
//     */
//    private void scrollTo(int index) {
//        Platform.runLater(() -> {
//            transactionListView.scrollTo(index);
//            transactionListView.getSelectionModel().clearAndSelect(index);
//        });
//    }

//    @Subscribe
//    private void handleJumpToListRequestEvent(JumpToListRequestEvent event) {
//        logger.info(LogsCenter.getEventHandlingLogMessage(event));
//        scrollTo(event.targetIndex);
//    }

    /**
     * Custom {@code ListCell} that displays the graphics of a {@code Transaction} using a {@code TransactionCard}.
     */
    class TransactionListViewCell extends ListCell<Transaction> {
        @Override
        protected void updateItem(Transaction transaction, boolean empty) {
            super.updateItem(transaction, empty);

            if (empty || transaction == null) {
                setGraphic(null);
                setText(null);
            } else {
                setGraphic(new TransactionCard(transaction, getIndex() + 1).getRoot());
            }
        }
    }
}
