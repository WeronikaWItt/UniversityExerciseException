package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            ExceptionEx ex = new ExceptionEx();
            ex.writeOutLength(null);
        } catch (NullPointerException e) {
            //e.printStackTrace(System.out);
            //e.fillInStackTrace();
            throw new Exception(e);
        }
    }
}