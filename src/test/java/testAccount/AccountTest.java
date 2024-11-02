package testAccount;

import org.example.Account;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameTooShort() {
        Account account = new Account("Тим");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameTooLong() {
        Account account = new Account("Тимоти Тимоти Тимоти Тимоти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithLeadingSpace() {
        Account account = new Account(" Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithTrailingSpace() {
        Account account = new Account("Тимоти Шаламе ");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithoutSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNullName() {
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testEmptyName() {
        Account account = new Account("");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithOnlySpaces() {
        Account account = new Account("   ");
        assertFalse(account.checkNameToEmboss());
    }
}

