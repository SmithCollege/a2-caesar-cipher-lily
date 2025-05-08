// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    private T[] currentArray;
    private int currentArrayLen;

    public DynamicArray(int len) {
        this.currentArray = T[len];
        this.currentArrayLen = len;
    }
    // What instance variables do you need?

    // Write a constructor to make a new DynamicArray Object from an array

    // Now implement the methods from IndexAccess?
    public void set(int i, T val) {
        this.currentArray[i] = val;
    }
    public T get(int i) {
        return this.currentArray[i];
    }
    public T get(int i, int offset) {
        return this.currentArray[i + offset];
    }
}
