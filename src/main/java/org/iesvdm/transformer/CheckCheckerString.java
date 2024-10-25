package org.iesvdm.transformer;

public class CheckCheckerString implements Checker<String> {

    @Override
    public boolean check(String s) {
        int StringLong = s.length();
        int MinLong = 10;

        if (StringLong < MinLong) {
            return false;
        } else {
            return true;
        }
    }
}
