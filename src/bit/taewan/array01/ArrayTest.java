package bit.taewan.array01;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = new int[5];
		
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
		int sum = 0;
		int size = scores.length;
		
		System.out.println("size:" + size);
		for( int i = 0 ; i < 5; i++){
			sum = sum + scores[i];
		}
		
		System.out.println("sum:" + sum);
		
	}

}
