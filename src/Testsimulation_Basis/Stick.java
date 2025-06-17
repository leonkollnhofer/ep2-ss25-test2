package Testsimulation_Basis;

import java.util.Map;

/**
 * A {@code Stick} has a specified stick weight, that can not be changed after
 * initialisation. On the left and right end of the stick another mobile
 * is attached (recursive structure). {@code Stick} implements {@code Mobile}.
 * You can assume that no part of a mobile has the same identity as another part.
 */
//
// TODO: Complete the methods in 'Stick'.
//       You can define further classes and methods for the implementation.
//       You may use the Java-Collection framework.
//
public class Stick // implements Decoration // TODO: activate clause.
{

    //TODO: define missing parts of the class.

    /**
     * Initialises {@code this}; throws an {@link UnbalancedException} if the resulting mobile
     * would not be balanced, i.e. if the total torque != 0. The detail
     * message of the exception contains information about the difference between
     * the two sides, for example "Stick unbalanced (torque left 6 - torque right 8)"
     * (see example in {@link ApplicationTest2}).
     * <p>We say that a stick is unbalanced, if the left torque does not match the right torque. Torque is calculated
     * as the sum of {@code torque = weight * distanceFromCenter} over all weights. So if a Stick has two
     * children 2:5, 6:1 (read as childWeight:distanceFromCenter) to the left and one 8:2 to the right, then:
     * 2*5 + 6*1 = 8*2 => 16 == 16 meaning the stick would be balanced. If however the right child is 7:2, then:
     * 2*5 + 6*1 = 7*2 => 16 == 14 meaning the stick would not be balanced.</p>
     *
     * @param stickWeight the weight of the stick, {@code stickWeight > 0}.
     * @param left        the left mobiles, and their respective distances from the center of this stick {@code left != null}.
     * @param right       the right mobiles, and their respective distances from the center of this stick {@code right != null}, {@code right.length() > 0}.
     * <p>
     *                    So the left-distance at index 0 is associated with the left-mobile at index 0.
     *                    No part of a mobile has the same identity as another part.
     * @throws UnbalancedException if the mobile would not be balanced
     */
    public Stick(int stickWeight, Map<Decoration, Integer> left, Map<Decoration, Integer> right) throws UnbalancedException {

        // TODO: implement constructor.
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
     * and right torque, for example: "Stick unbalanced (torque left 6 - torque right 8)".
     *
     * @param toReplace   the mobile to be replaced, {@code toReplace != null}.
     * @param replaceWith the new mobile to replace with, {@code replaceWith != null}.
     * @return {@code true} if the replacement was successful, {@code false} otherwise.
     * @throws {@link UnbalancedException} if the replacement would unbalance the mobile.
     */
    public boolean replace(Mobile toReplace, Mobile replaceWith) throws UnbalancedException {

        // TODO: implement method.
        return false;
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
     * For example, the following mobiles are equal (assuming corresponding
     * {@code Decoration} instances are equal):
     * </p>
     * <pre>
     *                       |                                     |
     *                +------5------+----+             +----+------5------+
     *                |             |    |             |    |             |
     *       +--------2--+--+       *    o             *    o    +--------2--+--+
     *       |           |  |       12   5             12   5    |           |  |
     *       |           |  o                                    |           |  o
     *       *           |  2                                    *           |  2
     *       7           |                                       7           |
     *                +--1--+                                             +--1--+
     *                |     |                                             |     |
     *                *     *                                             *     *
     *                3     3                                             3     3
     * </pre>
     *
     * @param o the object to compare to
     * @return {@code true} if the two sticks are equal as defined above; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {

        // TODO: implement method.
        return false;
    }
}

// TODO: define additional classes if needed (either here or in a separate file).