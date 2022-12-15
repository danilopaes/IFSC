package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteCalculadora {
    @Test
    void testeSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(1, 2);
        assertEquals(3, resultado);
    }
}
