package testAccount;
import org.example.Account;
import io.qameta.allure.*;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    @Description("Проверка имени с допустимой длиной")
    @Severity(SeverityLevel.NORMAL)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени короче допустимой длины")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameTooShort() {
        Account account = new Account("Тим");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени длиннее допустимой длины")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameTooLong() {
        Account account = new Account("Тимоти Тимоти Тимоти Тимоти");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени с несколькими пробелами")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameWithMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени с ведущим пробелом")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameWithLeadingSpace() {
        Account account = new Account(" Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени с завершающим пробелом")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameWithTrailingSpace() {
        Account account = new Account("Тимоти Шаламе ");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени без пробелов")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameWithoutSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени со значением null")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNullName() {
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка пустого имени")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testEmptyName() {
        Account account = new Account("");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @Description("Проверка имени, содержащего только пробелы")
    @Severity(SeverityLevel.MINOR)
    @Story("Проверка имени на карте")
    @Feature("Функциональность имен")
    public void testNameWithOnlySpaces() {
        Account account = new Account("   ");
        assertFalse(account.checkNameToEmboss());
    }
}


