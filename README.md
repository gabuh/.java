
## Primitive Variables

#### Working with
- There are two major classes of variables or data types in Java, known as primitives and objects. Primitive variables or data types are used to store numbers, individual characters and boolean values. They're stored in the fastest available memory, so you can get to the data as quickly as possible. Data type names for primitives are all in lowercase and that's how you can distinguish them from complex object data types, which always have an initial uppercase character. Most of the simple values you might store in Java code are primitives.
One data type that's not primitive is a string. That's a complex object. All variables in Java, whether primitives or objects, must be explicitly data typed when they are declared.

- Numbers, characters and booleans
- Stored in fastest available memory
- Primitive data type names are all Lowercase (starts)

Java is a statically typed language and that distinguishes it from dynamic languages such as JavaScript or Python. All variables must have their types declared. Here's a classic declaration:

<details>
<summary>Code</summary>

```java:

int myVar = 5;
/*
int <-- Data type
myVar <-- Identifier
5 <-- Value
*/
```

</details>

- Java naming conventions require that variable names or identifiers always start with an initial lowercase character. And then you can use camel case, using uppercase characters in the middle of the name to distinguish certain names. In fact, certain IDEs, including IntelliJ IDEA, know how to read camel cases. 

- Here are the primitive data types for numbers starting with the smallest amount of memory and going to the largest amount of memory:

|Data Type|Bits|Minimum|Maximmum|
|byte|8|-128|127|
|short|16|-32,768|32,767|
|int|32|-2,147,483,648|2,147,483,647|
|long|64|-9.22337E+18|9.22337E+18|

- All primitive values are signed, meaning that their ranges extend from negative to positive numbers. The byte data type stores eight bits of memory. Its minimum value is -128 and its maximum is positive 127. You also have short, int and long integers. Each of them takes an increasing amount of memory and has an increasing range. The most common of these data types that you'll see is the int. It's a 32-bit value and its range goes from -2 billion to positive 2 billion. If you need to store very large integers, you can use the long data type instead. There are two data types that you can use to store fractional values: float and double. Float is a 32-bit value and double is a 64-bit value.
Double values tend to be used most commonly. They give you the largest range and the highest level of precision.

##### Helper Class

|Data type|Helper Class|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Float|

- The name of the class always starts with an initial uppercase character and that's how you can distinguish the class name from the primitive data type name. The helper class for the short is Short, and the helper class for int is Integer; Long for long and Float for float.

- Each of the helper classes is a member of a package called java.lang.
- Are available to you always without you having to add any special declarations.

<details>
<summary>Code</summary>

```java:

double doubleValueExample = 160.5d ;
/*
double <-- Data type
doubleValueExample <-- Indetifier
160.5 <-- Value
d <-- This is saying that this value, which could be interpreted by the compiler as either a float or a double, is explicitly set as a double

*/

```

</detials>

- Double class has an intValue method, a floatValue and a toString method. toString is a special case.  All Java classes have a method named toString which is in charge of converting that object, whether it's a numeric or boolean or a more complex object to some sort of string. 
- The toString method of the Double helper class converts the double to a simple string value. All numeric primitives have default values and they always default to a value of zero.



#### BigDecimal currency values

- Using only double to operate a large amount of datas can give inprecise results. So BigDecimal was created to handle and solve this specific problem.
- To use BigDecimal you must import it from java.math
- You can follow the following steps:
 1. Converting the number into String
 2. Creating BigDecimal Variable
 3. Operate BigDecimal Variable


<details> 
<summary> Code </summary>

``` java:

import java.math.BigDecimal; // must import BigDecimal from java.math

public class Main {
    
    public static void main(String[] args) { //BigDecimal to take care of precise sums

        double value = .012;

        double input=0.763;

        String strInput = Double.toString(input); // converting input to str
        BigDecimal bigInput = new BigDecimal(strInput); // declaring BigDecimal value of input
        BigDecimal bigSum = bigInput.add(bigInput);  // Summing bigInput + bigInput
        System.out.println("Big Sum from input: " + bigSum.toString()); //outputting the sum of bigInput + bigInput from bigSum 


        String strValue = Double.toString(value); // converting value to str
        BigDecimal bigValue = new BigDecimal(strValue); // declaring BigDecimal value (bigValue) of variable value from strValue
        BigDecimal bSum = bigValue.add(bigInput); // adding bigValue + bigInput 
        System.out.println("Sum of Big Decimals: " + bSum.toString()); //outputting the sum of biugValue + bigInput 
 

    }

}

```

</details>

---

#### Converting numeric values

###### Widening the type - going to smaller type to larger type

- It's automatic, there is no risk of losing data.
- No special syntax requirement

<details> 
<summary> Code </summary>

```java:

public class Main { 

    public static void main(String[] args) {

        int intValue1 = 56;
        long longValue1 = intValue1;
        System.out.println("The Long Value is: " + longValue1);

    }

}


```

</details>

###### Narrowing the Type - going from larger type to smaller type

- It needs a special syntax [ typeAiming newVarName = (typeAiming) varOrigin ] ex: byte byteValue2 = (byte) intValue2;
- The number must be the in range size of the type you're aiming for. If the number is larger than the type aimed, you will lost data
- A double value as 3.99, if converted to integer it is going to lose the fractional numbers. Integers only handle the integer value, in this case the 3.

<details> 
<summary> Code </summary>

```java:

public class Main { 
    
    public static void main(String[] args) {
        
        int intValue1 = 56; // the number must be the in range size of the type you're aiming 
        int intValue2 = 1024; // if the number is larger than the type aimed, you will lost data
        
        byte byteValue1 = (byte) intValue1;
        byte byteValue2 = (byte) intValue2;

        System.out.println("The 1st byte Value is " + byteValue1);
        System.out.println("The 2nd byte Value is " + byteValue2);

    }

}


```

</details>

---

#### Using Mathematical Operators + Math Class

- Java supports the standard mathematical operators, and also supports more complex operators using the class called math as [ + (Addition), - (Subtraction), * (Multiplication), / (Division),  % (Remainder) ]
- The Type of the variables in the operation can make a big difference in the result:
 - If The two variables operate with the same type, it will return the same type. ex: int + int return int
 - If There are two different types of variables in the operation, it must return the widest type. ex: int + double return double
 - if you expect a fractional number, you can explicit one of the int values as double and must receive the double return into a double variable Ex. double result = (double) intValue / intValue2; it will return double into the double variable result.

<details> 
<summary> Code </summary>

```java:
public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);
        
        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue1 / intValue2; //if you expect a fractional number, you can explicit one of the int values as double, and must receive the double return into a double variable. 
        System.out.println("Division: " + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("Remainder: " + result5);

        
    }

}
```
###### output
Addition: 98
Subtraction: 14
Multiplication: 2352
Division: 1.3333333333333333
Remainder: 14

</details>

###### Math Class
- The Math class is a member of the Java.lang package, so you don't need any special imports or other notation to use it.
- Start with the word Math with the uppercase M, and then the method that you wanna use.
- Different methods returns different data types, depending of the kind of operation: [Math Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

<details> 
<summary> Code </summary>

```java:
double doubleValue = -3.9999;
long roundedValue = Math.round(doubleValue); //round a value, This function will return a long value.
double absValue = Math.abs(roundedValue); // Absolute value, it return absolute value
```
[Math Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

</details>

---

#### Boolean Values 

