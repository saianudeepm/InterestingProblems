package com.salome.problems;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/29/14
 * Time: 6:33 PM
 */
public interface MyMap<K,V> {

     V get(Object key);

    V put(K key, V value);

    void clear();

    boolean containsKey(Object k);

    boolean containsvalue(Object val);

    int size();

    boolean isEmpty();

    V remove(K key);

    void putAll(MyMap<? extends K, ? extends  V> m);




}