package modelos.bebida;

import abstrato.bebida.Bebida;


public class CafePreto extends Bebida{

    public CafePreto(){
        this.descricao = "Café preto";
        this.custo = 1.00;
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
