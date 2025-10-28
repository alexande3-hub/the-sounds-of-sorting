package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {
    public int ind1;
    public int ind2;

    CompareEvent (int ind1, int ind2) {
        this.ind1 = ind1;
        this.ind2 = ind2;
    }

    @Override
    public void apply(T[] arr) {
        // Intentionally left blank
    }

    @Override
    public List<Integer> getAffectedIndices() {
        List<Integer> lst = new ArrayList<>();
        lst.add(ind1);
        lst.add(ind2);
        return lst;
    }

    @Override
    public boolean isEmphasized() {
        return false;
    }
}
