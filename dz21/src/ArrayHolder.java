import java.util.Arrays;

public class ArrayHolder <E> {
    private E [] array;
    public ArrayHolder(E [] array){
        this.array =  array;
    }

    public E getArrayIndex(int i){
        if (i >= 0 && i < array.length)
            return  array[i];
        return null;
    }

    public void setArray( E [] array){
        this.array =  array;
    }

    public int getLength(){
        return  array.length ;
    }

    @Override
    public String toString() {
        return "ArrayHolder{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

