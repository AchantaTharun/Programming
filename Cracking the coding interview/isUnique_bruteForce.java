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


