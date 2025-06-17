package Testsimulation_Sim1;


public interface MobileCollection extends MobileIterable {

    /**
     * Returns {@code true} if this collection contains an element equal to the specified object
     * {@code s} and {@code false} otherwise.
     *
     * @param s the star to check for containment, {@code s != null}.
     * @return true if {@code this} has an element equal to {@code s}, false otherwise.
     */
    boolean contains(Star s);
}
