package ar.com.educationit.universidad.desafio.Java4;

public class CollectionCustom<T>{
	private T[] array;
    private int size;

    public CollectionCustom() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T element) {
        if (size == array.length) {
            resizeArray();
        }

        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = element;
        size++;
    }

    public void addLast(T element) {
        if (size == array.length) {
            resizeArray();
        }

        array[size] = element;
        size++;
    }

    public void add(T element) {
        addLast(element);
    }

    public T remove(T element) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            T removedElement = array[index];

            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            array[size - 1] = null;
            size--;

            return removedElement;
        }

        return null;
    }

    public void removeAll(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(array[i]);
                i--;
            }
        }
    }

    public boolean empty() {
        return size == 0;
    }

    private void resizeArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}


