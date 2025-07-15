package generic.test.ex1;

public class Container<T> {

    private T Item;

    public T getItem() {
        return Item;
    }

    public void setItem(T item) {
        Item = item;
    }

    public Boolean isEmpty() {

        return getItem() == null;

    }

}
