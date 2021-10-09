package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IspitDrzavaTest {

    @Test
    void pomorskaDrzavaTest() {
        Drzava d = new Drzava(1, "Bosna i Hercegovina", null);
        assertFalse(d.isPomorska());
        d.setPomorska(true);
        assertTrue(d.isPomorska());
    }
}
