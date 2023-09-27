package java2prj1.lamda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class MovingList {

	public static void main(String[] args) {
		 
		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원","구룡포",100));
		list.add(new Moving("이미현","경기",80));
		list.add(new Moving("김두식","문산",90));
		list.add(new Moving("전영석","봉평",88));
		
		//이름순으로 정렬		
		Collections.sort(list);		
		list.forEach( m -> System.out.println( m));
		
		System.out.println( "======>");
		list.forEach( new Consumer<>() {
			@Override
			public void accept(Moving t) {
				 
				System.out.println( t);
		 }});
		
		System.out.println( "======>");
		class ConsumerImp implements Consumer<Moving>{
			@Override
			public void accept(Moving t) {
				 System.out.println( t);				
			}			
		}		
		System.out.println( "======>");
		list.forEach( new ConsumerImp());		
		
		//암호순 정렬		
		//파워순 정렬
				
		Collections.sort( list,  ( o1, o2)-> o1.code.compareTo(o2.code));		
		Collections.sort( list, ( o1, o2) -> o1.power- o2.power);
		
		

	}

}
