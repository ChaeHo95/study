package test7_9.Mystack;

import java.util.Vector;

public class MyStack<T> implements IStack<T> {
    Vector<T> v = new Vector<T>();
    int count = 0;

    @Override
    public boolean push(T ob) {
        if (v.contains(ob)) {
            return false;
        } else {
            v.add(ob);
            count++;
            return true;
        }
    }

    @Override
    public T pop() {
        if (count == 0) {
            return null;
        } else {
            count--;
            return v.get(count);
        }
    }
}
