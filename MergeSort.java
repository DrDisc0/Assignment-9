package assignment_9;
import java.util.List;
import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {
    public void mergeSort(List<T> list) {
        if (list.size() <= 1) {
            return;
        }

    }
    
    int mid = list.size() / 2;
    List<T> left = list.subList(0, mid);
    List<T> right = list.subList(mid, list.size());

    mergeSort(left);
    mergeSort(right);

    merge(list, left, right);
}

private void merge(List<T> result, List<T> left, List<T> right) {
    int i = 0, j = 0, k = 0;

    while (i < left.size() && j < right.size()) {
        if (left.get(i).compareTo(right.get(j)) < 0) {
            result.set(k++, left.get(i++));
        } else {
            result.set(k++, right.get(j++));
        }
    }

    while (i < left.size()) {
        result.set(k++, left.get(i++));
    }

    while (j < right.size()) {
        result.set(k++, right.get(j++));
    }
}
}
