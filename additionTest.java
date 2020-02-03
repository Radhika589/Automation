
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class additionTest {

    @Test
    public void add() {
        addition ad = new addition();
        int expResult = 30;
        int c = ad.add(10,20);
        assertEquals(expResult,c);
    }
}