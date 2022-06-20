package Aula06;
import Aula05.Date;

public class Pessoa {
    protected String nome; 
    private int cc; 
    protected Date dataNasc; 

    public Pessoa(String nome, int cc, Date dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getNome(){
        return nome;
    }

    public int getCc(){
        return cc;
    }

    public Date getDataNasc(){
        return dataNasc;
    }
    
    public void setNome(){
        this.nome = nome;
    }

    public void setCc(){
        this.cc = cc;
    }

    public void setDataNasc(){
        this.dataNasc = dataNasc;
    }

    @Override

    public String toString(){
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }





}
