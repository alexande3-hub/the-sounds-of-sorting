package edu.grinnell.csc207.soundsofsorting;

import java.util.Random;


/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
    public int n;
    public Integer[] arr;
    public Boolean[] arr2;
    Random rand = new Random();

    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        this.n = n;
        this.arr = new Integer[n];
        this.arr2 = new Boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            arr2[i] = false;
        }
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            arr2[i] = false;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = rand.nextInt(n);
            Integer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            Boolean temp2 = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp2;
        }
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return arr;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        arr2[index] = true;
    }
    
    /**
     * @param index the index to check
     * @return true if the given index is highlighted
     */
    public boolean isHighlighted(int index) {
        if (arr2[index] == true) {
            return true;
        } else {
            return false;
        }
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        for (int i = 0; i < n; i++) {
            if (isHighlighted(i)) {
                arr2[i] = false;
            }
        }
    }
}
