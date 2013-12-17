package com.programcreek.designpatterns.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午4:44
 * Description: To change this template use File | Settings | File Templates.
 */
interface IIterator<E> {
    public boolean hasNext();
    public E next();
}

interface IContainer {
    public IIterator createIterator();
}

class RecordCollection implements IContainer {
    private String recordArray[] = {"first", "second", "third"};

    @Override
    public IIterator createIterator() {
        RecordIterator iterator = new RecordIterator();
        return iterator;
    }

    private class RecordIterator implements IIterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < recordArray.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return recordArray[index++];
            } else {
                return null;
            }

        }
    }
}

public class IteratorExample {
    public static void run() {
        RecordCollection recordCollection = new RecordCollection();
        IIterator iter = recordCollection.createIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
