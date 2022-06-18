import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilTest {

    @Test
    void mdcP1Pares() {
        final int a = 8, b = 2, esperado = b;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testeMdcAImpar(){
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

}