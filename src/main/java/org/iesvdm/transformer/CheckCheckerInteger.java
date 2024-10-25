package org.iesvdm.transformer;

public class CheckCheckerInteger implements Checker <Integer>{

    @Override
    public boolean check(Integer integer) {
        if(integer == null){
            return false;
        };
        if(integer%2==0){
            return true;
        } else {
            return false;
        }
    }
}
