package com.company;

import java.util.Scanner;
import java.util.Stack;

//Homework Question Number 3
public class Main<E>
{
    public static boolean isValid(String input)
    {
         Stack<Character> stack         = new Stack<Character>();
         int              parenthesis   = 0;
         int              bracket       = 0;
         int              squareBracket = 0;
          boolean valid = false;

        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == '(')
            {
                stack.push(input.charAt(i));
                parenthesis++;
                valid = false;
            }
            else if(input.charAt(i) == '{')
            {
                bracket++;
                stack.push(input.charAt(i));
                valid = false;
            }
            else if(input.charAt(i) == '[')
            {
                squareBracket++;
                stack.push(input.charAt(i));
                valid = false;
            }
            else if(input.charAt(i) == ')')
            {
                if(!stack.empty())
                {

                    if(stack.peek().equals('('))
                    {
                        stack.pop();
                        parenthesis--;
                        valid = true;

                    }
                }
            }
            else if(input.charAt(i) == '}')
            {
                if(!stack.empty())
                {

                    if(stack.peek().equals('{'))
                    {
                        stack.pop();
                        bracket--;
                        valid = true;
                    }
                }

            }
            else if(input.charAt(i) == ']')
            {
                if(!stack.empty())
                {
                    if(stack.peek().equals('['))
                    {
                        stack.pop();
                        squareBracket--;
                        valid = true;
                    }
                }
            }
            if(parenthesis!=0 ||bracket!=0||squareBracket!=0){
                valid=false;
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        Scanner scanner       = new Scanner(System.in);
        String  input         = scanner.next();

        System.out.println(isValid(input));

    }
}
