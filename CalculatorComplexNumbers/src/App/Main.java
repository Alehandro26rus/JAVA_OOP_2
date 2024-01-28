// Main.java
package App;

import Calculator.ComplexCalculator;
import Calculator.factory.CalculatorFactory;
import Logger.Logger;
import Logger.impl.ConsoleLogger;

/**
 * Главный класс приложения. Содержит точку входа (метод main).
 */
public class Main {
    public static void main(String[] args) {
        // Используем фабрику для создания калькулятора с консольным логгером
        Logger consoleLogger = new ConsoleLogger();
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        ComplexCalculator calculator = calculatorFactory.createComplexCalculator(consoleLogger);

        // Пример использования калькулятора
        try {
            // Создаем комплексные числа
            Calculator.ComplexNumber num1 = new Calculator.ComplexNumber(2, 3);
            Calculator.ComplexNumber num2 = new Calculator.ComplexNumber(1, 2);

            // Выполняем операции
            Calculator.ComplexNumber sumResult = calculator.add(num1, num2);
            Calculator.ComplexNumber multiplyResult = calculator.multiply(num1, num2);
            Calculator.ComplexNumber divideResult = calculator.divide(num1, num2);

            // Выводим результаты в лог
            consoleLogger.log("Результат сложения: " + sumResult);
            consoleLogger.log("Результат умножения: " + multiplyResult);
            consoleLogger.log("Результат деления: " + divideResult);

        } catch (Calculator.exception.CalculatorException e) {
            e.printStackTrace();  // Обработка исключений, если необходимо
        }
    }
}
