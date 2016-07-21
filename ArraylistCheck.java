import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Treselle
 *
 */
public class ArraylistCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<50;i++){
			
			list.add(i);
			
		}
		System.out.println(list);
		for(Integer i:list){
			
			System.out.println(i);
		}
	}

}
