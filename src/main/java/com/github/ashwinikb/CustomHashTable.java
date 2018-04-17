package com.github.ashwinikb;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomHashTable<K, V> {
    // No of buckets using.
    private static final int NUMBER_OF_BUCKETS = 10;
    // List of every element is equal to bucket.
    //inside of list travel through iteration
    private final List<List<Entry<K,V>>> buckets;

    public CustomHashTable(){
        //creating buckets of linked list.
        this.buckets = new LinkedList<>();
        IntStream.range(0,NUMBER_OF_BUCKETS).forEach(i ->
                buckets.add(i, new LinkedList<>()));
    }
    public void put(K k, V v){
        //hashcode used to find specific bucket.
        int index = k.hashCode() % NUMBER_OF_BUCKETS;
        Entry<K,V> kvEntry = new Entry<>(k,v);

        List<Entry<K,V>> bucket = buckets.get(index);

        bucket.remove(kvEntry);
        bucket.add(kvEntry);

    }
    public int size(){
        return buckets
                .stream()
                .map(List:: size)
                .reduce(((integer, integer2) -> integer + integer2))
                .orElse(other: null);
    }

    public V get (K key){
        int index = key.hashCode() % NUMBER_OF_BUCKETS;
        List<Entry<K, V>> bucket = buckets.get(index);
        List<V> result = bucket.stream()
                .filter(kv -> kv.key.equals(key))
                .map(Entry :: getValue)
                .collect(Collectors.toList());
        if(result.isEmpty()){
            return null;
        }else {
            return reult.get(0);
        }

        public boolean containsKey(K key){
            return this.get(key) != null;
        }

    }


}
