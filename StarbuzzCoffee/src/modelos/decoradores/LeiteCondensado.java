package modelos.decoradores;

import abstrato.bebida.Bebida;
import abstrato.decorator.Decorador;


public class LeiteCondensado extends Decorador{

    public LeiteCondensado(Bebida beb){
        this.bebida = beb;
    }
    
    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Leite condensado";
    }

    @Override
    public Double getCusto() {
        return 0.70 + this.bebida.getCusto();
    }
   
}