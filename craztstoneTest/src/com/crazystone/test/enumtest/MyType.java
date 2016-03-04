package com.crazystone.test.enumtest;

public enum MyType {

	FIRST(3) {
		@Override
		int getMyNumber(int num) {
			
			return num+3;
		}

	},
	SECOND(4) {
		@Override
		int getMyNumber(int num) {
			return num+4;
		}
	},
	THIRD {
		@Override
		int getMyNumber(int num) {
			return 0;
		}
	};
	
	int number;
	
	abstract int getMyNumber(int num);
	
	 MyType(int num){
		this.number=num;
	};
	
	MyType(){
		
	}

	
	
	public static void test(){
		System.out.println("test");
	}
	
}
