package Testsimulation_Sim1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface MobileIterator  extends Iterator<Mobile> {

    /**
     * Returns {@code true} if the iteration has more elements, otherwise {@code false}.
     *
     * @return {@code true} if and only if the iteration has more elements.
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration. Throws a {@code java.util.NoSuchElementException}
     * if the iteration has no more elements. The detail massage of the exception is
     * "no star element!".
     *
     * @return the next element in the iteration.
     * @throws NoSuchElementException if the iteration has no more elements.
     * The detail massage of the exception is "no star element!".
     */
    Mobile next();

}
