import java.util.UUID;

public class CalculadorSalarioService {

    private static CalculadorSalarioService instancia;

    public UUID uuid = UUID.randomUUID();

    public static CalculadorSalarioService getInstancia() {
        return instancia;
    }

    public static void setInstancia(CalculadorSalarioService instancia) {
        CalculadorSalarioService.instancia = instancia;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getCalculadorSalarioService() {
        if (instancia == null) {
            instancia = new CalculadorSalarioService();
        }

        return instancia;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorvendas, double percentualComissao) {
        double salarioLiquido = (salarioBruto - valorDescontos) + (valorvendas * (percentualComissao / 100));

        return salarioLiquido;
    }
}
