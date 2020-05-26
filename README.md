# Starbuzz Coffee

> Sistema de venda de bebidas (cafés e achocolatado) que se utiliza do design patterns Decorator para acrescentar condimentos (chocolate, leite, chantilly, etc) e manter coerente o cálculo do preço total.

## Problema

Com as várias possibilidades de combinações de uma bebida com seus condimentos, o uso de herança ocasionaria um excesso de classes filho, pois cada um corresponderia a uma combinação da bebida com os condimentos existentes e em várias quantidades. O que tornaria a manutenção do código inviável, alem de gerar várias novas classes para cada condimento ou bebida que fosse acrescentado ao cardápio.

Usar variáveis de instâncias controladas por booleanos também seria inviável pois não permitiria definir a quantidade de bebidas nem a quantidade de condimentos adicionados.

Sendo assim, este projeto faz uso do padrão estrutural Decorator para sanar estes e outros problemas do projeto. O padrão Decorator é um dos tipos de padrões de projetos conhecido como GoF (Gang of Four).

## GoF Decorator

Se quisermos atribuir dinamicamente os condimentos conforme necessidade precisamos entender como o código está estruturado no padrão adotado. Temos uma classe Bebida abstrata (podia ser uma interface, mas a norma que define o padrão decorator defende que seja usado uma classe abstrata). Dela herdam os filhos concretos que serão as bebidas que podem ser servidas com ou sem condimentos.

Uma outra classe abstrata chamada Decorador herda de Bebida e tambem contém uma variável do tipo bebida. Os condimentos, chamados aqui de decoradores, herdam de Decorador e implementam os métodos abstratos de Bebida.


```java
public class StarbuzzCoffee {
    
    public static void main(String[] args){
        
        Bebida bebida = new CafePreto();
        bebida = new Leite(bebida);
        bebida = new Chocolate(bebida);
        
       System.out.println("Seu pedido foi "+bebida.getDescricao());
       System.out.println("Custo total é de: "+bebida.getCusto());
    }
}
```

```java
//Saída
Seu pedido foi Café preto, Leite, Chocolate
Custo total é de: 2.6
```

## Ideia do projeto

A cafeteria Starbuzz foi inspirada no exemplo-problema abordado no livro "Use a Cabeça! Padrões de Projetos", 2ª edição revisada da Editora Alta Books.
