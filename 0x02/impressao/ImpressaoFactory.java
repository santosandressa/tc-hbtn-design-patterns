public interface ImpressaoFactory {
    static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadePaginasColoridas, boolean ehFrenteVerso) {
        return new Impressao(tamanhoImpressao,totalPaginas,quantidadePaginasColoridas,ehFrenteVerso);
    }

}
