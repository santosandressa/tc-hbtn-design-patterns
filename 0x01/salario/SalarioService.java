import java.util.UUID;

public class SalarioService {

    private CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadorSalarioService();

    public double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        double result = calculador.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);
        return result;
    }

    public UUID getUuid(){
        return calculador.getUuid();
    }
}
