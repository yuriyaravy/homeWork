package by.IntelSoft.HWHashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RandomNumber {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(10 >hs.size()){
			int randNumb = (int)(Math.random()*100); // we can create object random and then write like this "random.nextInt()"
				hs.add(randNumb);
		}
		System.out.println(hs);
		System.out.println(Collections.max(hs)+ " Maximum");
		System.out.println(Collections.min(hs)+ " Minimym");
		
		Object[] arrayRandNumb = hs.toArray();
		System.out.println(Arrays.toString(arrayRandNumb));
		findMin(arrayRandNumb);
		findMax(arrayRandNumb);
		
	}
	public static int findMin (Object [] array){
			int min = (int)array[0];
		for(int i = 0; i < array.length; i++){
			if(min > (int)array[i]){
				min = (int) array[i];
			}
		}
		System.out.println(min+ " Minimym");
		return min;
	}
	public static int findMax (Object [] array){
			int max = (int)array[0];
		for(int i = 0; i < array.length; i++){
			if(max < (int)array[i]){
				max = (int) array[i];
			}
		}
		System.out.println(max+ " Maximum");
			return max;
	}

}
