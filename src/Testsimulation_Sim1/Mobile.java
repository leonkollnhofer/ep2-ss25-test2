package Testsimulation_Sim1;

/**
 * A mobile is a hanging room decoration consisting of sticks on which
 * further mobiles are attached (recursive structure). The actual decorations (e.g. stars) are
 * the leaf nodes. The numbers shown below correspond to the weights of
 * sticks respectively stars.
 *
 *
 *                       |
 *                +------5------+----+
 *                |             |    |
 *       +--------2--+--+       *    o
 *       |           |  |       12   5
 *       |           |  o
 *       *           |  2
 *       7           |
 *                +--1--+
 *                |     |
 *                *     *
 *                3     3
 *
 * Readable representation as string: ((*7)-2-((*3)-1-(*3))-(o2))-5-(*12)-(o5)
 * @TippNotInTest: every Stick has a certain weight. This weight is surrounded by the representations of its
 *      children, seperated by `-` signs. So the very first stick has weight 5, so we write `-5-`. There is one
 *      child to the left and two to the right, so we write `(CHILD1)-5-(CHILD2)-(CHILD3)`.
 *
 *
 * Each mobile must be balanced, this is, the left children and the right children cause the torque on the stick
 * to be 0.
 * Please, do not change this interface definition!
 */
public interface Mobile {

    /**
     * Returns the total weight of this mobile, which is the sum of all the
     * weights of sticks and decorations (stars, balls, ...).
     *
     * @return the total weight of this mobile.
     */
    int getWeight();

    /**
     * Returns a readable representation of the mobile, showing its complete
     * structure with all weights using an expression with parentheses.
     * Example (compare with the graphical representation above):
     * ((*7)-2-((*3)-1-(*3))-(o2))-5-(*12)-(o5)
     *
     * @return a readable representation of the mobile.
     */
    String toString();

    /**
     * Returns {@code true} if {@code this} and {@code obj} are equal.
     *
     * @param o the object to be compared with.
     * @return {@code true} if {@code this} and {@code obj} are equal, {@code false} otherwise.
     */
    boolean equals(Object o);

    /**
     * Returns the hash code of {@code this}.
     *
     * @return the hash code of {@code this}.
     */
    int hashCode();
}


