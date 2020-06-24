package modelos.decoradores;

import abstrato.bebida.Bebida;
import abstrato.decorator.Decorador;


public class Chantilly extends Decorador{

    public Chantilly(Bebida beb){
        this.bebida = beb;
    }
    
    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Chantilly";
    }

    @Override
    public Double getCusto() {
        return 0.85 + this.bebida.getCusto();
    }
   
}