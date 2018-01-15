# Few Things to Remember

## Definitions, Tips & Rules related to Java OOPS

### Class & Constructor
- A class in Java can contain: fields, methods, constructors, blocks, nested class and interface.
- Object is an instance of a class.
- Constructor in java is a special type of method that is used to initialize the object.
- If there is no constructor in a class, compiler automatically creates a default constructor.
- There is no copy constructor in java. But, we can copy the values of one object to another like copy constructor in C++.
- A constructor can perform other tasks instead of initialization like object creation, starting a thread, calling method etc. You can perform any operation in the constructor as you perform in the method.

### static Keyword
- The static can be: variable (class variable), method (class method), block & nested class.
- Java static property is shared to all objects.
- A static method belongs to the class rather than object of a class.
- A static method can be invoked without the need for creating an instance of a class.
- A static method can access static data member and can change the value of it.
- The static method can not use non static data member or call non-static method directly.
- this and super cannot be used in static context.
- The main method is static because object is not required to call static method if it were non-static method, jvm create object first then call main() method that will lead the problem of extra memory allocation.
- A static block is used to initialize the static data member. It is executed before main method at the time of classloading.

### this Keyword
- In Java, this is a reference variable that refers to the current object.
- Call to this() must be the first statement in constructor.
- this can be used to: refer current class instance variable, invoke current class method and constructor. 
- this canpassed as an argument in the method and constructor call.
- this can be used to return the current class instance from the method.
- It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.

### Inheritance
- Inheritance (IS-A) is a mechanism in which one object acquires all the properties and behaviors of parent object.
- The extends keyword indicates that you are making a new class that derives from an existing class.
- Multiple inheritance is not supported in Java through class. We can use Interface to perform it.
- To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
- If a class have an entity reference, it is known as Aggregation (HAS-A relationship).
- Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.

### Method Overloading
- If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
- There are two ways to overload the method in java : by changing number of arguments, by changing the data type.
- In Java, Method Overloading is not possible by changing the return type of the method only because of ambiguity.
- Compile Time Error is better than Run Time Error. So, java compiler renders compiler time error if you declare the same method having same parameters.
- We can also overload Java main() method, but JVM calls main() method which receives string array as arguments only.
- One type is promoted to another implicitly if no matching datatype is found. eg. byte can be promoted to short, int, etc.
- If there are no matching type arguments method, and each method promotes similar number of arguments, there will be ambiguity.
- One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.




- If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.

- The super keyword in java is a reference variable which is used to refer immediate parent class object.
- 
