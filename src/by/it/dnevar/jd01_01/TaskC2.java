<<<<<<< HEAD
package by.it.dnevar.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println("DEC:" + i + "+" + j + "=" + (i+j));
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(j) + "=" + Integer.toBinaryString(i+j));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(j) + "=" + Integer.toHexString(i+j));
        System.out.println("OCT:" + Integer.toString(i,8) + "+" + Integer.toString(j,8) + "=" + Integer.toString(i+j,8));
    }

}
=======
package by.it.dnevar.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println("DEC:" + i + "+" + j + "=" + (i+j));
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(j) + "=" + Integer.toBinaryString(i+j));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(j) + "=" + Integer.toHexString(i+j));
        System.out.println("OCT:" + Integer.toString(i,8) + "+" + Integer.toString(j,8) + "=" + Integer.toString(i+j,8));
    }

}
>>>>>>> 3abf1a8c53a58aa3c04bb02acc8bea4f6e0447df
