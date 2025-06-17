package Testsimulation_Sim1;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This class can be modified and is for testing your solution.
 * Modifications will NOT be reviewed or assessed.
 */
public class ApplicationTest2 {

    /**
     * The main method.
     * @param args not used.
     */
    public static void main(String[] args) {

        //                       |
        //                +------5-------+-----+
        //                |              |     |
        //       +--------2--+--+        *     o
        //       |           |  |        12    5
        //       |           |  o
        //       *           |  7
        //       7           |
        //                +--1--+
        //                |     |
        //                *     *
        //                3     3

        try {
            Mobile d1 = new Star(3);
            Mobile d2 = new Star(3);
            Mobile d3 = new Star(7);
            Mobile d4 = new Star(12);
            Mobile d5 = new Ball(5);
            Mobile d6 = new Ball(7);

            Map<Mobile, Integer> m1Left = new HashMap<>();
            Map<Mobile, Integer> m1Right = new HashMap<>();
            m1Left.put(d1, 3);
            m1Right.put(d2, 3);
            Stick m1 = new Stick(1, m1Left, m1Right);

            Map<Mobile, Integer> m2Left = new HashMap<>();
            Map<Mobile, Integer> m2Right = new HashMap<>();
            m2Left.put(d3, 9);
            m2Right.put(m1, 3);
            m2Right.put(d6, 6);
            Stick m2 = new Stick(2, m2Left, m2Right);

            Map<Mobile, Integer> m3Left = new HashMap<>();
            Map<Mobile, Integer> m3Right = new HashMap<>();
            m3Left.put(m2, 7);
            m3Right.put(d4, 8);
            m3Right.put(d5, 13);
            Stick m3 = new Stick(5, m3Left, m3Right);


            System.out.println("Test 1: 'replace'");
            Map<Mobile, Integer> m3NewLeft = new HashMap<>();
            m3NewLeft.put(new Star(m2.getWeight()), 7);
            testValue(m3.replace(m3Left, m3NewLeft), true);
            testValue(m3.replace(m2Left, m3NewLeft), false);
//            try {
//                m3NewLeft = new HashMap<>();
//                m3NewLeft.put(new Star(m2.getWeight()), 7);
//                m3.replace(m3Left, m3NewLeft);
//            } catch (UnbalancedException e) {
//                System.out.println(e);
//                testEquals(e.getMessage(), "no star element!");
//            }


        } catch (UnbalancedException e) {
            System.out.println("FAIL! This message should not be printed:");
            System.out.println(e.getMessage());
        }
        // TODO: end of block to uncomment. */
    }


    public static void testEquals(Object given, Object expected) {
        if (Objects.equals(given, expected)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL! Expected value: " + expected.toString() + " / Given " +
                    "value: " + given.toString());
        }
    }

    public static void testValue(double given, double expected) {
        if (given < expected + (expected + 1) / 1e12 && given > expected - (expected + 1) / 1e12) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL! Expected value: " + expected + " / Given value: " + given);
        }
    }

    public static void testValue(boolean given, boolean expected) {
        if (given == expected) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL! Expected value: " + expected + " / Given value: " + given);
        }
    }
}

