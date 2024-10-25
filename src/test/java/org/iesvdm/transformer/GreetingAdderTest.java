package org.iesvdm.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GreetingAdderTest {

    //Ejercicio6

    @Test
    public void testEjercicio6() {
        LispList<String> lista = new LispList<>(new LispList.Cell<>("Manuel", new LispList.Cell<>("Alejandro", new LispList.Cell<>("Sara", null))));
        GreetingAdder saludo = new GreetingAdder("Saludos, ");
        LispList<String> list = Transformers.transformList(saludo,lista);
        do {
            System.out.println(list.head());
            list = list.tail();
        } while (!list.isEmpty());

    }
}
