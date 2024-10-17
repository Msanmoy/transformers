package org.iesvdm.transformer;

public class TenTimes implements Transformer<Integer>
{
    //This is an example of how use Transformer and Transformers class;

    public Integer transform(Integer n)
    {
        return n*10;
    }
}
