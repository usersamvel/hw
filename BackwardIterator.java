package edu.hw3.Task8;

import java.util.Iterator;
import java.util.List;

public class BackwardIterator<T> implements Iterator<T> {
    private int position;

    private final List<T> list;

    public BackwardIterator(List<T> list) {
        this.list = list;
        this.position = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return (position >= 1);
    }

    @Override
    public T next() {
        if (position <= 0) {
            throw new IllegalArgumentException();
        }
        return list.get(position--);
    }
}
