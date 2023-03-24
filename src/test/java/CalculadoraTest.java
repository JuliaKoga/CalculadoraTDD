import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamente(){
        //Given
        Calculadora calculadora = new Calculadora();

        //When
        Integer a = 1;
        Integer b = 2;
        Integer resultado = calculadora.somar(a,b);

        //Then
        Assertions.assertEquals(3, resultado);

    }

    @Test
    public void deveSubtrairCorretamente(){
        //Given
        Calculadora calculadora = new Calculadora();

        //When
        Integer a = 10;
        Integer b = 5;
        Integer resultado = calculadora.subtrair(a,b);

        //Then
        Assertions.assertEquals(5, resultado);

    }

    @Test
    public void deveMultiplicarCorretamente(){
        //Given
        Calculadora calculadora = new Calculadora();

        //When
        Integer a = 10;
        Integer b = 5;
        Integer resultado = calculadora.multiplicar(a,b);

        //Then
        Assertions.assertEquals(50, resultado);
    }

    @Test
    public void deveDividirCorretamente() throws Exception {
        //Given
        Calculadora calculadora = new Calculadora();

        //When
        Double a = 10d;
        Double b = 5d;
        Double resultado = calculadora.dividir(a, b);

        //Then
        Assertions.assertEquals(2d, resultado);
    }

    @Test
    public void deveLancarExcecaoQuandoBforZero() throws Exception {
        //Given
        Calculadora calculadora = new Calculadora();

        //When
        Double a = 10d;
        Double b = 0d;
        //Double resultado = calculadora.dividir(a, b);

        //Then
        Throwable throwable = Assertions.assertThrows(
                Exception.class, ()-> calculadora.dividir(a,b));
        Assertions.assertEquals("b não pode ser igual a zero",throwable.getMessage());
    }
}
