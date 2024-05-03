package com.finan.orcamento.model;

public class EstoqueObserver implements Observer {
    private static final double LIMITE = 1000.0;

    @Override
    public void update(EstoqueModel estoque) {
        if (estoque.getValor() > LIMITE) {
            System.out.println("Alerta: O valor do estoque ultrapassou 1000 reais!");
        }
    }
}
