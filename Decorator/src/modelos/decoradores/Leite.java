package modelos.decoradores;

import abstrato.bebida.Bebida;
import abstrato.decorator.Decorador;


public class Leite extends Decorador{

    public Leite(Bebida beb){
        this.bebida = beb;
    }
    
    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Leite";
    }

    @Override
    public Double getCusto() {
        return 0.70 + this.bebida.getCusto();
    }
   
}
