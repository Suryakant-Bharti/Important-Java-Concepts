# Concepts of Java

Some of the important micellaneous concepts like Arrays, Strings, Exceptions, Genrics, Regex, Lambda etc.

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
