package org.iesvdm.transformer;

import java.util.AbstractList;
import java.util.ArrayList;

public class Transformers
{

    //This method applies a transformation to each element of an ArrayList using a Transformer object.

    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    //This method do the same as applyConst changing one thing, this method destroy.

    public static <T> void applyDest(ArrayList<T> a, Transformer<T> tran){
        for (int i = 0; i < a.size(); i++) {
            a.set(i, tran.transform(a.get(i)));
        }
    }
}

