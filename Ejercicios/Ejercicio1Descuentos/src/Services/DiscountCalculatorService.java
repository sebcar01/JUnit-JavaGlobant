package Services;

import Entities.DiscountCalculator;

public class DiscountCalculatorService {

    // Este metodo calcula 3 descuentos: No descuento, 10% y 40%
    public double calcularDescuento(DiscountCalculator dc) {

        if (dc.getValor() < 50) { // No descuento

            return dc.getValor();

        } else if (dc.getValor() > 50 && dc.getValor() < 100) { // 10%

            double descuento = dc.getValor(); // 70
            descuento += dc.getValor() * 0.10;
            dc.setValor(descuento);

            return dc.getValor();

        } else { // 40%

            double descuento = dc.getValor(); // 70
            descuento += dc.getValor() * 0.40;
            dc.setValor(descuento);

            return dc.getValor();

        }

    }


}
