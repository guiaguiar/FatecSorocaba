package fatec.poo.model;

import static java.lang.Integer.parseInt;

public class Pessoa {
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
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDataNasc(String dataNasc) {
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
    
    public String removerMascara(String valor) {
        valor = valor.replaceAll(".","").replaceAll("-","").replaceAll("(", "").replaceAll(")","").replaceAll(" ","");
        return valor;
    }
    
    public boolean ValidarCPF(String strCpf){
        int Cpf = parseInt(strCpf.replaceAll(".", "").replaceAll("-",""));
        int DigVer = Cpf / 10, Soma = 0;
        /* Verificação de segundo digito depois do traço */
        for(int i = 2; i <= 11; i++){
            if (i < 11){
                Soma = Soma + (i * (DigVer % 10));
                DigVer = DigVer / 10;
            }
            if (i == 11){
                Soma = Soma + (i * DigVer);   
            }
        }
        DigVer = (Soma * 10) % 11;
        if (DigVer != (Cpf % 10)){
            return false;
        }
        /* Verificação do primeiro digito depois do traço */
        Soma = 0;
        DigVer = Cpf / 100;
        for(int i = 2; i <= 10; i++){
            if (i < 10){
                Soma = Soma + (i * (DigVer % 10));
                DigVer = DigVer / 10;
            }
            if (i == 10){
                Soma = Soma + (i * DigVer);   
            }
        }
        Cpf = Cpf / 10;
        DigVer = (Soma * 10) % 11;
        if (DigVer != (Cpf % 10)){
            return false;
        }
        return true;
    }
    
}