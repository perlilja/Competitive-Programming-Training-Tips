public class MaxBinHeapsort<T extends Comparable<T>> {

    private T[] priorityQueue;
    private int size;

    public MaxBinHeapsort(int sizeT){
        priorityQueue = (T[]) new Comparable[sizeT + 1];
        size = 0;
    }

    public void insertElement(T element){
        priorityQueue[++size] = element;
        swim(size);
    }

    public T delMax(){
        T max = priorityQueue[1];
        exch(1, size);
        priorityQueue[size--] = null;
        sink(1);
        return max;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void swim(int position){
        for(; position > 1 && less(position / 2, position); position /= 2){
            exch(position, position / 2);
        }
    }

    public void sink(int position){
        while(2 * position <= size){
            int child = 2 * position;
            if(child < size && less(child, child + 1)){
                ++child;
            }
            if(!less(position, child)){
                break;
            }
            exch(position, child);
            position = child;
        }
    }

    private void exch(int firstIndex, int secondIndex){
        T temp = priorityQueue[firstIndex];
        priorityQueue[firstIndex] = priorityQueue[secondIndex];
        priorityQueue[secondIndex] = temp;
    }

    private boolean less(int firstIndex, int secondIndex){
        return priorityQueue[firstIndex].compareTo(priorityQueue[secondIndex]) < 0;
    }

    public static void main(String[] args){
        Integer[] arr = {5, 3, 7, 1, 2};
        MaxBinHeapsort<Integer> pq = new MaxBinHeapsort<Integer>(arr.length);
        for(int i = 0; i < arr.length; ++i){
            pq.insertElement(arr[i]);
        }
        for(int i = arr.length - 1; i >= 0; --i){
            arr[i] = pq.delMax();
        }
        StringBuilder sb = new StringBuilder();
        if(arr.length > 0){
            sb.append(arr[0]);
        }
        for(int i = 1; i < arr.length; ++i){
            sb.append( ", " + arr[i]);
        }
        System.out.println(sb);
    }
}
