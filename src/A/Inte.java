package A;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inte {
     public static void main(String[] args) {
    	 String str = "deeepaak";
    	 char[] arr=str.toCharArray();
    	 int count=0;
    	 Map<Character, Integer> map=new HashMap<>();
    	 for(char ch:arr) {
    		 map.put(ch, map.getOrDefault(ch,0)+1);
    		 count++;
    	 }
    	 int index=0;
    	 int check[]=new int[count];
    	 for(Map.Entry<Character, Integer> re:map.entrySet()) {
    		 check[index++]=re.getValue();
    	 }
    	 int max=check[0];
    	 for(int n:check) {
    		 if(max<n) {
    			 max=n;
    		 }
    	 }
    	 for(Map.Entry<Character, Integer> result:map.entrySet()) {
    		 if(result.getValue()==max) {
    			 System.out.println("OutPut is : "+result.getKey());
    		 }
    	 } 
	}
}
