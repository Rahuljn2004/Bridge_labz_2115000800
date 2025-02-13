import java.util.*;

class CustomHashMap<K, V> {
    private static class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private HashNode<K, V>[] bucketArray;

    public CustomHashMap() {
        bucketArray = new HashNode[DEFAULT_CAPACITY];
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        HashNode<K, V> newNode = new HashNode<>(key, value);

        if (bucketArray[index] == null) {
            bucketArray[index] = newNode;
        } else {
            HashNode<K, V> currentNode = bucketArray[index];
            while (currentNode.next != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode.key.equals(key)) {
                currentNode.value = value;
            } else {
                currentNode.next = newNode;
            }
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        HashNode<K, V> currentNode = bucketArray[index];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        HashNode<K, V> currentNode = bucketArray[index];
        HashNode<K, V> previousNode = null;

        while (currentNode != null && !currentNode.key.equals(key)) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null) return;

        if (previousNode == null) {
            bucketArray[index] = currentNode.next;
        } else {
            previousNode.next = currentNode.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> hashMap = new CustomHashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println(hashMap.get("Two"));
        hashMap.remove("Two");
        System.out.println(hashMap.get("Two"));
    }
}
