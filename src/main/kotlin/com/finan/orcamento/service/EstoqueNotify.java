package com.finan.orcamento.service;

import com.finan.orcamento.model.EstoqueModel;
import com.finan.orcamento.model.EstoqueObserver;
import com.finan.orcamento.model.GerenteModel;

public class EstoqueNotify {
    public static void main(String[] args) {
        GerenteModel gerente = new GerenteModel(1L, "João", 3000.0);
        EstoqueModel estoque = new EstoqueModel();

        EstoqueObserver observer = new EstoqueObserver();
        estoque.addObserver(observer);

        estoque.setValorOrcamento(1200.0);
        estoque.setValorOrcamento(800.0);
        estoque.setValorOrcamento(1500.0);
    }
}
