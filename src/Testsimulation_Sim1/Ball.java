package Testsimulation_Sim1;

/**
 * Leaf node of a mobile. The actual decoration of a mobile.
 * A {@code Ball} has a specified weight, that can not be changed after
 * initialisation. {@code Ball} implements {@link Decoration}.
 */
//
// TODO: Complete the methods in 'Ball'.
//       You can define further classes and methods for the implementation.
//       You may use the Java-Collection framework.
//
public class Ball implements Decoration //TODO: activate clause.
{

    //TODO: define missing parts of the class.
    private final int weight;

    /**
     * Initializes {@code this} with its weight.
     *
     * @param weight the weight of this star.
     */
    public Ball(int weight) {

        // TODO: implement constructor.
        this.weight = weight;
    }

    /**
     * Returns the total weight of this mobile, which is the sum of all the
     * weights of sticks and decorations (stars, balls, ...).
     *
     * @return the total weight of this mobile.
     */
    @Override
    public int getWeight() {
        return weight;
    }

    /**
     * Returns {@code true} if and only if {@code this == o} (i.e., in case of identity).
     *
     * @return {@code true} if and only if {@code this == o} (i.e., in case of identity).
     */
    @Override
    public boolean equals(Object o){
        return this == o;
    }

    /**
     * Returns a readable representation of {@code this} with the
     * symbol {@code *} followed by the weight of this star.
     */
    @Override
    public String toString() {

        // TODO: implement method.
        return "o" + weight;
    }
}
