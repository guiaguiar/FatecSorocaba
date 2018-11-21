package fatec.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class APrazo {
	@Id
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }
    public void setTaxajuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }

    public double getValor() {
        return valor;
    }
    public String getDtVencimento() {
        return dtVencimento;
    }
    public double getTaxajuros() {
        return taxaJuros;
    }
    public int getQtdeMensalidade() {
        return qtdeMensalidade;
    }
}