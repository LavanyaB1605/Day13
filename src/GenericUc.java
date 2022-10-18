public class GenericUc {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Max of Integer %d , %d , %d is %d\n\n", 5,4,3,maximum(5,4,3));
        System.out.printf("Max of Float %f , %f , %f is %f\n\n", 7.4,3.7,9.8, maximum(7.4,3.7,9.8));
        System.out.printf("Max of String %s , %s , %s is %s\n\n", "Apple","Peach","Banana",maximum("Apple","Peach","Banana"));

    }
}
