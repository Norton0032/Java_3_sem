package org.example._1;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class RPNTest {

    @org.junit.jupiter.api.Test
    void calculations() {
        String s = "5 0.5 /";
        RPN polish = new RPN(s);

        assertEquals(10, polish.calculations()) ;
        s = "2 5 +";
        polish = new RPN(s);
        assertEquals(7,polish.calculations());
        s = "2 5 .. +";
        polish = new RPN(s);
        assertThrows(EmptyStackException.class, polish::calculations);
        s = "2 0 /";
        polish = new RPN(s);
        assertThrows(ArithmeticException.class, polish::calculations);
        s = "2 5 -";
        polish = new RPN(s);
        assertEquals(-3,polish.calculations());
        s = "5 5 *";
        polish = new RPN(s);
        assertEquals(25,polish.calculations());
    }
}