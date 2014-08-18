package com.victorarana.datastructures;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

class SimpleIO 
{
    public static void main( String[] args ) throws Exception
    {
    	// 01 Read raw data from some source, but don't format the data
    	InputStream is = System.in;
    	// 02 Compose the raw data into characters
    	InputStreamReader isr = new InputStreamReader(is);
    	// 03 Compose characters into entire lines of text
    	BufferedReader keyb = new BufferedReader(isr);
    	
        System.out.println(keyb.readLine());
    }
}
