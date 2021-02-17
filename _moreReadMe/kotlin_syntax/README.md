#Intro

Kotlin is a new programming language for the JVM. It produces Java bytecode, supports Android and generates JavaScript. The latest version of the language is [Kotlin M5.3]("http://blog.jetbrains.com/kotlin/2013/06/kotlin-m5-3-idea-13-delegated-properties-and-more/")

Kotlin project website is at [kotlin.jetbrains.org](http://kotlin.jetbrains.org).

All the codes here can be copied and run on [Kotlin online editor](http://kotlin-demo.jetbrains.com/).

Let's get started.

#Basics
- You do not need `;` to break statements.
- Comments are similar to Java or C#, `/* This is comment */` for multi line comments and `// for single line comment`.
- Unlike Java, you do not need to match your file name to your class name.
- Like JavaScript, you can create functions outside classes. So there is no need to stuff your functions as static members of classes like what you do in C# or Java.
- Kotlin has string templates, which is awesome. e.g. `"$firstName $lastName"` for simple variable name or `"${person.name} is ${1 * 2}"` for any expressions. You can still do the string concatenation if you like e.g. `"hello " + "world"`, but that means being stupid.
- It has no tuple although Kotlin's data classes is an option to use in place of tuple.


##Variables
- There are two keywords for variable declaration, **var** and **val**.
- Use **var** when the variable value is to be modified and **val** where the variable value will not change after first assigned.
- This **val** is similar to **readonly** keyword in C# or **final** keyword in Java.
- **val** variable must be initialized at declaration.
- Unlike Java or C#, you declare the type of a variable after the name, e.g. `var firstName : String`
- Number primitive types are as follows: Double, Float, Long, Int, Short, Byte. There is no automatic conversion between types. You have to explicitly convert them.
- More primitive types: Char, String, Boolean.
- All variable declarations in Kotlin must be initialized.
- The keyword `void` common in Java or C# is called `Unit` in Kotlin.

###Null

In Kotlin you have to decide whether a variable can be assigned null or not. This applies to both primitives or class types. A nullable variable is marked by assigning ? after the type, e.g. `var firstName: String?`

You can assign a value from not-nullable to nullable type without any problem.

```kotlin
fun main(args : Array<String>) { 
    val firstName : String = "Adam"
    val name : String? = firstName 
    print("$name") 
}
```

The other way around though requires that you declare that this nullable variable does not contain null at the point of assignment with !! operator (which pretty much declares : "I am sure this nullable variable is not null at this point")

```kotlin
fun main(args : Array<String>) { 
    val name : String? = "Adam" 
    val firstName : String = name!! 
    print("$firstName") 
}
```    					
					
###Type inference

Kotlin is pretty smart about inferring what type a variable is, whether it is primitives or class. This is similar to the var keyword in C#.

```kotlin
fun main(args : Array<String>) { 
    val firstName = "Adam" 
    val middle = 'c' 
    val lastName = "Brown" 
    val age = 15 
    println("$firstName $middle $lastNameis $age") 
}
```							
                            
You will encounter in further examples of more capabilities of Kotlin's type inference.                            

#Functions
We are going to spend a considerable time in discussing function because it has many different forms and subtleties. Here is a list of facilities that Kotlin provides for functions

- Single expression function.
- Optional parameter.
- Positional argument and named argument.
- Variable argument.
- Single expression function.
- Function type.
- Function literals.
- Callable references.
- Extension functions.
- Infix function call.
- Local function.
- Closure.
- Generic function.
- Operator overloading.

Below is an example of functions

```kotlin
fun main(args : Array<String>) { 
    greet(englishGreeting()) 
    greet(italianGreeting())
} 

fun greet(msg : String){ 
    println(msg) 
} 
    
fun englishGreeting() : String = "Hello world" 
    
fun italianGreeting() : String{ 
    return "bon giorno" 
}
```					

- Functions can exists on their own.
- It is marked by **fun** keyword.
- If a function returns value, you declare it after the function name.
- `englishGreeting()` is a *single expression function*.
- A void function such as `greet()` returns Unit type but you are not required to declare it.
- All parameters in a Kotlin function are read only. You are actually not allowed to mark it with either `val` or `var` keyword.


##Single expression function

This is a shorthand form in defining a function when you only have a single expression to be executed.

```kotlin
fun main(args : Array<String>) {
   val res = add(1,1)
   show("$res")
}


fun add(a : Int, b : Int) = a + b
fun show(msg : String) = println("$msg")
```

As you can see above, in a single expression function, the function return type is inferred. You can declare the return type if you want to such as below. 

```kotlin
fun main(args : Array<String>) {
   val res = add(1,1)
   show("$res")
}


fun add(a : Int, b : Int) : Int = a + b
fun show(msg : String) : Unit = println("$msg")
```


##Optional parameters

Kotlin allows you to assign default values for your parameters, making them optional. 

```kotlin 
fun main(args : Array<String>) {
  show()
  show("Good morning")
}


fun show (msg : String = "Hello World"){
    println("$msg") 
}
```

If you are mixing mandatory parameter and optional parameter, the mandatory parameters must be listed first.

##Arguments

```kotlin
fun main(args : Array<String>) { 
    greet(firstName = "Frasensco", lastName = "Merini") 
    greet(lastName = "John", firstName = "Stamos") 
    greet("Borat", "Ismail") 
    greet("Crystal", lastName = "Stamos") 
    call("Xavier", age = 20, location = "Portugal") 
} 
    
fun greet(firstName : String, lastName : String){
    println("Good morning $firstName $lastName") 
} 
    
fun call(name : String, location : String, age : Int){ 
    println("Call $name who lives at $location and he is $age old") 
}
```					
				
Kotlin allows positional argument, named argument and the mix between the two. When you mix named and positional argument, you must start with positional argument.

###Variable arguments

Use the keyword **vararg**.

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy")
}

fun names(vararg  names : String){
  for(n in names){
    println("$n")
  }
}
```

If **vararg** parameter is not the last parameter, named argument must be used to supply the function argument.

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy", age = 20)
}

fun names(vararg  names : String, age : Int){
  for(n in names){
    println("$n is $age old")
  }
}
```


###vararg produces array of argument
```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy")
}

fun names(vararg  names : String){
  println("Argument length is ${names.size}")
  println("${names[0]}")
  val nns : Array<String> = names
  println("${nns[1]}")
}
```

###Using array to supply variable arguments
Use the * operator in front of the array variable

```kotlin
fun main(args : Array<String>) {
  val n = array("John", "Adam", "Joy")
  names(*n)
}

fun names(vararg  names : String){
  println("Argument length is ${names.size}")
  println("${names[0]}")
  val nns : Array<String> = names
  println("${nns[1]}")
}
``` 

###Passing one varargs argument to another
```kotlin
fun main(args : Array<String>) {
  val n = array("John", "Adam", "Joy")
  fugitives(*n)
}
,  
fun fugitives(vararg escapees: String){
  names(*escapees) 
}

fun names(vararg  names : String){
  println("Argument length is ${names.size}")
  println("${names[0]}")
  val nns : Array<String> = names
  println("${nns[1]}")
}
```
Since **vararg** creates an array, you simply use the * operator to pass one **vararg** to another.

##Function Types and Function Literals

A function type is a type consisted of a function signature and function return type that are separated by -> operator. In its simplest form, it looks as follows: 

`() -> Unit`

Above is a type for a function that takes no parameter and returns a Unit (void in other language parlance)

`() -> String`

Above is a type for a function that takes no parameter and return a String

`(String) -> Unit`

Above is a type for a function that takes a string and returns nothing.

`(String, Float) -> Unit`

Above is a type for a function that takes two parameters (String and Float) and returns nothing.

Because a function type is just a type, it means that you can assign it to a variable, you can pass it as a function argument and you can return it from a function.

###Different ways to write function literals

```kotlin
val m = { (x : String) -> println("$x") } 
val n : (String) -> Unit = { x -> println("$x") } 
val o : (String) -> Unit = { (x : String) -> println("$x") } 

fun main(args : Array<String>) { 
    m("good morning")
    n("good morning") 
    o("good morning") 
}
```

Above code is an example of function literals. All `m`, `n` and `o` represent the same function.
            		
Below is a function that returns a function type

```kotlin
fun main(args : Array<String>) { 
    val greet = greetingFrom("Cairo, Egypt") 
    greet("Brown") 
} 

fun greetingFrom(location : String) : (String) -> Unit{ 
    return { name -> println ("Hello $name from $location")}
}
```				
	
Below shows that you can specify a function type as an argument and supply it with function literal with corresponding function signature and return type.

```kotlin
fun evening(): String = "Good Evening" 
fun main(args : Array<String>){ 
    say({ "good morning"}) 
    say { val msg = "good afternoon" msg } 
    say({evening()})
} 

fun say(greet : () -> String){ 
    println("${greet()}") 
}
```

##Callable references

How about if you already have a function that you want to pass as a parameter? You prefix the function name with '::'

```kotlin
fun main(args : Array<String>) {
 calcAndShow(10,10, ::add) //20
 calcAndShow(10,10, ::multiply) /100
 calcAndShow(10,19, { x, y -> x - y }) //-9
}

fun calcAndShow(a : Int, b : Int,  func : (a : Int, b : Int) -> Int){
 val result = func (a, b)
 println("$result")
}

fun add(a : Int, b : Int) : Int = a + b
fun multiply (a : Int, b : Int) : Int = a * b
```


##Function expansion

When you call a function which has a function type as the last argument, you can expand it by { }

```kotlin
fun main(args : Array<String>) {
    val a =  calculate(1) { x -> 10 + x } //11
    val b = calculate(2) { x -> 20 * x } //40

    println("a = $a, b = $b")
}

fun calculate(a : Int,  calc : (Int) -> Int) : Int{
    return calc(a)
}
```

##Closure

Kotlin support Closure as highlighted by the example below

```kotlin
fun main(args : Array<String>) {
    val total = add(1)(2)
    println("Total value is $total")
}

fun add(a : Int) : (Int) -> Int{
    return { x -> a + x }
}
```

##Local function

You can declare a function inside a function. It will have access to the local variable at the parent function.
```kotlin
fun main(args : Array<String>){ 
    accumulate() 
} 

fun accumulate(){
    var i = 0 

    fun add(){ 
        i++ 
    } 

    for (i in 1..10){
        add() 
    } 

    println("i is now $i") 
}

//It prints "i is now 10"
```


##Extension function

Extension function enables a function to be accessed from the type function. It works in the form of __type.function__
Inside the function, the keyword `this` refers to the instance. 

For example
```kotlin   
fun Int.show(){
    println("This number is $this")
}
    
fun main(args : Array<String>){
    3.show()
}
```

Above example shows how the `Int` built in type has been enriched by `show` extension function. Notice the use of `this` keyword that refers to the `3` number.


**Notice** You can extend a function on a nullable type and it will be accessible for both nullable and non nullable type. The reverse though does not apply.

```kotlin
fun Int?.show(){
    println("This number is $this")
}
 
fun Int.show2(){
    println("This number is $this")
}

fun main(args : Array<String>){
    var number : Int? = null
    number.show()
    5.show()
    //number.show2() will not compile
}
```

    
### Extension function expressed in function literals

```kotlin
val show = { Int.() -> println("This is number $this") }
val add = { Int.(number : Int) : Int -> 
    val now = this + number
    now
}

fun main(args : Array<String>){
    5.add(10).show()
}
```

Both `show` and `add` extension functions are expressed in literal format. Please notice that `add` function returns an `Int`.

    
### Extension function in infix form
```kotlin
fun main(args : Array<String>) {
   val res = 1 add 2
   println("$res")
}

fun Int.add (one : Int) : Int = this + one
```

If the extension function only takes one argument, you can call them in infix form (you drop the . between the type and the function). So instead of `1.add(2)`, you can call it in the form of `1 add 2`. This makes certain constructs looks natural (more like an operator than a function call) and especially useful in construction DSL in Kotlin.

##Variable arguments and function type argument

`vararg` parameter can also be naturally combined with a function type parameter.

```kotlin
fun main(args : Array<String>) {
  names("John", "Adam", "Joy"){ 
    name  -> println ("$name")
  }
}

fun names(vararg  names : String, print : (String) -> Unit){
  for(n in names){
   print(n)
  }
}
```

above code can also be expressed in this matter (using named argument)
```kotlin

fun main(args : Array<String>) {
  names("John", "Adam", "Joy", print = {name  -> println ("$name")})
}

fun names(vararg  names : String, print : (String) -> Unit){
  for(n in names){
   print(n)
  }
}

```

#Control Structures


##If statement

Kotlin **if** statement should look familiar with other language

```kotlin
fun main(args : Array<String>) {
  val total = 10
  
  if (total > 5){
      println("$total is greater than 5") 
  }else if (total > 10){
      println("$total is greater than 10")
  }else{
      println("$total is less than 6")
  }
}

```

This is a quick guide to Kotlin programming language. The previous part of this guide is [here](https://gist.github.com/dodyg/f5a22af732a2a4e95287)

#Object Oriented

```kotlin
fun main(args : Array<String>) {
  class local (val x : Int)
  
  val y = local(10)
  println("${y.x}")
}
```

Above code is a sample of __Local Class__, one of many support that Kotlin has for OO programming. 

- Abstract classes
- Primary constructor
- Delegation
- Generic classes
- Class objects
- Nested classes
- Local classes
- Object expressions
- Traits
- Data classes
- Anonymous Analyzer
- Anonymous Objects

##Kotlin classes

Kotlin classes does not have:
- Static member (methods or properties)
- Secondary constructors
- No fields, just properties

###Simplest Kotlin class definition
```Kotlin
class Person


fun main(args : Array<String>) {
  val p = Person()
  val name = javaClass<Person>().getSimpleName()
  println("$name")
}
```

The class Person is as simple as you can get to declare a class


by default, a Kotlin class is final. So to make a class inheritable, you must you the keyword open in front of it


```kotlin
open class Person
class Hero : Person()


fun main(args : Array<String>) {
  val name = javaClass<Person>().getSimpleName()
  println("$name")
  
  val name2 = javaClass<Hero>().getSimpleName()
  println("$name2")
}
```

### Visibilities
Kotlin has four visibilities:
- private
- protected
- internal
- public

If you do not declare a visibility modifier, it is assumed to be `internal` visibility.

```kotlin
fun main(args : Array<String>) {
    val x = Visibility()
}

class Visibility{
 public var name : String = ""
 private var age : Int = 0
 protected var address : String = ""
 internal var friends : String = ""  
 var status : String = "Single"
}
```

An empty class is off course useless. Let's add some properties to it so it can hold data

```kotlin
open class Person
  
class Hero : Person(){
  public var name : String = ""
  public var age : Int = 30
  }


fun main(args : Array<String>) {
  val h = Hero()
  h.name = "Superman"
  h.age = 30
  
  println("${h.name} is ${h.age} years old")
}
```

Rule
- Every declared property must be initialized, without exception.
- a var property means it can be modified
- a val property is a constant

##Primary constructor##
Unlike many other OO language, Kotlin only allows one single constructor 

```kotlin
open class Person
  
class Hero (n: String, a : Int) : Person(){
  public var name : String = n
  public var age : Int = a
  }


fun main(args : Array<String>) {
  val h = Hero("Superman", 30)
  println("${h.name} is ${h.age} years old")
}
```

As you can see, the constructor parameter n and a are being used to initialized their respective properties.

