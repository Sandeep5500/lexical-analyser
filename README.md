# COOLC Lexer Assignment 
## By Sandeep Kumar CS18BTECH11041

The CoolLexer.g4 file, the primary end product of this assignment, serves as a lexical analyser for the COOL programming language. The lexical analyser is equipped to read a variety of tokens including but not limited to integer and boolean constants, keywords, identifiers, strings and comments. The following are some of the major design decisions that have been taken to achieve this result.
## Design decisions
Certain characters which are recognized as tokens like .,=,*,~ etc are defined first with their tokens directly corresponding to their characters.

This is then followed by Keywords, Boolean and Integer constants. This ensures that they the Boolean constants are not mistaken as identifiers later on. This brings us to the definition of the identifiers, of both objects and types.
Whitespaces are next and these are skipped by the lexer.

Following this, strings and their related errors are dealt. Different tokens are defined to detect the various string errors and the type of error is reported for each of them as well. Null character errors and unterminated string error are some examples of the type of erros dealt with by the tokens in this section. 
The tokens have been ordered in a specific order so as to reflect the priority of errors in an actual COOLC compiler. The STR_VALID token plays a key role in this, as it contains all the legal string combinations. The string constant(STR_CONST) defintion in this section invokes the processString() function, which is tasked with converting escape sequences in the string and checking for string overflow.

The next portion of the code takes care of comments, which are also skipped by the lexer. Two modes are used for this purpose, one for the outer most comment and one for the case of nested comments. As soon as a (* is encountered the lexer enters the first mode and proceeds from there. A variety of tokens are used here for dealing with the EOF in comment error. 
The very last token in the program, INVALID_CHAR, is defined for dealing with invalid characters and as expected, raises an error on matching.

The two newly defined functions in the program are processString() and invalidChar() which are tasked with string handling and passing illegal characters to the predefined reportError() function respectively.
## Test Cases
The following 5 test files provides a well rounded test for any COOLC lexer covering strings, comments, identifiers and any exceptional cases regarding the aforementioned topics.
### Test Case 1: 
This is a simple example of an actual COOL program which covers some basic tokens for us to test the lexer on. It inlcudes a nested comment, a main class, an object declaration and the printing of a string and integer constant.
### Test Case 2:
This file tests the lexer ability to deal with different types of legal escape sequences in strings for characters like the newline character, backslash, double quotes and ordinary characters like 'H'.
### Test Case 3 & 4:
A lexer must raise error on encountering certain strings and such strings are what make up these two test cases. Strings with null characters, unescaped newline characters, EOF characters and those which exceed the 1024 character string limit make up some of the main tests in these files.
### Test Case 5:
This test's purpose is to check the lexer's capability to detect different keywords, special character tokens and identifiers.
### Test Case 6:
Test case 5 is made of both legal and illegal comments which allows us to make a solid conclusion about the lexer's handling of comments. These include nested comments, comments with EOF and unopened comments i.e *).  


