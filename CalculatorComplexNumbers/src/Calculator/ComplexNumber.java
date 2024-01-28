// ComplexNumber.java
package Calculator;

/**
 * Класс ComplexNumber представляет комплексное число и
 * определяет базовые арифметические операции для комплексных чисел.
 */
public class ComplexNumber {
    private double real;         // Реальная часть комплексного числа
    private double imaginary;    // Мнимая часть комплексного числа

    /**
     * Конструктор ComplexNumber.
     *
     * @param real      Реальная часть комплексного числа.
     * @param imaginary Мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры, сеттеры и другие методы

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Другие методы, если необходимо

    /**
     * Переопределение метода toString для корректного отображения значения комплексного числа.
     *
     * @return Строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
