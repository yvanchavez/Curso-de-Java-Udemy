package beans;

import javax.ejb.Stateless;

/**
 *
 * @author yvan
 */
@Stateless 
public class HolaMundoEJB {

    public int sumar(int a, int b) {
        return a + b;
    }
}
