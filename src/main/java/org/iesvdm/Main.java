package org.iesvdm;

import org.iesvdm.transformer.LispList;
import org.iesvdm.transformer.Transformer;

import static org.iesvdm.transformer.Transformers.transformList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }


        //Ejercicio5 prueba
        System.out.println("Prueba Ejercicio5");

            LispList<Integer> lista = LispList.empty();
            lista = lista.cons(5).cons(4).cons(3).cons(2).cons(1);

            Transformer<Integer> doubleTransformer = (Integer x) -> x * 2;

            LispList<Integer> transformedList = transformList(doubleTransformer, lista);

            System.out.println("Lista original: " + lista);
            System.out.println("Lista transformada: " + transformedList);

    }


}