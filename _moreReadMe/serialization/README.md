# Serialization

Serialization in java is a mechanism of writing the state of an object into a byte stream. It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies. The reverse operation of serialization is called deserialization.

**Advantage of Java Serialization :**
It is mainly used to travel object's state on the network (known as marshaling).


**java.io.Serializable interface :**
Serializable is a marker interface (has no data member and method). It is used to "mark" java classes so that objects of these classes may get certain capability. The Cloneable and Remote are also marker interfaces.

It must be implemented by the class whose object you want to persist.

The String class and all the wrapper classes implements java.io.Serializable interface by default.

## ObjectOutputStream class
The ObjectOutputStream class is used to write primitive data types and Java objects to an OutputStream. Only objects that support the java.io.Serializable interface can be written to streams.

**Constructor :**
```
public ObjectOutputStream(OutputStream out) throws IOException {}
```
Above constructor creates an ObjectOutputStream that writes to the specified OutputStream.

**Important Methods :**
<table class="alt">
<tbody><tr><th>Method</th><th>Description</th></tr>
<tr><td>1) public final void writeObject(Object obj) throws IOException {}</td><td>writes the specified object to the ObjectOutputStream. </td></tr>
<tr><td>2) public void flush() throws IOException {}</td><td>flushes the current output stream. </td></tr>
<tr><td>3) public void close() throws IOException {}</td><td>closes the current output stream. </td></tr>
</tbody></table>

## Example of Java Serialization
Example to serialize the object of Student class.
```
import java.io.*;  
class Persist{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"John");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  
```

## Deserialization in java
Deserialization is the process of reconstructing the object from the serialized state.It is the reverse operation of serialization.

## ObjectInputStream class
An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.

**Constructor :**
```
public ObjectInputStream(InputStream in) throws IOException {}
```
Above constructor creates an ObjectInputStream that reads from the specified InputStream.

**Important Methods :**
<table class="alt">
<tbody><tr><th>Method</th><th>Description</th></tr>
<tr><td>1) public final Object readObject() throws IOException, ClassNotFoundException{}</td><td>reads an object from the input stream. </td></tr>
<tr><td>2) public void close() throws IOException {}</td><td>closes ObjectInputStream.</td></tr>
</tbody></table>

## Example of Java Deserialization
Example to deserialize the object of Student class.
```
import java.io.*;  
class Depersist{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);  
  
  in.close();  
 }  
}  
```
