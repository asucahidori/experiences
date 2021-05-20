package finaltreepatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TreeStringIntSet implements Iterable<Pair<String,Integer>> {
    //Step1: Override the Iterator
    @Override
    public Iterator<Pair<String, Integer>> iterator() {
        return new BinarytreeInterator(getAllKeysValues());
    } // needed for iterator
    
    //Step2: Iterator Class
    class BinarytreeInterator implements Iterator<Pair<String, Integer>> {
        private List<Pair<String, Integer>> AllKeys;
        private int curIdx;

        public BinarytreeInterator(List<Pair<String, Integer>> AllKeys) {
            this.AllKeys = AllKeys;
        }
        
        @Override
        public boolean hasNext(){
            return curIdx < AllKeys.size();
        }
        
        @Override
        public Pair<String, Integer> next(){
            return AllKeys.get(curIdx++);
        }
    }
    
    //Step3: Class Node
    private class Node {
        Node left, right;
        String key; // keys are unique
        // HashSet is like ArrayList except it does not hold duplicates
        HashSet<Integer> valuesSet = new HashSet<>(); // unique only
    }
    //instance
    private Node root,current,end;
    //list size
    public int size;
    //List keyList
    private List<Integer> valueList;
    private List<String> keyList = new ArrayList<String>();
    private List<Pair<String, Integer>> pairList = new ArrayList<Pair<String, Integer>>();
    
    // throws DuplicateValueException if this key already contains such value
    public void add(String key, int value) throws DuplicateValueException {
        current = new Node();
        current.key = key;
        //judege the root
        if(root == null){
            root = current;
            root.valuesSet.add(value);
            size++;
        }else{//has root
            //push the value
            end = root;
            while(true){
                if(key.compareTo(end.key) == 0){
                    //judge the value duplicate
                    if(end.valuesSet.contains(value)){
                        throw new DuplicateValueException("Value [" + value + "] duplicated!");   
                    }
                    end.valuesSet.add(value);
                    return;
                }
                if(key.compareTo(end.key) > 0){
                    if(end.right ==null){
                        end.right = current;
                        end.right.valuesSet.add(value);
                        size++;
                        return;        
                    }else{
                        end = end.right;
                    }
                }
                if(key.compareTo(end.key) < 0){
                    if(end.left == null){
                        end.left = current;
                        end.left.valuesSet.add(value);
                        size ++;
                        return;
                    }else{
                        end = end.left;
                    }
                }
            }
        }     
    }

    //find the key
    public boolean containsKey(String key) {
        current = root;
        while(true){
            if (current == null) {
                return false;
            }
            if (current.key.equals(key)) { // key found, return value
                return true;
            }
            if (key.compareTo(current.key) < 0) { // go left
                    current = current.left;
            } else { // go right
                    current = current.right;
            }            
        }  
    }

    // return empty list if key not found
    // returns sorted
    public List<Integer> getValuesOfKey(String key) {
        if (containsKey(key)) {
            current = root;
            while (true) {
                if (current.key.equals(key)) { // key found, return value
                    valueList = new  ArrayList<Integer>(current.valuesSet);
                    Collections.sort(valueList);
                    return valueList;
                }
                if (key.compareTo(current.key) < 0) { // go left
                    current = current.left;
                } else { // go right
                    current = current.right;
                }
            }            
        }
        return valueList;
    }

    // use traversal of all nodes to collect keys that have this value in valuesSet
    public List<String> getKeysContainingValue(int value) { 
        pairList = new ArrayList<Pair<String, Integer>>();
        collectKeysInOrder(root);
        //find all the keys by value
        List<String> keys = new ArrayList<>();
        pairList.forEach(p->{
            if(p.value == value){
                keys.add(p.key);
            }
        });
        
        return keys;
    }

    // use traversal to collect all keys
    public List<String> getAllKeys() {
        collectKeysInOrder(root);
        return keyList;
    }

    public List<Pair<String, Integer>> getAllKeysValues() {
        pairList = new ArrayList<Pair<String, Integer>>();
        collectKeysInOrder(root);
        return pairList;
    }    
    
    // private helper recursive method to implement the above method
    public void collectKeysInOrder(Node node) {
        if(node != null){ 
           collectKeysInOrder(node.left);
           //add keyList (return key)
           System.out.println("node.key2" + node.key);
           keyList.add(node.key);   
           //add pairList
           //find all value to add list (return pair)
           node.valuesSet.forEach(v -> {
                pairList.add(new Pair(node.key,v));
           });
           collectKeysInOrder(node.right);
        }
    }
    
    
    
    
    




}
