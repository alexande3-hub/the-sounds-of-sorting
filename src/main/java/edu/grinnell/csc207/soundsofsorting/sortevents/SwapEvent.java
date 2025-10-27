package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T>{
    public int ind1;
    public int ind2;

    SwapEvent(int ind1, int ind2) {
        this.ind1 = ind1;
        this.ind2 = ind2;
    }

    @Override
    public void apply(T[] arr) {
        T tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
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
        return true;
    }
}
