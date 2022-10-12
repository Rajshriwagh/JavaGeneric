package com.JavaGenerics;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

    	 logger.info("Hello to Genrics Program!");
         logger.info("Give 3 inputs:");
         Scanner sc = new Scanner(System.in);
         MaxInteger i = new  MaxInteger();
         int inp1 = Integer.parseInt(sc.nextLine());
         int inp2 = Integer.parseInt(sc.nextLine());
         int inp3 = Integer.parseInt(sc.nextLine());
         int ArrayOfInputs[] = { inp1, inp2, inp3 };
         int max = i.calculateMaximum(ArrayOfInputs);
         i.checkMaxAt2ndPos(ArrayOfInputs[1], max);
     }
 }