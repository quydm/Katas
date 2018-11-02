# Katas
A collection of TDD exercises that are useful as katas. A copy of [this repository](https://github.com/mwhelan/Katas).

### Anagrams Kata
[http://www.codeproject.com/Articles/498404/TDD-the-Anagrams-Kata](http://www.codeproject.com/Articles/498404/TDD-the-Anagrams-Kata)

Write a program to generate all potential anagrams of an input string. 

For example, the potential anagrams of "biro" are 

	biro bior brio broi boir bori 
	ibro ibor irbo irob iobr iorb 
	rbio rboi ribo riob roib robi 
	obir obri oibr oirb orbi orib  

---

### Conway's Game of Life Kata
From [TDD & Conway's Game of Life](http://jeremybytes.blogspot.co.uk/2014/10/tdd-conways-game-of-life.html).

Implement these rules for Conway's Game of Life:
- Any live cell with fewer than two live neighbours dies, as if caused by under-population.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any live cell with more than three live neighbours dies, as if by overcrowding.
- Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction. 

---

### Fibonacci Generator Kata
Write some code to generate the Fibonacci sequence up to a specific length which is no shorter than 8 numbers and no longer than 50

	F0 => 0
	F1 => 1
	F2 => 1  
	F3 => 2
	F4 => 3
	F5 => 5  
	F6 => 8
	F7 => 13
	F8 => 21  

The Rule is  Xn = Xn-1 + Xn-2

    i.e. Fibonacci(number - 1) + Fibonacci(number - 2)

---

### The Fibonacci Sequence Kata
Source: Jason Gorman ([Codemanship](http://codemanship.co.uk/tdd.html))

Write a C# script that writes out the number for a given position in the Fibonacci Sequence

## Example ##

Given the sequence

    0
    1
    1
    2
    3
    5
    8
    13
    21
    34

Supplying position 5 would print 3

---

### FizzBuzz Kata
Write some code that will generate a string of integers, starting at 1 and going up to 100, all separated by commas. Substitute any integer which is divisible by 3 with "Fizz", and any integer which is divisible by 5 with "Buzz", and any integer divisible by 3 and 5 with "FizzBuzz".

	1
	2
	Fizz
	4
	Buzz
	Fizz
	7
	8
	Fizz
	Buzz
	11
	Fizz
	13
	14
	FizzBuzz
	16
	17
	Fizz
	19
	Buzz

... etc up to 100

---

### FizzBuzzWhiz Kata
Same as FizzBuzz but substitute prime numbers with "Whiz"

Write some code that will generate a string of integers, starting at 1 and going up to 100, all separated by commas. Substitute any integer which is divisible by 3 with "Fizz", and any integer which is divisible by 5 with "Buzz", and any integer divisible by 3 and 5 with "FizzBuzz".

	1
	Whiz
	FizzWhiz
	4
	BuzzWhiz
	Fizz
	Whiz
	8
	Fizz
	Buzz
	Whiz

The smallest twenty-five prime numbers (all the prime numbers under 100) are:

	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

---

### Leap Year Kata
Write a function that returns ***true*** or ***false*** depending on
whether its input integer is a leap year or not.

A leap year is divisible by 4, but is not otherwise divisible by 100, unless it is also divisible by 400.

Examples:

	1996 => true 
	2001 => false 
	2000 => true 
	1900 => false  

---

### Page Kata
Source: [Tomek Kaczanowski](http://kaczanowscy.pl/tomek/2013-04/code-kata-pager)

The kata is about the writing of the underlying data model for a pager control (NOT about the presentation). What you should create is a class (bunch of classes) which is smart enough to provide all the data required to actually render the links to pages.

![pager control](https://github.com/mwhelan/Katas/raw/master/Katas.Pager/pager.png)

So, the pager gets the following data as input:

- total number of items
- page size. That is, number of items per page
- offset e.g. 4680, which means that the user has already flipped through 234 pages (20 items each) 
- current page number e.g. 234 (which in fact is the same information)

Given this data pager should be able to answer the following questions:

- how many pages are there? e.g. total records / records per page,
- should prev/next link be visible? e.g. prev button should not be visible when user is on the first page,
- which links to print? e.g. when user is on 25th page, then links to 24, 25 and 26 should be printed,
- which page is current? so we could bold/highlight it's number (and remove the link).
- And so on.

---

### Prime Calculator Kata
A method that, given an integer, returns true if it is a prime and false if it is not.

---

### String Calculator Kata
Source: [Roy Osherove](http://osherove.com/tdd-kata-1/)

The essence is a method that, given a delimited string, returns the sum of the values. 

1. Create a simple String calculator with a method `int Add(string numbers)`
	- The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return `0`) for example `“”` or `“1”` or `“1,2”`
	- Start with the simplest test case of an empty string and move to 1 and two numbers
	- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
	- Remember to refactor after each passing test
1. Allow the Add method to handle an unknown amount of numbers
1. Allow the Add method to handle new lines between numbers (instead of commas).
	- the following input is ok:  “1\n2,3”  (will equal 6)
	- the following input is NOT ok:  “1,\n” (not need to prove it - just clarifying)
1. Support different delimiters
	- to change a delimiter, the beginning of the string will contain a separate line that looks like this:
   `“//[delimiter]\n[numbers…]”` 
	- for example `“//;\n1;2”` should return three where the default delimiter is `‘;’` .
	- the first line is optional. All existing scenarios should still be supported.
1. Calling Add with a negative number will throw an exception `“negatives not allowed”` - and the negative that was passed.if there are multiple negatives, show all of them in the exception message

Stop here if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.

1. Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2
1. Delimiters can be of any length with the following format:  `“//[delimiter]\n” `for example: `“//[***]\n1***2***3”` should return `6`
1. Allow multiple delimiters like this:  “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
1. Make sure you can also handle multiple delimiters with length longer than one char

## Suggested Tests ##
Here is a suggested list of tests (from [Peter Provost](http://www.peterprovost.org/blog/2012/05/02/kata-the-only-way-to-learn-tdd)):

1. An empty string returns zero
1. A single number returns the value
1. Two numbers, comma delimited, returns the sum
1. Two numbers, newline delimited, returns the sum
1. Three numbers, delimited either way, returns the sum
1. Negative numbers throw an exception
1. Numbers greater than 1000 are ignored
1. A single char delimiter can be defined on the first line (e.g. //# for a ‘#’ as the delimiter)
1. A multi char delimiter can be defined on the first line (e.g. //[###] for ‘###’ as the delimiter)
1. Many single or multi-char delimiters can be defined (each wrapped in square brackets)

---

### Word Counter Kata
A method that, given a delimited string, returns a collection of all of the 
unique words in it and the count of how many times they occurred.
Start off with a space between words, but later other delimiters wil
be added.

Example input:

	"boom,bang,boom"

Which would produce the following result:

	boom, 2
	bang, 1

---

### Bank Transfer Kata
Source: Jason Gorman ([Codemanship](http://codemanship.co.uk/tdd.html))

- Write some code to transfer a specified amount of money from one bank account (the payer) to another (the payee)
- Write some code to keep a record of the transfer for both bank accounts in a transaction history
- Write some code to query a bank account's transaction history for any bank transfers to or from a specific account 
