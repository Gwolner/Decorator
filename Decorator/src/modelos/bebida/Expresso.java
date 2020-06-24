package modelos.bebida;

import abstrato.bebida.Bebida;


public class Expresso extends Bebida{

    public Expresso(){
        this.descricao = "Expresso";
        this.custo = 1.60;
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
