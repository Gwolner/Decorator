package modelos.bebida;

import abstrato.bebida.Bebida;


public class Achocolatado extends Bebida{

   public Achocolatado(){
        this.descricao = "Achocolatado";
        this.custo = 2.00;
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
