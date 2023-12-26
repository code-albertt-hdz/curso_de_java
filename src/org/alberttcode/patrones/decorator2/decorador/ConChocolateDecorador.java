package org.alberttcode.patrones.decorator2.decorador;

import org.alberttcode.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{
    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() +  5f ;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + " y chocolate";
    }
}
