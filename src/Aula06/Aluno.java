package Aula06;

import Aula05.Date;
import java.time.LocalDate;

public class Aluno extends Pessoa{
    private static int nMecCount = 100;

    private final int nMec;
    private Date dataInsc;



    public Aluno(String nome, int cc, Date dataNasc, Date dataIsnc){
        super(nome, cc, dataNasc);
        this.nMec = nMecCount++;
        this.dataInsc = dataIsnc;

    }
    
    public Aluno(String nome, int cc, Date dataNasc) {
        super(nome, cc, dataNasc);
        this.nMec = nMecCount++;
        this.dataInsc = getCurrentDate();
    }

    private Date getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return new Date(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }

    public int getNMec() {
        return nMec;
    }

    public Date getDataInsc() {
        return dataInsc;
    }

    public void setDataInsc(Date dataInsc) {
        this.dataInsc = dataInsc;
    }

    @Override
    public String toString() {
        return nome + "; Numero Mecanografico: " + nMec + "; Data de Nascimento: " + dataNasc + "; Data de Inscrição: " +dataInsc;
    }
    
}
