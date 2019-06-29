import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
      
	  
		//System.out.println("YesNo");
        if(isUnique(input.replaceAll("\\s", ""))==true){
            System.out.println("Yes");
        }else{
             System.out.println("No");
        }
      
    }
    
    public static boolean isUnique(String input){
        
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}



//Approach 2
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
      
	  
		//System.out.println("YesNo");
        if(isUnique(input.replaceAll("\\s", ""))==true){
            System.out.println("Yes");
        }else{
             System.out.println("No");
        }
      
    }
    
    public static boolean isUnique(String input){
        
        char c[]=input.toCharArray();
        Arrays.sort(c);
            for(int j=0;j<c.length-1;j++){
                if(input.charAt(j)==input.charAt(j+1)){
                    return false;
                }
            }
        
        return true;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
      
	  
		//System.out.println("YesNo");
        if(isUnique(input.replaceAll("\\s", ""))==true){
            System.out.println("Yes");
        }else{
             System.out.println("No");
        }
      
    }
    
    public static boolean isUnique(String input){
        
        if(input.length()>256)
        return false;
        
        
        boolean c[]=new boolean[256];
        Arrays.fill(c,false);
        
        
        for(int i=0;i<input.length();i++){
            int in=(int)input.charAt(i);
            
            if(c[in]==true)
            return false;
            
            
            
            c[in]=true;
        }
        return true;
    }
}

///////////////////////////////////////////////////////////////////////////////

