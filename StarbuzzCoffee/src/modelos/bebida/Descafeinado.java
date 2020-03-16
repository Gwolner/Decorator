package modelos.bebida;

import abstrato.bebida.Bebida;


public class Descafeinado extends Bebida{

     public Descafeinado(){
        this.descricao = "Descafeinado";
        this.custo = 1.20;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public Double getCusto() {
        return this.custo;
    }
    
}
