package practice;

public class practice5 {
	public static void main(String[] args) {
		/*
		 * 돈이 10000원 있고 사과 한 개에 1000원 이라고 할때
		 * 1. 최대 구매 가능 갯수
		 * 2. 사과 3개의 가격
		 * 3. 사과 5개를 사고 남는 금액
		 * 4. 사과 5개를 사고 쌓이는 적립금 (구매금액의 1% 라고 가정)
		 * 
		 * */
		
		System.out.println(10000/1000);
		System.out.println(1000 * 3);
		System.out.println(10000 - (1000 * 5));
		System.out.println((1000 * 5) * 0.01);
		
		// 변수를 활용해서 표현
		int money = 10000;
		int apple = 1000;
		System.out.println(money / apple);
		System.out.println(apple * 3);
		System.out.println(money - (apple * 5));
		System.out.println(apple * 5 * 0.01);
		
		
		/*
		 * 기본 데이터 타입 (기본형, Primitive Type)
		 * 메모리에 효율적인 사용을 위해 사이즈별로 나누어 놓음
		 * - 자바에서 기본적으로 사용하는 데이터 타입은 8가지
		 * 
		 * 			1Byte	2Byte	4Byte	8Byte
		 * 		   =8bit
		 * --------------------------------------------
		 * 1. 정수형:	byte	short	int		long
		 * 2. 실수형:					float	double
		 * 3. 문자형:			char
		 * 4. 논리형:	boolean
		 * --------------------------------------------
		 * 
		 * 정수형 데이터타입 변수에 저장 가능한 정수 범위: -2^(n-1) ~ 2^(n-1)-1
		 * byte타입: -2^7 ~ 2^7-1 = -128 ~ 127 까지 표현 가능
		 * short타입: -2^15 ~ 2^15-1 = -32768 ~ 32767 까지 표현 가능
		 * int타입: -2^31 ~ 2^31-1 = -2147483648 ~ 2147483647 까지 표현 가능
		 * long타입: -2^63 ~ 2^63-1 = -922경 ~ 922경 까지 표현 가능
		 * --------------------------------------------
		 * float타입(4byte): 약 ± 10^38 까지 표현가능 (long타입 보다 큰 정수도 표현 가능)
		 * double타입(8byte): 약 ± 10^308 까지 표현가능
		 * => 결론! 실수형 데이터타입은 정수형 데이터타입보다 큰 타입으로 취급됨!
		 * 
		 * */
		
		byte b = 127;
		System.out.println(b);
		
//		b = 128;	// 오류 발생! byte 타입은 -128 ~ 127 까지 표현 가능하기 때문
		
		short s = 128;
		System.out.println(s);
		
//		s = 32768;	// 오류 발생! short 타입 변수에는 -32768 ~ 32767 까지의 정수만 저장 가능
		
		int i = 32768;
		System.out.println(i);
		
//		i = 2147483648;	// 오류 발생! int형 범위를 벗어남
		
//		long l = 2147483648;
		// 정수 리터럴에 접미사가 없을 경우 int로 취급됨!
		// 따라서, 접미사 L을 붙여서 long타입을 사용해야한다!
		
		long l = 2147483648L;
		System.out.println(l);
		
		l = 100L;
//		i = 100L; // 접미사 L이 붙으면 int타입으로 저장가능한 숫자더라도 저장불가!
		
		float f = 3.14F;	// float 타입은 접미사 f 또는 F를 붙여줘야함!
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
		char c = 'A' + 1;
//		c = 'AB';	// 오류! char타입은 "무조건" 1개의 문자만 사용가능!
//		c = '';		// 오류! char타입은 "무조건" 1개의 문자만 사용가능!
		
		System.out.println(c);
		
		boolean bool = true;		// 다른언어에서는 1을 true로 판단하는 경우가 있음
		System.out.println(bool);
		bool = false;				// 다른언어에서는 0을 false로 판단하는 경우가 있음
		System.out.println(bool);
		
		
		
	}
}
