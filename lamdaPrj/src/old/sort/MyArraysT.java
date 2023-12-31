package old.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysT  {
	 
	 
	
	//정렬하기
	public static <T extends Comparable<T> > void sort(T[] arr) {			
		for( int i=0;i< arr.length-1; i++) {
			for( int j=i+1; j< arr.length ;j++) {		
			 
				if( arr[i].compareTo(arr[j]) >0) {
					T temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;		
					
				}
			 
			}
		}
		
	}
	
	
	//정렬하기
	public static<T> void sort(T[] arr , Comparator<T>  c) {
		
		for( int i=0;i< arr.length-1; i++) {
			for( int j=i+1; j< arr.length ;j++) {		
			 
				if( c.compare(arr[i], arr[j]) >0) {
					T temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;					
				}
			 
			}
		} 
	}
	
	
	///
	 public static void main(String[] args) {
		 
		 	Student[] arrs = new Student[3];
			
		    Student a = new Student("하길동", "하남시");
	        Student b = new Student("나길동", "강원도");
	        Student c = new Student("가길동", "제주도");
	        
	        
	        arrs[0]= a;
	        arrs[1]=b;
	        arrs[2]=c;
	        
	        
	        MyArraysT.sort(arrs);
	        
	        //정렬후 //
	        System.out.println( Arrays.toString(arrs));
	        
	        MyArraysT.sort( arrs , new Comparator<>() {

				@Override
				public int compare(Student o1, Student o2) {					
					return o1.address.compareTo(o2.name);
				}
	        	
	        });
	        
	        //정렬후 
	        System.out.println( Arrays.toString(arrs));
		 
		
	}

}
