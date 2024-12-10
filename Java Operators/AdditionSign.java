

/*The "+" sign in Java can be used for 2 main things:
 * 
 * 1. It is used for adding words to the value of a String variable.
 * For example: 
 * 
 * Say you have a String variable named "string", and then you gave "string" a value of "hello".
 * What the "+" allows you to do is to add more words to String's value to increase it.
 * 
 * Like, for example, if you added the word "world" to the String's value "hello", the String's value would now
 * be "helloworld", because the "+" sign took the word "hello" and combined it with the other word "world". So, in short terms,
 * the "+" sign can be used for combining Strings together, and that method is called "concantenation".
 * 
 * Here below is an example showing what that concantenation would look like. To make it so the "+" sign can combine Strings, you need to add the "="
 * sign to as well, which represents the String getting something added to what it already has. So in total, the sign would look something like this --> "+=".
*/

 class AdditionSignForStrings {

    public static void main(String[] args) {
        String string = "hello"; //Initializing the String variable "string" with the value "hello".
        string += "world"; //Combining its original String value "hello" with another String value "world" using the "+" sign combined with the equal sign.

        System.out.println(string); //Outputting the String to the console.
    }
}

/*So now, if you ran this code, what it's going to do first is initialize a String with the value of "hello", then using the "+" sign, COMBINED with the equal sign,
 * we combine another String value with "string"'s original String value, and then it finally, the program outputs the value of "string" to the console.
*/ 


/*2. It is used for adding number values together.
 * For example:
 * 
 * Say you have an Integer variable named "number" that carries the value of "5". What the "+" operator will do is it allows you to combine any other integer number 
 * with the current number value of the Integer variable that you're using.
 * 
 * Like, for example, if you combined the number value "6" with the original number value of the "number" variable, which is 4, then the new number value of the "number"
 * variable would be 10, because the two numbers were added together with the "+" sign. Now, like the String example, you need need to use the "+" sign in combination
 * with the equal sign to be able to combine an original variable value with another value.
 * 
 * 
 * Below is an example showing the addition of the original number value of an Integer variable being combined with another number value.
*/

class AdditionSignForIntegers {
    public static void main(String[] args) {
        int number = 4; //Initializing the number variable "number" with the value "4".
        number += 6; //Combining the original number value of "number" with another number value, like "6".

        System.out.println(number); //Outputting the newly updated variable to the console.
    }
}

/*If you ran this code, here's what would happen. First, the program would initialize an Integer variable named "number*, that contains
the number value of "4*. Then, the program would combine the original value of the variable (4) with the other inputted number value, which is "6",
meaning that the new value for the variable "number" would now be 10, because it's original value got combined with the number 6.

And then, finally, the program will output the variable's value to the console, outputting 10 as the variable's value.*/
