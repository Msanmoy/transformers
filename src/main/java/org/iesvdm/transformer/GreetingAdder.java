package org.iesvdm.transformer;


//Ejercicio6

import javax.print.DocFlavor;

public class GreetingAdder implements Transformer<String> {

    private String str;

    public GreetingAdder(String text) {
        str = text;
    }

    public String transform(String obj) {
        return str + " " + obj;
    }
}
