package storage;

import command.CommandAdd;
import data.Currency;
import data.ExpenseList;
import org.junit.jupiter.api.Test;
import parser.Parser;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StorageTest {
    public Parser parser = new Parser();
    public ExpenseList expenseList  = new ExpenseList();

    public ExpenseList testExpenseList = new ExpenseList();
    public Currency currency = new Currency();

    @Test
    void saveAndReadTest_successful() {

    }
}
