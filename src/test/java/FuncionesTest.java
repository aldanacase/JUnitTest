import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionesTest {

    private Funciones funciones = new Funciones();


    @Test
    public void getNombreConNombreDistintoDeVacio(){
        String result = funciones.getNombre("Aldana");
        assertEquals("Aldana", result);
    }

    @Test
    public void getNombreConNombreIgualAVacio(){
        String result = funciones.getNombre("");
        assertEquals(null, result);
    }

    @Test
    public void anioValidoTest(){
        boolean result = funciones.anioValido(1990);
        assertTrue(result);
    }

    @Test
    public void anioValidoConAnioInvalidoTest(){
        boolean result = funciones.anioValido(2022);
        assertFalse(result);
    }

    @Test
    public void convertirFloatAEnteroCon1erDecimalMenorA5Test(){
        int result = funciones.convertirFloatAEntero(1.4f);
        assertEquals(1, result);
    }

    @Test
    public void convertirFloatAEnteroCon1erDecimalMayorA5Test(){
        int result = funciones.convertirFloatAEntero(3.7f);
        assertEquals(4, result);
    }

    @Test
    public void convertirFloatAEnteroCon1erDecimalIgualA5Test(){
        int result = funciones.convertirFloatAEntero(6.5f);
        assertEquals(7, result);
    }

    @Test
    public void convertirFloatAEnteroConNumeroNegativoTest(){
        int result = funciones.convertirFloatAEntero(-5.2f);
        assertEquals(-5, result);
    }

}
