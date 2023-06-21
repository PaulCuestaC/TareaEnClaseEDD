/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajoedd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author LAB-05
 */
public class Cola {

    Queue<String> cola = new LinkedList<>();
    List<String> colaTotal = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void agregarCola() {
        System.out.println("Digite cuantos elementos va a ingresar: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {

            System.out.println("Ingrese el elemento: ");
            String elemento = sc.next();
            cola.add(elemento);
        }
    }

    public void recorrer() {
        for (String string : cola) {
            System.out.println(string);

        }
    }

    public void ordenar() {
        for (int i = 0; i < cola.size(); i++) {
            if(i<=cola.size()/2){
            if (!(cola.peek().equals(")")) ) {

                if (cola.peek() != "]") {
                    if (cola.peek() != "}") {

                        String colita = cola.poll();

                        System.out.println(colita);
                        colaTotal.add(colita);
                        for (String string : colaTotal) {
                            System.out.print(string);

                        }

                    }
                }
            }
            }else{
                System.out.println("");
                colaTotal.remove(colaTotal.size()-1);
               for (String string : colaTotal) {
                            System.out.print(string);

                        }
            }
            
        }
    }

    
    }
