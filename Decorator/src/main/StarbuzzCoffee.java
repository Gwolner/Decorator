package main;

import abstrato.bebida.Bebida;
import modelos.bebida.*;
import modelos.decoradores.*;


public class StarbuzzCoffee {
    
    public static void main(String[] args){
        
        Bebida bebida = new CafePreto();
        bebida = new Leite(bebida);
        bebida = new Chocolate(bebida);
        
       System.out.println("Seu pedido foi "+bebida.getDescricao());
       System.out.println("Custo total é de: "+bebida.getCusto());
    }
}
