public interface ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadePaginasColoridas, boolean ehFrenteVerso) {
        return new Impressao(tamanhoImpressao, totalPaginas, quantidadePaginasColoridas, ehFrenteVerso);
    }

}
