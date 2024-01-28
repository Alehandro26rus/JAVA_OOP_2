// Calculator/ComplexCalculator.java
package Calculator;

import Calculator.exception.CalculatorException;

/**
 * Интерфейс ComplexCalculator определяет базовые арифметические операции для комплексных чисел.
 */
public interface ComplexCalculator {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);

    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);

    ComplexNumber divide(ComplexNumber a, ComplexNumber b) throws CalculatorException;
}
