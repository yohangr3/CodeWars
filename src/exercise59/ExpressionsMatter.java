package exercise59;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ExpressionsMatter {
    @Test
    public void checkSmallValues() {
        assertEquals(6, MaximoValor.expressionsMatter(2, 1, 2));
        assertEquals(3, MaximoValor.expressionsMatter(1, 1, 1));
        assertEquals(4, MaximoValor.expressionsMatter(2, 1, 1));
        assertEquals(9, MaximoValor.expressionsMatter(1, 2, 3));
        assertEquals(5, MaximoValor.expressionsMatter(1, 3, 1));
        assertEquals(8, MaximoValor.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals( 20, MaximoValor.expressionsMatter(5, 1, 3));
        assertEquals(105, MaximoValor.expressionsMatter(3, 5, 7));
        assertEquals( 35, MaximoValor.expressionsMatter(5, 6, 1));
        assertEquals(  8, MaximoValor.expressionsMatter(1, 6, 1));
        assertEquals( 14, MaximoValor.expressionsMatter(2, 6, 1));
        assertEquals( 48, MaximoValor.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals( 60, MaximoValor.expressionsMatter( 2, 10,  3));
        assertEquals( 27, MaximoValor.expressionsMatter( 1,  8,  3));
        assertEquals(126, MaximoValor.expressionsMatter( 9,  7,  2));
        assertEquals( 20, MaximoValor.expressionsMatter( 1,  1, 10));
        assertEquals( 18, MaximoValor.expressionsMatter( 9,  1,  1));
        assertEquals(300, MaximoValor.expressionsMatter(10,  5,  6));
        assertEquals( 12, MaximoValor.expressionsMatter( 1, 10,  1));
    }
}
