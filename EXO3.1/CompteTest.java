import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CompteTest {
    @Test(expected = IllegalArgumentException.class)
    public void testContructeur(){
        Compte c = new Compte(100);
        double x=100;
        assertEquals((Double.valueOf(x)),(Double.valueOf(c.getSolde())));
        Compte co = new Compte(-10);
        
    }
    
    @Test
    public void testVirement(){
    Compte c = new Compte(100);
    Compte c1 = new Compte(1000);
    double vir=200;
    c1.Virement(vir,c);
    double x=300;
    assertEquals((Double.valueOf(x)),(Double.valueOf(c.getSolde())));
    }
    
    @Test
    public void testDebit(){    
    Compte c = new Compte(1000);
    double x=100;
    c.debit(x);
    double z=900;
    assertEquals((Double.valueOf(z)),(Double.valueOf(c.getSolde())));
    }
    @Test
    public void testCredit(){    
    Compte c = new Compte(1000);
    double x=100;
    c.credit(x);
    double z=1100;
    assertEquals((Double.valueOf(z)),(Double.valueOf(c.getSolde())));
    }
  
}
