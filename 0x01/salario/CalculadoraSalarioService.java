import java.util.UUID;

public class CalculadoraSalarioService {

    private static CalculadoraSalarioService instancia;

    public UUID uuid = UUID.randomUUID();

    public static CalculadoraSalarioService getInstancia() {
        return instancia;
    }

    public static void setInstancia(CalculadoraSalarioService instancia) {
        CalculadoraSalarioService.instancia = instancia;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private CalculadoraSalarioService() {
    }

    public static CalculadoraSalarioService getCalculadoraSalarioService() {
        if (instancia == null) {
            instancia = new CalculadoraSalarioService();
        }

        return instancia;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorvendas, double percentualComissao) {
        double salarioLiquido = (salarioBruto - valorDescontos) + (valorvendas * (percentualComissao / 100));

        return salarioLiquido;
    }
}
