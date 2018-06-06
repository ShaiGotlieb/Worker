import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

//class AssociationTable represent a table with keys and values - generic
public class AssociationTable<K extends Comparable<K>, V> {
    //variable of treeMap
	private TreeMap<K, V> myMap;

	//constructor - create empty table
	public AssociationTable() {
		myMap = new TreeMap<>();
	}

	//constructor - get arrayList of keys and arrayList of values. create associate table of keys and values.
	//the table will be sorted and each key will match his value - (TreeMap is sorted)
	public AssociationTable(ArrayList<K> keys, ArrayList<V> values) {
		
		//check if null
		if (keys == null || values == null) {
			throw new IllegalArgumentException("Input is null");
		}
		
		//keys and values are not equal by their size - throw exception
		if (keys.size() != values.size()) {
			throw new IllegalArgumentException("Array keys and values have different size");
		}

		//empty table
		myMap = new TreeMap<>();
		
		//run through the arrayLists and insert key and values to the map
		for (int i = 0; i < keys.size(); i++) {
			//table has same keys - keys can't be duplicated!
			if (myMap.containsKey(keys.get(i))) {
				myMap.remove(keys.get(i));
			}
			
			//insert key and value to the table
			myMap.put(keys.get(i), values.get(i));
		}
	}

	
	//add key and value to table
	public void add(K key, V val) {
		if (myMap.containsKey(key)) {
			myMap.remove(key);
		}
		myMap.put(key, val);
	}

	//get the value by the key
	public V get(K key) {
		//key doesn't exist in table
		if (!myMap.containsKey(key))
			return null;
		return myMap.get(key);
	}

	//method to check if table has same key
	public boolean contains(K key) {
		return myMap.containsKey(key);
	}

	//method that remove key and value from table - return true if success
	public boolean remove(K key) {
		if (contains(key)) {
			myMap.remove(key);
			return true;
		}

		return false;
	}
	
	//return size - number of elements in table
	public int size() {
		return myMap.size();
	}
	
	//return iterator 
	public Iterator<K> keyIterator() {
		return myMap.keySet().iterator();
	}
}//end class AssociationTable
