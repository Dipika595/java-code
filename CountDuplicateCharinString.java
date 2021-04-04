package javaPact;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char c:arr){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
			
		}
		Set<Character> set=map.keySet();
		
		for(char ch:set){
			if(map.get(ch)>1){
				System.out.println(ch +":"+map.get(ch));
			}
		}

	}

}
