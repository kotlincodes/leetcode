package com.example.lib

import java.util.*

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
*/

fun main(args:Array<String>){

    var result= isValid("{[]()}")
    printResult("Remove Element ",result.toString())
}

fun isValid(s: String): Boolean {

    var stack=Stack<String>()
    s.forEach {
        when(it.toString()){
            "{"->stack.push("}")

            "("->stack.push(")")
            "["->stack.push("]")
            else-> {
                if(stack.isEmpty()||stack.pop()!=it.toString()){
                    return false
                }
            }
        }

    }
    return stack.isEmpty()
}
