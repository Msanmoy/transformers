package org.iesvdm.transformer;


import java.util.ArrayList;
import java.util.Iterator;

public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    // Ejercicio 4

    public static <T, U, R> ArrayList<R> zipArrayLists(ArrayList<T> l1, ArrayList<U> l2, MultipleJoiner<T,U,R> joiner){
        ArrayList<R> result = new ArrayList<>();
        int minSize = Math.min(l1.size(), l2.size());

        for (int i = 0; i < minSize; i++) {
            result.add(joiner.apply(l1.get(i),l2.get(i)));
        }

        return result;
    }

    //Ejercicio 8
    public static <T> T fold(ArrayList<T> lista, Joiner<T> joiner){
    Iterator<T> it = lista.iterator();
    T result = it.next();
    while(it.hasNext()){
        result = joiner.join(result,it.next());
    }

    return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        JoinerString joiner = new JoinerString();

        list.add("Hello");
        list.add("World");

        String suma = "";

        suma = fold(list,joiner);

        System.out.println(suma);
    }
}