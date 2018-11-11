package seedu.address.storage.transactions;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.transaction.ReadOnlyTransactionList;
import seedu.address.model.transaction.TransactionList;

/**
 * Represents a storage for {@link seedu.address.model.transaction.TransactionList}.
 */
public interface TransactionListStorage {
    /**
     * Returns the file path of the TransactionList data file.
     */
    Path getTransactionListFilePath();

    /**
     * Returns TransactionList data from storage.
     * Returns {@code Optional.empty()} if storage file is not found.
     *
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException             if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyTransactionList> readTransactionList() throws DataConversionException, IOException;

    /**
     * Saves the given {@link seedu.address.model.transaction.TransactionList} to the storage.
     *
     * @param transactionList cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveTransactionList(ReadOnlyTransactionList transactionList) throws IOException;
}
