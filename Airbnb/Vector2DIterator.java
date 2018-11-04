import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Given an array of arrays, implement an iterator class to allow the client to traverse
 * and remove elements in the array list.
 * This iterator should provide three public class member functions:
 *
 * boolean hasNext()
 * return true if there is another element in the set
 *
 * int next()
 * return the value of the next element in the array
 *
 * void remove()
 * remove the last element returned by the iterator.
 * That is, remove the element that the previous next() returned
 * This method can be called only once per call to next(), otherwise an exception will be thrown.
 *
 * close to the Leetcode Flatten 2D iterator
 */


public class Vector2DIterator {
    private int m;
    private int n;
    private boolean re;
    private List<List<Integer>> vec2d;
    public Vector2DIterator(List<List<Integer>> vec2d) {
        m = 0;
        n = 0;
        this.vec2d = vec2d;
        re = false;
    }

    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>(Arrays.asList(1, 2)));
        li.add(new ArrayList<>(Arrays.asList(2, 3)));
        li.add(new ArrayList<>(Arrays.asList()));
        li.add(new ArrayList<>(Arrays.asList()));
        li.add(new ArrayList<>(Arrays.asList(2, 3)));

        Vector2DIterator v = new Vector2DIterator(li);
        List<Integer> li2 = new ArrayList<>();
//        while (v.hasNext()) {
//            li2.add(v.next());
//            v.remove();
//            v.remove();
//            System.out.println(v.vec2d);
//        }
//        System.out.print(li2);

        System.out.println(v.hasNext());
        System.out.println(v.next());
        System.out.println(v.hasNext());
        System.out.println(v.hasNext());
        System.out.println(v.hasNext());
        System.out.println(v.next());
        v.remove();
        System.out.println(v.vec2d);
        System.out.println(v.next());
        System.out.println(v.next());
        System.out.println(v.hasNext());
        System.out.println(v.next());
        v.remove();
        System.out.println(v.vec2d);
        System.out.println(v.next());
//        System.out.println(v.hasNext());
        v.remove();
    }

    public boolean hasNext() {
        if (vec2d == null || vec2d.size() == 0) {
            return false;
        }
        while (n == vec2d.get(m).size()) {
            m++;
            n = 0;
            if (m == vec2d.size() || (m == vec2d.size() - 1 && n == vec2d.get(m).size())) {
                return false;
            }
        }
        return true;
    }

    public Integer next() {
        if (hasNext()) {
            int result = vec2d.get(m).get(n);
            n++;
            re = true;
            return result;
        } else throw new ArrayIndexOutOfBoundsException();
    }

    public void remove() {
        if(!re)
            return; // throw new IllegalAccessException();

        vec2d.get(m).remove(n - 1);
        n--;
        re = false;
    }
}

/**
 * leetcode: 251;
 */
//public class Vector2D implements Iterator<Integer> {
//    int m;
//    int n;
//    List<List<Integer>> vec2d;
//    public Vector2D(List<List<Integer>> vec2d) {
//        m = 0;
//        n = 0;
//        this.vec2d = vec2d;
//    }
//
//    @Override
//    public Integer next() {
//        int result = vec2d.get(m).get(n);
//        n++;
//        return result;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if (vec2d == null || vec2d.size() == 0) {
//            return false;
//        }
//        while (n == vec2d.get(m).size()) {
//            m++;
//            n = 0;
//            if (m == vec2d.size() || (m == vec2d.size() - 1 && n == vec2d.get(m).size())) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
