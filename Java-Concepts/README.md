# Concepts of Java

Some of the important miscellaneous concepts like Arrays, Strings, Exceptions, Genrics, Regex, Lambda etc.

NOTE : Methods mentioned below are only important ones, and not all methods.

## Methods of Number Class :

<table class="alt">
<tbody><tr><th>Sr.No.</th><th>Method</th><th>Description</th></tr>
<tr>
<td>1</td>
<td>xxxValue()</td><td>
Converts the value of <i>this</i> Number object to the xxx data type and returns it.
</td>
</tr>
<tr>
<td >2</td>
<td>compareTo()</td><td>
Compares <i>this</i> Number object to the argument.
</td>
</tr>
<tr>
<td >3</td>
<td>equals()</td><td>
Determines whether <i>this</i> number object is equal to the argument.
</td>
</tr>
<tr>
<td >4</td>
<td>valueOf()</td><td>
Returns an Integer object holding the value of the specified primitive.
</td>
</tr>
<tr>
<td >5</td>
<td>toString()</td><td>
Returns a String object representing the value of a specified int or Integer.
</td>
</tr>
<tr>
<td >6</td>
<td>parseInt()</td><td>
This method is used to get the primitive data type of a certain String.
</td>
</tr>
<tr>
<td >7</td>
<td>abs()</td><td>
Returns the absolute value of the argument.
</td>
</tr>
<tr>
<td >8</td>
<td>ceil()</td><td>
Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
</td>
</tr>
<tr>
<td >9</td>
<td>floor()</td><td>
Returns the largest integer that is less than or equal to the argument. Returned as a double.
</td>
</tr>
<tr>
<td >10</td>
<td>rint()</td><td>
Returns the integer that is closest in value to the argument. Returned as a double.
</td>
</tr>
<tr>
<td >11</td>
<td>round()</td><td>
Returns the closest long or int, as indicated by the method's return type to the argument.
</td>
</tr>
<tr>
<td >12</td>
<td>min()</td><td>
Returns the smaller of the two arguments.
</td>
</tr>
<tr>
<td >13</td>
<td>max()</td><td>
Returns the larger of the two arguments.
</td>
</tr>
<tr>
<td >14</td>
<td>exp()</td><td>
Returns the base of the natural logarithms, e, to the power of the argument.
</td>
</tr>
<tr>
<td >15</td>
<td>log()</td><td>
Returns the natural logarithm of the argument.
</td>
</tr>
<tr>
<td >16</td>
<td>pow()</td><td>
Returns the value of the first argument raised to the power of the second argument.
</td>
</tr>
<tr>
<td >17</td>
<td>sqrt()</td><td>
Returns the square root of the argument.
</td>
</tr>
<tr>
<td >18</td>
<td>sin()</td><td>
Returns the sine of the specified double value.
</td>
</tr>
<tr>
<td >19</td>
<td>cos()</td><td>
Returns the cosine of the specified double value.
</td>
</tr>
<tr>
<td >20</td>
<td>tan()</td><td>
Returns the tangent of the specified double value.
</td>
</tr>
<tr>
<td >21</td>
<td>asin()</td><td>
Returns the arcsine of the specified double value.
</td>
</tr>
<tr>
<td >22</td>
<td>acos()</td><td>
Returns the arccosine of the specified double value.
</td>
</tr>
<tr>
<td >23</td>
<td>atan()</td><td>
Returns the arctangent of the specified double value.
</td>
</tr>
<tr>
<td >24</td>
<td>atan2()</td><td>
Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
</td>
</tr>
<tr>
<td >25</td>
<td>toDegrees()</td><td>
Converts the argument to degrees.
</td>
</tr>
<tr>
<td >26</td>
<td>toRadians()</td><td>
Converts the argument to radians.
</td>
</tr>
<tr>
<td >27</td>
<td>random()</td><td>
Returns a random number.
</td>
</tr>
</tbody></table>

## Methods of Array Class :

<table class="alt">
<tbody><tr><th>Sr.No.</th><th align = "left">     Methods & Description</th></tr>
<tr>
<td>1</td>
<td><p><b>public static int binarySearch(Object[] a, Object key)</b></p>
<p>Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns index of the search key, if it is contained in the list; otherwise, it returns ( – (insertion point + 1)).</p>
</td>
</tr>
<tr>
<td>2</td>
<td><p><b>public static boolean equals(long[] a, long[] a2)</b></p>
<p>Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal. This returns true if the two arrays are equal. Same method could be used by all other primitive data types (Byte, short, Int, etc.)</p>
</td>
</tr>
<tr>
<td>3</td>
<td><p><b>public static void fill(int[] a, int val)</b></p>
<p>Assigns the specified int value to each element of the specified array of ints. The same method could be used by all other primitive data types (Byte, short, Int, etc.)</p>
</td>
</tr>
<tr>
<td>4</td>
<td><p><b>public static void sort(Object[] a)</b></p>
<p>Sorts the specified array of objects into an ascending order, according to the natural ordering of its elements. The same method could be used by all other primitive data types ( Byte, short, Int, etc.)</p>
</td>
</tr>
</tbody></table>

## Methods of Character Class :

<table class="alt">
<tbody><tr><th>Sr.No.</th><th>Method</th><th>Description</th></tr>
<tr>
<td>1</td>
<td>isLetter()</td><td>
Determines whether the specified char value is a letter.</td>
</tr>
<tr>
<td>2</td>
<td>isDigit()</td><td>
Determines whether the specified char value is a digit.</td>
</tr>
<tr>
<td>3</td>
<td>isWhitespace()</td><td>
Determines whether the specified char value is white space.</td>
</tr>
<tr>
<td>4</td>
<td>isUpperCase()</td><td>
Determines whether the specified char value is uppercase.</td>
</tr>
<tr>
<td>5</td>
<td>isLowerCase()</td><td>
Determines whether the specified char value is lowercase.</td>
</tr>
<tr>
<td>6</td>
<td>toUpperCase()</td><td>
Returns the uppercase form of the specified char value.</td>
</tr>
<tr>
<td>7</td>
<td>toLowerCase()</td><td>
Returns the lowercase form of the specified char value.</td>
</tr>
<tr>
<td>8</td>
<td>toString()</td><td>
Returns a String object representing the specified character value that is, a 1-character string.</td>
</tr>
</tbody></table>

## Methods of String Class :

<table class="alt">
<tbody><tr><th>No.</th><th>Method</th><th>Description</th></tr>
<tr><td>1</td><td>char charAt(int index)</td><td>returns char value for the particular index</td></tr>
<tr><td>2</td><td>int length()</td><td>returns string length</td></tr>
<tr><td>3</td><td>static String format(String format, Object... args)</td><td>returns formatted string</td></tr>
<tr><td>4</td><td>static String format(Locale l, String format, Object... args)</td><td>returns formatted string with given locale</td></tr>
<tr><td>5</td><td>String substring(int beginIndex)</td><td>returns substring for given begin index</td></tr>
<tr><td>6</td><td>String substring(int beginIndex, int endIndex)</td><td>returns substring for given begin index and end index</td></tr>
<tr><td>7</td><td>boolean contains(CharSeq s)</td><td>returns true or false after matching the sequence of char value</td></tr>
<tr><td>8</td><td>static String join(CharSeq delim, CharSeq... elem)</td><td>returns a joined string</td></tr>
<tr><td>9</td><td>static String join(CharSeq delim, Iterable&lt;? extends CharSeq&gt; elem)</td><td>returns a joined string</td></tr>
<tr><td>10</td><td>boolean equals(Object another)</td><td>checks the equality of string with object</td></tr>
<tr><td>11</td><td>boolean isEmpty()</td><td>checks if string is empty</td></tr>
<tr><td>12</td><td>String concat(String str)</td><td>concatinates specified string</td></tr>
<tr><td>13</td><td>String replace(char old, char new)</td><td>replaces all occurrences of specified char value</td></tr>
<tr><td>14</td><td>String replace(CharSeq old, CharSeq new)</td><td>replaces all occurrences of specified CharSeq</td></tr>
<tr><td>15</td><td>static String equalsIgnoreCase(String another)</td><td>compares another string. It doesn't check case.</td></tr>
<tr><td>16</td><td>String[] split(String regex)</td><td>returns splitted string matching regex</td>
</tr><tr><td>17</td><td>String[] split(String regex, int limit)</td><td>returns splitted string matching regex and limit</td>
</tr><tr><td>18</td><td>String intern()</td><td>returns interned string</td>
</tr><tr><td>19</td><td>int indexOf(int ch)</td><td>returns specified char value index</td></tr>
<tr><td>20</td><td>int indexOf(int ch, int fromIndex)</td><td>returns specified char value index starting with given index</td></tr>
<tr><td>21</td><td>int indexOf(String substring)</td><td>returns specified substring index</td></tr>
<tr><td>22</td><td>int indexOf(String substring, int fromIndex)</td><td>returns specified substring index starting with given index</td></tr>
<tr><td>23</td><td>String toLowerCase()</td><td>returns string in lowercase.</td></tr>
<tr><td>24</td><td>String toLowerCase(Locale l)</td><td>returns string in lowercase using specified locale.</td></tr>
<tr><td>25</td><td>String toUpperCase()</td><td>returns string in uppercase.</td></tr>
<tr><td>26</td><td>String toUpperCase(Locale l)</td><td>returns string in uppercase using specified locale.</td></tr>
<tr><td>27</td><td>String trim()</td><td>removes beginning and ending spaces of this string.</td></tr>
<tr><td>28</td><td>static String valueOf(int value)</td><td>converts given type into string. It is overloaded.</td></tr>
</tbody></table>

NOTE : CharSeq - CharSequence, delim - delimeter, elem - elements
