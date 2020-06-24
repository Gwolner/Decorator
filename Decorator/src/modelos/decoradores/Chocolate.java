package modelos.decoradores;

import abstrato.bebida.Bebida;
import abstrato.decorator.Decorador;


public class Chocolate extends Decorador{

    public Chocolate(Bebida beb){
        this.bebida = beb;
    }
    
    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Chocolate";
    }

    @Override
    public Double getCusto() {
        return 0.90 + this.bebida.getCusto();
    }
   
}
