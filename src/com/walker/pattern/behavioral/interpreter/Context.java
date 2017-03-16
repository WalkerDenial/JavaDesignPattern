package com.walker.pattern.behavioral.interpreter;

import java.util.StringTokenizer;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 12:07.
 */
public class Context {

    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken(){
        if(tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String currentToken(){
        return currentToken;
    }

    public void skipToken(String token){
        if(!token.equals(currentToken)){
            // TODO: 2017/3/16
        }
        nextToken();
    }

    public int currentNumber(){
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (Exception e){
            e.printStackTrace();
        }
        return number;
    }

}
