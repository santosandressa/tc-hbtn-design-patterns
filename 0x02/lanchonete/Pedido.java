import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder foraDaCaixa = new StringBuilder("Fora da caixa:");

        for (ItemPedido item : itensForaCaixa) {
            foraDaCaixa.append("\n").append(" - ").append(item.getTipo()).append(" ").append(item.getNome());
        }

        StringBuilder dentroDaCaixa = new StringBuilder("Dentro da caixa:");

        for (ItemPedido item : itensDentroCaixa) {
            dentroDaCaixa.append("\n").append(" - ").append(item.getTipo()).append(" ").append(item.getNome());
        }

        return foraDaCaixa + "\n" + dentroDaCaixa + "\n";
    }
}
