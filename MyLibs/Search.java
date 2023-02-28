package MyLibs;

public class Search {
    /**
     * Uses recursion for binary search.
     * Continues to get rid of half of the array/list until the key is found.
     * 
     * @param array    The array being passed through
     * @param start    Usually 0. Singnifies the start of the list/array
     * @param endIndex Usually length of the array - 1. The endpoint of the array
     * @param key      The value being searched in the array
     * @return the key if found. -1 if an error occurs
     */
    public static int binarySearch(int[] array, int start, int endIndex, int key) {
        int middle = (start + endIndex) / 2;
        if (start > endIndex)
            return -1;
        else if (array[middle] == key)
            return key;
        else if (array[middle] < key)
            return binarySearch(array, middle + 1, endIndex, key);
        else
            return binarySearch(array, start, middle - 1, key);
    }

    /**
     * Uses recursion for binary search.
     * Continues to get rid of half of the array/list until the key is found.
     * 
     * @param array    The array being passed through
     * @param start    Usually 0. Singnifies the start of the list/array
     * @param endIndex Usually length of the array - 1. The endpoint of the array
     * @param key      The value being searched in the array
     * @return the key if found. -1 if an error occurs
     */
    public static int binarySearchNameIndex(int[] array, int start, int endIndex, int key) {
        int middle = (start + endIndex) / 2;
        if (start > endIndex)
            return -1;
        else if (array[middle] == key)
            return key;
        else if (array[middle] < key)
            return binarySearchNameIndex(array, middle + 1, endIndex, key);
        else
            return binarySearchNameIndex(array, start, middle - 1, key);
    }

    /**
     * Uses recursion for binary search.
     * Continues to get rid of half of the array/list until the key is found.
     * 
     * @param array    The array being passed through
     * @param start    Usually 0. Signifies the start of the list/array
     * @param endIndex Usually length of the array - 1. The endpoint of the array
     * @param key      The value being searched in the array
     * @return the key if found. "Something went wrong" if an error occurs
     */
    public static String binarySearchString(String[] array, int start, int end, String key) {
        int mid = (start + end) / 2;
        if (start > end)
            return "Something went wrong";
        else if (array[mid].compareToIgnoreCase(key) == 0)
            return array[mid];
        else if (array[mid].compareToIgnoreCase(key) < 0)
            return binarySearchString(array, mid + 1, end, key);
        else
            return binarySearchString(array, start, mid - 1, key);
    }

    /**
     * Uses recursion for binary search.
     * Continues to get rid of half of the array/list until the key is found.
     * 
     * @param array The array being passed through
     * @param start Usually 0. Signifies the start of the list/array
     * @param end   Index Usually length of the array - 1. The endpoint of the array
     * @param key   The value being searched in the array
     * @return the index of the key if found. -1 if an error occurs
     */
    public static int binarySearchStringIndex(String[] array, int start, int end, String key) {
        int mid = (start + end) / 2;
        if (start > end)
            return -1;
        else if (array[mid].compareToIgnoreCase(key) == 0)
            return mid;
        else if (array[mid].compareToIgnoreCase(key) < 0)
            return binarySearchStringIndex(array, mid + 1, end, key);
        else
            return binarySearchStringIndex(array, start, mid - 1, key);
    }
}
