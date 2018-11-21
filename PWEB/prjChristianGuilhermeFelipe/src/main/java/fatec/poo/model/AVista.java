package fatec.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AVista {
	@Id
    private double valor;
    private int agencia;
    private int nCheque;
    private String preData; 
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNCheque(int nCheque) {
        this.nCheque = nCheque;
    }
    public void setpreData(String preData) {
        this.preData = preData;
    }

    public double getValor() {
        return valor;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNCheque() {
        return nCheque;
    }
    public String getPreData() {
        return preData;
    }
}