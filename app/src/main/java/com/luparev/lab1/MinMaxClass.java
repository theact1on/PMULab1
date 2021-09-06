package com.luparev.lab1;
/**
 * Класс с функциями <b>min</b> и <b>max</b>.
 * @author Максим Лупарев
 * @version 1.0
 */
public class MinMaxClass {
    /**
     * Функция получения минимального значения из двух
     * @param a - первое число
     * @param b - второе число
     * @return возвращает минимальное значение из двух входных
     */
    public static int min(int a,int b){
        if(a<b)return a;
        else return b;
    }
    /**
     * Функция получения максимального значения из двух
     * @param a - первое число
     * @param b - второе число
     * @return возвращает максимальное значение из двух входных
     */
    public static int max(int a,int b){
        if(a>b)return a;
        else return b;
    }
}
