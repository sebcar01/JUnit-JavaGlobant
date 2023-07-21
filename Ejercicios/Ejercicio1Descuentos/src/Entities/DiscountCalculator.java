package Entities;

public class DiscountCalculator {

    private double valor;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "DiscountCalculator{" +
                "valor=" + valor +
                '}';
    }
}
