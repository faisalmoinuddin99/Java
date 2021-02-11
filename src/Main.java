public class Main {
    public static void main(String[] args) {
        String [] arr = {"abc", "xyz", "uvw", "efg"};
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        System.out.println("Before Reverse: ");

        printArray(arr);

        System.out.println();
        System.out.println("After Reverse: ");

        ReversingArray(arr,start,end);
    }

    public static void printArray(String[] a){
        for (String i : a){
            System.out.print(i + " ");
        }
    }

    public static void ReversingArray(String[] a, int start, int end){
        String temp ;
        int size = a.length;
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        printArray(a);
    }
}

/*
Before Reverse:
abc xyz uvw efg
After Reverse
efg uvw xyz abc
 */