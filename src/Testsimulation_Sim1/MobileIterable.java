package Testsimulation_Sim1;

public interface MobileIterable extends Iterable<Mobile> {

    /**
     * Returns an iterator over {@link Mobile} elements.
     *
     * @return an iterator over {@link Mobile} elements.
     */
    MobileIterator iterator();
}
