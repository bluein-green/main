package seedu.address.storage.transactions;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.commons.util.JsonUtil;
import seedu.address.model.transaction.TransactionList;

public class JsonTransactionListStorage implements TransactionListStorage {
    private Path filePath;

    public JsonTransactionListStorage(Path filePath) {
        this.filePath = filePath;
    }

    @Override
    public Path getTransactionListFilePath() {
        return filePath;
    }

    @Override
    public Optional<TransactionList> readTransactionList() throws DataConversionException {
        return readTransactionList(filePath);
    }

    /**
     * Similar to {@link #readTransactionList()}
     * @param transactionsFilePath location of the data. Cannot be null.
     * @throws DataConversionException if the file format is not as expected.
     */
    public Optional<TransactionList> readTransactionList(Path transactionsFilePath) throws DataConversionException {
        return JsonUtil.readJsonFile(transactionsFilePath, TransactionList.class);
    }

    @Override
    public void saveTransactionList(TransactionList transactionList) throws IOException {
        JsonUtil.saveJsonFile(transactionList, filePath);
    }
}
