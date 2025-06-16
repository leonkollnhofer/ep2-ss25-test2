package Vorbereitungstest_2B_Loesung;

/**
 * Leaf node of a mobile. The actual decoration of a mobile.
 * A {@code Star} has a specified weight, that can not be changed after
 * initialisation. {@code Star} implements {@link Decoration}.
 */
//
// TODO: Complete the methods in 'Star'.
//       You can define further classes and methods for the implementation.
//       You may use the Java-Collection framework.
//
public class Star implements Decoration //TODO: activate clause.
{

    //TODO: define missing parts of the class.

    /**
     * Initializes {@code this} with its weight.
     *
     * @param weight the weight of this star.
     */
    public Star(int weight) {

        // TODO: implement constructor.
    }

    /**
     * Returns the total weight of this mobile, which is the sum of all the
     * weights of sticks and decorations (stars).
     *
     * @return the total weight of this mobile.
     */
    @Override
    public int getWeight() {
        return 0;
    }

    /**
     * Returns a readable representation of {@code this} with the
     * symbol {@code *} followed by the weight of this star.
     */
    @Override
    public String toString() {

        // TODO: implement method.
        return "";
    }

    /**
     * Returns an iterator over all {@link Star} objects in this mobile. The order of iteration
     * is not specified.
     *
     * @return an iterator over all {@link Star} objects in this mobile.
     */
    @Override
    public StarIterator iterator() {
        return null;
    }

    /**
     * Returns a {@link StarCollection} view of {@code this}, containing all stars of this mobile.
     * Later changes in {@code this} will be reflected in the returned view.
     *
     * @return a {@link StarCollection} view of {@code this}.
     */
    @Override
    public StarCollection getStarCollection() {
        return null;
    }
}
