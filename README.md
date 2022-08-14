


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