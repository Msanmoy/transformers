package org.iesvdm.transformer;


import java.util.ArrayList;
import java.util.Iterator;

//Ejercicio7
public class CherckerUtils {

    public static <T> void remover(Checker<T> checker, ArrayList<T> list){
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()){
            T item = iterator.next();
            if(!checker.check(item)){iterator.remove();}
        }
    }

    //Prueba Ejercicio7
    public static void main(String[] args){
        CheckCheckerInteger checker = new CheckCheckerInteger();

        for (int i = 0; i < 10; i++) {
            System.out.println("El número " + i + " es par? : " + checker.check(i));
        }
    }

}
