import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    @Test
    void testAddAccountToClient(){
        Client client = new Client("Pedro",24,1000,0);
        Account account = new Account(1,3000);
        Account account2 = new Account(2,2000);
        assertAll(
                () -> assertTrue(client.addAccount(account,account2)),
                () -> assertTrue(client.getBankAccounts().contains(account)),
                () -> assertTrue(client.getBankAccounts().contains(account2)),
                () -> assertThrows(ArrayStoreException.class,()->client.addAccount(account))
        );
    }

    @Test
    void testCredit(){
        Client client = new Client("Pedro",24,0,0);

        assertTrue(Credit.assess(client));
    }
}
