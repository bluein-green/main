package seedu.address.model.drink;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.address.model.testutil.Assert;

public class PriceTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Price(null));
    }

    @Test
    public void constructor_invalidPrice_throwsIllegalArgumentException() {
        String invalidPrice = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Price(invalidPrice));
        Assert.assertThrows(IllegalArgumentException.class, () -> new Price("bla"));
    }

    @Test
    public void isValidPrice() {
        // null price
        Assert.assertThrows(NullPointerException.class, () -> Price.isValidPrice(null));

        // invalid prices
        assertFalse(Price.isValidPrice("")); // empty string
        assertFalse(Price.isValidPrice(" ")); // spaces only
        assertFalse(Price.isValidPrice("9.1234395893")); // more than 2 decimal digits
        assertFalse(Price.isValidPrice(".25")); // only decimal digits
        assertFalse(Price.isValidPrice(".")); // only decimal dot
        assertFalse(Price.isValidPrice("12.")); // nothing after decimal dot
        assertFalse(Price.isValidPrice("price")); // non-numeric
        assertFalse(Price.isValidPrice("9011p041")); // alphabets within digits
        assertFalse(Price.isValidPrice("9312 1534")); // spaces within digits
        assertFalse(Price.isValidPrice("123456789023456789012345678901234567890123456789012345678901234567890"));
        // very large prices, more than Float.MAX_VALUE
        assertFalse(Price.isValidPrice("-1.25")); // negative values

        // valid prices
        assertTrue(Price.isValidPrice("0")); // 0
        assertTrue(Price.isValidPrice("9")); // 1 digit
        assertTrue(Price.isValidPrice("9.2")); // 1 digit with 1 decimal digit
        assertTrue(Price.isValidPrice("9.31")); // 1 digit with 2 decimal digits
        assertTrue(Price.isValidPrice("92231.23")); // reasonably large prices, less than Float.MAX_VALUE
    }

}
