public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    private int paginasBrancoPreto;

    public Impressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadePaginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = quantidadePaginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.paginasBrancoPreto = totalPaginas - quantidadePaginasColoridas;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }


    public double calcularTotal(){
        double valorTotal = 0;

        if (tamanhoImpressao == TamanhoImpressao.A2 && !ehFrenteVerso){
            valorPretoBrancoFrenteApenas = 0.22;
            valorColoridasFrenteApenas = 0.32;
            valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso){
            valorPretoBrancoFrenteVerso = 0.18;
            valorColoridasFrenteVerso = 0.28;
            valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && !ehFrenteVerso){
            valorPretoBrancoFrenteApenas = 0.20;
            valorColoridasFrenteApenas = 0.30;
            valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso){
            valorPretoBrancoFrenteVerso = 0.15;
            valorColoridasFrenteVerso = 0.25;
            valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A4 && !ehFrenteVerso) {
            valorPretoBrancoFrenteApenas = 0.15;
            valorColoridasFrenteApenas = 0.25;
            valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteApenas) + (paginasColoridas * valorColoridasFrenteApenas);
        } else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso) {
            valorPretoBrancoFrenteVerso = 0.10;
            valorColoridasFrenteVerso = 0.20;
            valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteVerso) + (paginasColoridas * valorColoridasFrenteVerso);
        }
        return valorTotal;

    }

    @Override
    public String toString() {

        String frenteVerso;

        if (ehFrenteVerso){
            frenteVerso = "frente e verso";
        }else {
            frenteVerso = "frente apenas";
        }

        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f", getPaginasTotais(), getPaginasColoridas(), getPaginasTotais() - getPaginasColoridas(),frenteVerso,calcularTotal());
    }


}
