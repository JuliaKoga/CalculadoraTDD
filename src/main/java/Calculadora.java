public class Calculadora {

    public Integer somar(Integer a, Integer b) {
        return a + b;
    }
    public Integer subtrair(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    public Double dividir(Double a, Double b) throws Exception {
        if (b!=0d) {
            return a/b;
        }else {
            throw new Exception("b não pode ser igual a zero");
        }
    }
}
