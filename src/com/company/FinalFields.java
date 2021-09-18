package com.company;

public class FinalFields {

    public final int intValue = 42;
//    public final double doubleValue;
    public final FortyTwo objectValue = new FortyTwo();

    public static void main(String[] args) {
        FinalFields demo = new FinalFields();

        // error because we cannot re-assign a final int
//        demo.intValue = 6;

        // allowed since we haven't initialized doubleValue yet or not?
//        demo.doubleValue = 42.0;

        // since we just assigned it, this would cause an error
//        demo.doubleValue = 6.0;

        demo.objectValue.intValue = 6;
    }
}
