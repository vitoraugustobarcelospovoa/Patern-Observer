package com.finan.orcamento.model;
import java.util.ArrayList;
import java.util.List;
import com.finan.orcamento.model.OrcamentoModel;


public class EstoqueModel {
    private List<Observer> observers = new ArrayList<>();
    private double valor;

    public double getValorOrcamento() {
        return valor;
    }

    public void setValorOrcamento(double valor) {
        this.valor = valor;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

interface Observer {
    void update(EstoqueModel estoque);

}
