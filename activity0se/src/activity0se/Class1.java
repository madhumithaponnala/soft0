package activity0se;

import java.util.*;
import java.util.Map.Entry;

public class Class1 {
Map<String,String> classList= new HashMap<String,String>();
public Class1(){
classList.put("Bob", "A");
classList.put("Mary", "c");
classList.put("Sarah", "B");
classList.put("Phillip", "A");
classList.put("Greg", "F");
}


public void printClassList(){
Iterator<Entry<String,String>> entries = classList.entrySet().iterator();
while(entries.hasNext()) {
Entry<String,String> entry= entries.next();
System.out.println("Key= "+ entry.getKey() + ", Value= " + entry.getValue());
}
}

public void printClassList2() {
for(Map.Entry<String,String> entry: classList.entrySet()) {
System.out.println("Key= "+ entry.getKey() + ", Value= " + entry.getValue());
}
for(String Key: classList.keySet()) {
System.out.println("Key= "+ Key);
}
for(String Value: classList.values()) {
System.out.println("Value= "+ Value);
}
}
public static void main(String[] args) {
Class1 myClassList= new Class1();
myClassList.printClassList();
myClassList.printClassList2();

}
}