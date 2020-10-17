package ProjectEuler;

import java.math.BigInteger;

/*
 *21000의 각 자릿수를 모두 더하면?
Problem 16
[ProjectEuler.net 원본]
출제 일시 : 2012-01-03 19:11:35

2^15 = 32768 의 각 자릿수를 더하면 3 + 2 + 7 + 6 + 8 = 26 입니다.

2^1000의 각 자릿수를 모두 더하면 얼마입니까?
 *
 */

public class Problem16 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		// 약 300 자리의 숫자이기 때문에 BigInteger클래스를 이용해서 값을 구한다.
		
		BigInteger a = new BigInteger("2");
		BigInteger b = a.pow(1000);
		BigInteger c = BigInteger.TEN;  
		BigInteger sum = BigInteger.ZERO;
		
		while (true) { 
			if (b.compareTo(c) < 0) {
				sum = sum.add(b);
				break;
			}
			sum = sum.add(b.mod(c));
			b = b.divide(c);
			
		}
		
		System.out.println(sum);
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("ms >>> " + (end - start));
	}

}
