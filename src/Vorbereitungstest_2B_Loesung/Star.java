package Vorbereitungstest_2B_Loesung;

import java.util.ArrayList;
import java.util.NoSuchElementException;

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
    private final int weight;

    /**
     * Initializes {@code this} with its weight.
     *
     * @param weight the weight of this star.
     */
    public Star(int weight) {

        // TODO: implement constructor.
        this.weight = weight;
    }

    /**
     * Returns the total weight of this mobile, which is the sum of all the
     * weights of sticks and decorations (stars).
     *
     * @return the total weight of this mobile.
     */
    @Override
    public int getWeight() {

        // TODO: implement constructor.
        return weight;
    }

    /**
     * Returns a readable representation of {@code this} with the
     * symbol {@code *} followed by the weight of this star.
     */
    @Override
    public String toString() {

        // TODO: implement method.
        return "*" + weight;
    }

    /**
     * Returns {@code true} if and only if {@code this == o} (i.e., in case of identity).
     *
     * @return {@code true} if and only if {@code this == o} (i.e., in case of identity).
     */
    @Override
    public boolean equals(Object o){
        return o == this;
    }

    /**
     * Returns an iterator over all {@link Star} objects in this mobile. The order of iteration
     * is not specified.
     *
     * @return an iterator over all {@link Star} objects in this mobile.
     */
    @Override
    public StarIterator iterator() {
        return new StarStarIterator(this);
    }

    /**
     * Returns a {@link StarCollection} view of {@code this}, containing all stars of this mobile.
     * Later changes in {@code this} will be reflected in the returned view.
     *
     * @return a {@link StarCollection} view of {@code this}.
     */
    @Override
    public StarCollection getStarCollection() {
        return new StarStarCollection(this);
    }
}

class StarStarIterator implements StarIterator {

    private final Star star;
    boolean starNotReturnedYet = true;

    public StarStarIterator(Star star) {
        this.star = star;
    }

    /**
     * Returns {@code true} if the iteration has more elements, otherwise {@code false}.
     *
     * @return {@code true} if and only if the iteration has more elements.
     */
    @Override
    public boolean hasNext() {
        return starNotReturnedYet;
    }

    /**
     * Returns the next element in the iteration. Throws a {@code java.util.NoSuchElementException}
     * if the iteration has no more elements. The detail massage of the exception is
     * "no star element!".
     *
     * @return the next element in the iteration.
     * @throws NoSuchElementException if the iteration has no more elements.
     *                                The detail massage of the exception is "no star element!".
     */
    @Override
    public Star next() {
        if(!hasNext()) {
            throw new NoSuchElementException("no star element!");
        }

        starNotReturnedYet = false;
        return star;
    }
}

class StarStarCollection implements StarCollection {

    private final Star star;

    public StarStarCollection(Star star) {
        this.star = star;
    }

    /**
     * Returns {@code true} if this collection contains an element equal to the specified object
     * {@code s} and {@code false} otherwise.
     *
     * @param s the star to check for containment, {@code s != null}.
     * @return true if {@code this} has an element equal to {@code s}, false otherwise.
     */
    @Override
    public boolean contains(Star s) {
        return star.equals(s);
    }

    /**
     * Returns an iterator over {@link Star} elements.
     *
     * @return an iterator over {@link Star} elements.
     */
    @Override
    public StarIterator iterator() {
        return new StarStarIterator(star);
    }
}