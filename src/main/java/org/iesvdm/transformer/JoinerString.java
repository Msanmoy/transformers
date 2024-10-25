package org.iesvdm.transformer;


//Ejercicio 8
public class JoinerString implements Joiner<String>{

    @Override
    public String join(String obj1, String obj2) {
        return obj1 + " " + obj2;
    }
}


