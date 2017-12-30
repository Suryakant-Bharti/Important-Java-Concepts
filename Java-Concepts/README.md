# Concepts of Java

Some of the important micellaneous concepts like Arrays, Strings, Exceptions, Genrics, Regex, Lambda etc.

## Methods of Number Class :

<table class="alt">
<tbody><tr>
<th>Sr.No.</th>
<th style="text-align:center;">Method</th>
<th style="text-align:center;">Description</th>
</tr>
<tr>
<td class="ts">1</td>
<td>xxxValue()</td><td>
<p>Converts the value of <i>this</i> Number object to the xxx data type and returns it.</p>
</td>
</tr>
<tr>
<td class="ts">2</td>
<td>compareTo()</td><td>
<p>Compares <i>this</i> Number object to the argument.</p>
</td>
</tr>
<tr>
<td class="ts">3</td>
<td>equals()</td><td>
<p>Determines whether <i>this</i> number object is equal to the argument.</p>
</td>
</tr>
<tr>
<td class="ts">4</td>
<td>valueOf()</td><td>
<p>Returns an Integer object holding the value of the specified primitive.</p>
</td>
</tr>
<tr>
<td class="ts">5</td>
<td>toString()</td><td>
<p>Returns a String object representing the value of a specified int or Integer.</p>
</td>
</tr>
<tr>
<td class="ts">6</td>
<td>parseInt()</td><td>
<p>This method is used to get the primitive data type of a certain String.</p>
</td>
</tr>
<tr>
<td class="ts">7</td>
<td>abs()</td><td>
<p>Returns the absolute value of the argument.</p>
</td>
</tr>
<tr>
<td class="ts">8</td>
<td>ceil()</td><td>
<p>Returns the smallest integer that is greater than or equal to the argument. Returned as a double.</p>
</td>
</tr>
<tr>
<td class="ts">9</td>
<td>floor()</td><td>
<p>Returns the largest integer that is less than or equal to the argument. Returned as a double.</p>
</td>
</tr>
<tr>
<td class="ts">10</td>
<td>rint()</td><td>
<p>Returns the integer that is closest in value to the argument. Returned as a double.</p>
</td>
</tr>
<tr>
<td class="ts">11</td>
<td>round()</td><td>
<p>Returns the closest long or int, as indicated by the method's return type to the argument.</p>
</td>
</tr>
<tr>
<td class="ts">12</td>
<td>min()</td><td>
<p>Returns the smaller of the two arguments.</p>
</td>
</tr>
<tr>
<td class="ts">13</td>
<td>max()</td><td>
<p>Returns the larger of the two arguments.</p>
</td>
</tr>
<tr>
<td class="ts">14</td>
<td>exp()</td><td>
<p>Returns the base of the natural logarithms, e, to the power of the argument.</p>
</td>
</tr>
<tr>
<td class="ts">15</td>
<td>log()</td><td>
<p>Returns the natural logarithm of the argument.</p>
</td>
</tr>
<tr>
<td class="ts">16</td>
<td>pow()</td><td>
<p>Returns the value of the first argument raised to the power of the second argument.</p>
</td>
</tr>
<tr>
<td class="ts">17</td>
<td>sqrt()</td><td>
<p>Returns the square root of the argument.</p>
</td>
</tr>
<tr>
<td class="ts">18</td>
<td>sin()</td><td>
<p>Returns the sine of the specified double value.</p>
</td>
</tr>
<tr>
<td class="ts">19</td>
<td>cos()</td><td>
<p>Returns the cosine of the specified double value.</p>
</td>
</tr>
<tr>
<td class="ts">20</td>
<td>tan()</td><td>
<p>Returns the tangent of the specified double value.</p>
</td>
</tr>
<tr>
<td class="ts">21</td>
<td>asin()</td><td>
<p>Returns the arcsine of the specified double value.</p>
</td>
</tr>
<tr>
<td class="ts">22</td>
<td>acos()</td><td>
<p>Returns the arccosine of the specified double value.</p>
</td>
</tr>
<tr>
<td class="ts">23</td>
<td>atan()</td><td>
<p>Returns the arctangent of the specified double value.</p>
</td>
</tr>
<tr>
<td class="ts">24</td>
<td>atan2()</td><td>
<p>Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.</p>
</td>
</tr>
<tr>
<td class="ts">25</td>
<td>toDegrees()</td><td>
<p>Converts the argument to degrees.</p>
</td>
</tr>
<tr>
<td class="ts">26</td>
<td>toRadians()</td><td>
<p>Converts the argument to radians.</p>
</td>
</tr>
<tr>
<td class="ts">27</td>
<td>random()</td><td>
<p>Returns a random number.</p>
</td>
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
<tr><td>7</td><td>boolean contains(CharSequence s)</td><td>returns true or false after matching the sequence of char value</td></tr>
<tr><td>8</td><td>static String join(CharSequence delimiter, CharSequence... elements)</td><td>returns a joined string</td></tr>
<tr><td>9</td><td>static String join(CharSequence delimiter, Iterable&lt;? extends CharSequence&gt; elements)</td><td>returns a joined string</td></tr>
<tr><td>10</td><td>boolean equals(Object another)</td><td>checks the equality of string with object</td></tr>
<tr><td>11</td><td>boolean isEmpty()</td><td>checks if string is empty</td></tr>
<tr><td>12</td><td>String concat(String str)</td><td>concatinates specified string</td></tr>
<tr><td>13</td><td>String replace(char old, char new)</td><td>replaces all occurrences of specified char value</td></tr>
<tr><td>14</td><td>String replace(CharSequence old, CharSequence new)</td><td>replaces all occurrences of specified CharSequence</td></tr>
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
