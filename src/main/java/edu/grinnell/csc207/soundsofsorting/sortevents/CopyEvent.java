package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T> {
    public int i;
    public T val;

    public CopyEvent(int i, T val) {
        this.i = i;
        this.val = val;
    }

    @Override
    public void apply(T[] arr) {
        arr[i] = val;
    }

    @Override
    public List<Integer> getAffectedIndices() {
        List<Integer> lst = new ArrayList<>();
        lst.add(i);
        return lst;
    }

    @Override
    public boolean isEmphasized() {
        return true;
    }
}
