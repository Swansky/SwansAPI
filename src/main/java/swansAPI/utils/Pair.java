package swansAPI.utils;

public class Pair<S, T> {
    private S key = null;
    private T value = null;

    public Pair(S key, T t) {
        this.key = key;
        this.value = t;
    }

    public S getKey() {
        return key;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean pairIsNotNull() {
        return (key != null && value != null);
    }

    public static <V,Y> Pair<V,Y> emptyPair()
    {
        return new Pair<V,Y>(null,null);
    }
}
