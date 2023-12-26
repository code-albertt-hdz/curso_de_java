package org.alberttcode.patrones.decorator2.decorador;

import org.alberttcode.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{
    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 9f ;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + " ,leche de almendra";
    }
}
