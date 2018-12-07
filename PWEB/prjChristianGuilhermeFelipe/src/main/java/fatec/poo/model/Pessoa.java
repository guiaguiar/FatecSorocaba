package fatec.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.JOINED)
@Entity
public class Pessoa {
	@Id
    private String nome;
    private String dataNasc;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Pessoa() {
    }
    
    public void setDataNac(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCEP(String cep) {
        this.cep = cep;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public void setRG(String rg) {
        this.rg = rg;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getNumero() {
        return numero;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCEP() {
        return cep;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCelular() {
        return celular;
    }
    public String getSexo() {
        return sexo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getRG() {
        return rg;
    }
    public String getCPF() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
}