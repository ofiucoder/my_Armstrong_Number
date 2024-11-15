package dev.ofiucoder.myarmstrongnumber.views;

import java.util.Scanner;

public class View {

    private Scanner  scanner;

    public View(){
        this.scanner = new Scanner(System.in);
    }
    public int index(){
        System.out.println("Ingrese un numero:  ");
        return scanner.nextInt();
    }
} 
