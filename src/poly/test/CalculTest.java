package poly.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poly.metier.Calcul;
import poly.metier.CalculCarre;
import poly.metier.CalculSomme;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CalculTest {

    @Test
    public void testPithagoreWithConcreteObjects() {
        CalculCarre calculCarre = new CalculCarre();
        CalculSomme calculSomme = new CalculSomme();
        Calcul calcul = new Calcul(calculCarre, calculSomme);

        double result = calcul.pithagore(3, 4);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testPithagoreWithMockObjects() {
        CalculCarre mockCalculCarre = mock(CalculCarre.class);
        CalculSomme mockCalculSomme = mock(CalculSomme.class);
        Calcul calcul = new Calcul(mockCalculCarre, mockCalculSomme);
        
        
        when(mockCalculCarre.carre(5, 2)).thenReturn(25.0);
        when(mockCalculCarre.carre(9, 2)).thenReturn(81.0);
        when(mockCalculSomme.somme(25.0, 81.0)).thenReturn(106.0);

        double result = calcul.pithagore(5, 9);

        assertEquals(10.2956, result, 0.0001);

    }
}
