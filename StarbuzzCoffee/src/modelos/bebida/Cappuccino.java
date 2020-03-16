package modelos.bebida;

import abstrato.bebida.Bebida;


public class Cappuccino extends Bebida{

     public Cappuccino(){
        this.descricao = "Cappuccino";
        this.custo = 1.95;
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
