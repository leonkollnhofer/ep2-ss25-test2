package Vorbereitungstest_2B_Loesung;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * A {@code BalancedStick} has a specified stick weight, that can not be changed after
 * initialisation. On the left and right end of the stick another mobile
 * is attached (recursive structure). {@code BalancedStick} implements {@code Mobile}.
 * You can assume that no part of a mobile has the same identity as another part.
 */
//
// TODO: Complete the methods in 'BalancedStick'.
//       You can define further classes and methods for the implementation.
//       You may use the Java-Collection framework.
//
public class BalancedStick implements Mobile // TODO: activate clause.
{

    //TODO: define missing parts of the class.
    private final int stickWeight;
    private Mobile left;
    private Mobile right;

    /**
     * Initialises {@code this}; throws an {@link UnbalancedException} if the resulting mobile
     * would not be balanced, i.e. if {@code left.getWeight() != right.getWeight()}. The detail
     * message of the exception contains information about the difference between
     * left and right weight, for example "Stick unbalanced (left 6 - right 8)"
     * (see example in {@link ApplicationTest2}).
     *
     * @param stickWeight the weight of the stick, {@code stickWeight > 0}.
     * @param left        the left mobile, {@code left != null}.
     * @param right       the right mobile, {@code right != null}.
     *                    no part of a mobile has the same identity as another part.
     * @throws UnbalancedException if the mobile would not be balanced
     */
    public BalancedStick(int stickWeight, Mobile left, Mobile right) throws UnbalancedException {

        // TODO: implement constructor.
        if(left.getWeight() != right.getWeight()) {
            throw new UnbalancedException("Stick unbalanced (left " + left.getWeight() + " - right " + right.getWeight() + ")");
        }

        this.stickWeight = stickWeight;
        this.left = left;
        this.right = right;
    }

    /**
     * Replaces the mobile equal to {@code toReplace} with a new mobile {@code replaceWith} and
     * returns {@code true} if such a mobile is contained as part of this mobile, i.e., attached
     * to this stick or below (recursive search). Otherwise, the call of this method has no
     * effect and {@code false} is returned.
     *
     * Throws an {@link UnbalancedException} if the replacement would violate the
     * conditions that all sticks need to be balanced. In this case this mobile remains unchanged.
     * The detail message of the exception contains information about the difference between left
     * and right weight, for example: "Stick unbalanced (left 6 - right 8)".
     *
     * @param toReplace   the mobile to be replaced, {@code toReplace != null}.
     * @param replaceWith the new mobile to replace with, {@code replaceWith != null}.
     * @return {@code true} if the replacement was successful, {@code false} otherwise.
     * @throws {@link UnbalancedException} if the replacement would unbalance the mobile.
     */
    public boolean replace(Mobile toReplace, Mobile replaceWith) throws UnbalancedException {

        // TODO: implement method.
        if(toReplace.getWeight() != replaceWith.getWeight()) {
            throw new UnbalancedException("Replacement unbalanced (left " + left.getWeight() + " - right " + right.getWeight() + ")");
        }

        if(left.equals(toReplace)) {
            left = replaceWith;
            return true;
        }else if (right.equals(toReplace)) {
            right = replaceWith;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Returns the total weight of this mobile, which is the sum of all the
     * weights of sticks and decorations (stars).
     *
     * @return the total weight of this mobile.
     */
    @Override
    public int getWeight() {

        // TODO: implement method.
        return this.stickWeight + left.getWeight() + right.getWeight();
    }

    /**
     * Returns a readable representation of the mobile, showing its complete
     * structure with all weights using an expression with parentheses.
     * Example (compare with the graphical representation above):
     * ((*7)-2-((*3)-1-(*3)))-2-(*16)
     *
     * @return a readable representation of the mobile.
     */
    @Override
    public String toString(){
        return "(" + left.toString() + ")-" + stickWeight + "-(" + right.toString() + ")";
    }

    /**
     * Compares this stick to another for equality.
     * <p>
     * Two sticks are considered equal if:
     * <ol>
     *   <li>They have the same stick weight, and</li>
     *   <li>
     *     Either
     *     <ol type="a">
     *       <li>The left branch of this stick equals the left branch of the other,
     *       and the right branch of this equals the right branch of the other; or</li>
     *       <li>The left branch of this stick equals the right branch of the other,
     *       and the right branch of this equals the left branch of the other.</li>
     *     </ol>
     *   </li>
     * </ol>
     * Exchanging left and right branches does not affect the result of {@code equals}.
     * </p>
     * <p>
     * For example, all three of the following mobiles are equal (assuming corresponding
     * {@code Star} instances are equal):
     * </p>
     * <pre>
     *          |                      |                |
     *      +---2---+              +---2---+        +---2---+
     *      |       |              |       |        |       |
     *   +--2--+    *           +--2--+    *        *    +--2--+
     *   |     |    16          |     |    16       16   |     |
     *   *  +--1--+          +--1--+  *               +--1--+  *
     *   7  |     |          |     |  7               |     |  7
     *      *     *          *     *                  *     *
     *      3     3          3     3                  3     3
     * </pre>
     *
     * @param o the object to compare to
     * @return {@code true} if the two sticks are equal as defined above; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {

        // TODO: implement method.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BalancedStick other = (BalancedStick) o;

        if (stickWeight != other.stickWeight){
            return false;
        }

        if(this.left.equals(other.left) && this.right.equals(other.right)) {
            return true;
        } else if (this.left.equals(other.right) && this.right.equals(other.left)) {
            return true;
        }
        return false;
    }

    /**
     * Returns the hash code of {@code this}.
     *
     * @return the hash code of {@code this}.
     */
    public int hashCode(){
        return stickWeight + left.hashCode() + right.hashCode();
    }

    /**
     * Returns an iterator over all {@link Star} objects in this mobile. The order of iteration
     * is not specified.
     *
     * @return an iterator over all {@link Star} objects in this mobile.
     */
    @Override
    public StarIterator iterator() {
        return new BalancedStickStarIterator(left, right);
    }

    /**
     * Returns a {@link StarCollection} view of {@code this}, containing all stars of this mobile.
     * Later changes in {@code this} will be reflected in the returned view.
     *
     * @return a {@link StarCollection} view of {@code this}.
     */
    @Override
    public StarCollection getStarCollection() {
        return new BalancedStickStarCollection(this);
    }
}

// TODO: define additional classes if needed (either here or in a separate file).

class BalancedStickStarIterator implements StarIterator {

    private final StarIterator left;
    private final StarIterator right;

    public BalancedStickStarIterator(Mobile left, Mobile right) {
        this.left = left.iterator();
        this.right = right.iterator();
    }

    /**
     * Returns {@code true} if the iteration has more elements, otherwise {@code false}.
     *
     * @return {@code true} if and only if the iteration has more elements.
     */
    @Override
    public boolean hasNext() {
        return left.hasNext() || right.hasNext();
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
        if (!hasNext()) {
            throw new NoSuchElementException("no star element!");
        }

        if(left.hasNext()) {
            return left.next();
        }else{
            return right.next();
        }
    }
}

class BalancedStickStarCollection implements StarCollection {

    private ArrayList<Star> stars;
    private final BalancedStick balancedStick;

    public BalancedStickStarCollection(BalancedStick stick) {
        this.balancedStick = stick;
        this.stars = new ArrayList<>();
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
        this.stars = new ArrayList<>();
        StarIterator iterator = this.balancedStick.iterator();

        while (iterator.hasNext()) {
            Star star = iterator.next();
            if (star != null) {
                stars.add(star);
            }
        }

        return stars.contains(s);
    }

    /**
     * Returns an iterator over {@link Star} elements.
     *
     * @return an iterator over {@link Star} elements.
     */
    @Override
    public StarIterator iterator() {
        return balancedStick.iterator();
    }
}