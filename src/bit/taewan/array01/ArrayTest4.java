package bit.taewan.array01;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		int result = 0;
		
		for(int i = 0 ; i < intArray.length; i++){
			System.out.println(i+":"+intArray[i]);
			result = result + intArray[i];
		}
		System.out.println("result "+ result);
		
		// 확장 for
		result = 0;
		for( int value : intArray ){
			System.out.println(value);
			result = result + value;
		}
		System.out.println("result "+result);
	}

}
