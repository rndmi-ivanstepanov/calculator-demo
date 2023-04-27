package pro.sky.course2.calculatordemo.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleOperationsImpl implements SimpleOperations {

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            return "Для выполнения операции сложения вам требуется ввести два числа";
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            return "Для выполнения операции вычитания вам требуется ввести два числа";
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            return "Для выполнения операции умножения вам требуется ввести два числа";
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            return "Для выполнения операции деления вам требуется ввести два числа";
        if (num2 == 0)
            return "На 0 делить нельзя";
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
