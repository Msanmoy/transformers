package org.iesvdm.transformer;


import java.util.ArrayList;

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
}