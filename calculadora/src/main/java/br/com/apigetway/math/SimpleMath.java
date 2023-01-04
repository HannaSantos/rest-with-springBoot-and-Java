package br.com.apigetway.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double median(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double root(Double numberOne) {
        return Math.sqrt(numberOne);
    }
}
