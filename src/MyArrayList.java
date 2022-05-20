import java.util.Arrays;

public class MyArrayList<A> {
    private final int INIT_SIZE = 1;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;


    public void add(int index, A item) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i - 1];


        if (pointer == array.length - 1)
            resize(array.length * 2);
        array[pointer++] = item;
    }

    @Override
    public String toString() {
        return "MyArrayList{" + "array=" + Arrays.toString(array) + '}';
    }


    public A get(int index) {
        return (A) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);

    }


    public int size() {
        return pointer;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}