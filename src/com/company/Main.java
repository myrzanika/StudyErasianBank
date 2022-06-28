package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //1 Вывод текста

    System.out.println("Hello world!");
    System.out.println("Hello world!");

    //2 переменные
    byte num = 2;
    int integer = 535353;
    long l = 577858585;

    float num_2 = 464646.78f;
    double num_3;
    num_3 = 4646464.67f;

    char sym = 'A';
    String str = "Hello world!";
    boolean isActive = true; //false 0/1


    System.out.println("Variable = " + isActive);

    //3 чтение с консоли
    Scanner in = new Scanner(System.in);
    System.out.println("Введите какие-то значения в строке ниже:");
    String str2;
    str2 = in.nextLine();

    System.out.println("Users String = " + str2);


    //4 математические операции

    int num_4 = 34, num_5 = 45, res = 0;
    //res = num_4 + num_5;
    res += num_4;

    res++;
    res--;

    System.out.println("Sum = " + res);

    //5 Условные операторы if

        System.out.println("If" );
        int a = 100, b = 101;
        //  || - или  && - и
    if( a == 100 ) {
        System.out.println("a is bigger than 100" );
    }
    else if(a < 100) {
            System.out.println("100 is bigger than a" );
    }
    else if(a == b) {
        System.out.println("b = a" );
    }
    else {
        System.out.println("a is unknown" );
    }

    //6 Условные операторы switch
        System.out.println("Switch" );

    switch (a){
        case 12:
            System.out.println("a is 12" );
            break;
        case 100:
            System.out.println("a is 100" );
            break;
        case 88:
            System.out.println("a is 88" );
            break;
        default:
            System.out.println("default");
    }

        //7 Циклы for
        System.out.println("For" );

    for(int i = 0; i != 10; i++) {
        System.out.println("i = " + i);
    }

        // Циклы while
        System.out.println("While" );
       int y = 100;

       while( y > 0 ){
           System.out.println("Y = " + y);
           y--;
       }

        // Циклы do...while
        int z = 100;
       do{
            System.out.println("Do...while");
        } while( z < 100 );


        // 8. Массив  Array
        System.out.println("Array");
        int [] array = new int[3];
        array [0] = 2323;
        array [1] = 23;
        array [2] = 33;
        System.out.println(  array[1]  );
        //   {2323, 23, 33}

        System.out.println("Array with FOR");
         int var_arr;
         int [] array2 = new int[4];

        for(int ab = 0; ab < 4; ab++ ){
            array2[ab] = ab;
            System.out.println(array2[ab]);
        }

        //9. Массив Двумернный
        System.out.println("Array 2");
        int [][] array3 = new int[][]{
                {23,33,44,55},
                {66,77,88,99},
                {11,22,33,44}
        };
        System.out.println( array3[1][1]);

        for(int aa = 0; aa < 3; aa++ )
        {
            for (int bb = 0; bb <4; bb++ )
                System.out.print( array3[aa][bb] + " ");

            System.out.println("");
        }

        //10. Функции
        System.out.println("function");
        func_sum( 33,44);
        System.out.println("function2");
        int xx;
        xx = func_sum1(888, 88897);
        System.out.println(xx);

        //11. Class
        System.out.println("Class");

        Person ruslan = new Person();
        ruslan.height = 180;
        ruslan.weight = 55.36f;
        System.out.println(ruslan.height + " " + ruslan.weight);

        Person denis = new Person();
        System.out.println(denis.height + " " + denis.weight);

        Person ardak = new Person(175, 50);
        System.out.println(ardak.height + " " + ardak.weight);

        ardak.say("Ardak say ....");

        Client svetlana = new Client(175, 50, 5656);
        System.out.println(svetlana.height + " " + svetlana.weight + " " + svetlana.id);

        svetlana.say("Svetlana say ....");

    }
    ///public int xxx = 1000;
    public static void func_sum(int a, int b){
        int res;
        res = a +b;
        System.out.println(res);
    }

    public static int func_sum1(int r, int p){
        int res;
        res = r +p;
        return res;
    }


}
