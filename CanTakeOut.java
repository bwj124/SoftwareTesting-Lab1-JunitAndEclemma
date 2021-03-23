package com.bwj.example;

public class CanTakeOut {
	final int numOf50 = 1;
	final int numOf20 = 1;
	final int numOf10 = 1;
	final int numOf5 = 2;
	final int numOf1 = 3;
	
	int remain50;
	int remain20;
	int remain10;
	int remain5;
	int remain1;
	
	int x;
	
	public CanTakeOut() {
		reset();
	}

	private boolean canTakeOut(int x) {
		if (x >= 50 && remain50 > 0) {
			x -= 50;
			remain50 --;
			if (x == 0) {
				return true;
			}
		}
		
		if (x >= 20 && remain20 > 0) {
			x -= 20;
			remain20 --;
			if (x == 0) {
				return true;
			}
		}
		
		if (x >= 10 && remain10 > 0) {
			x -= 10;
			remain10 --;
			if (x == 0) {
				return true;
			}
		}
		
		if (x >= 5 && remain5 > 0) {
			x -= 5;
			remain5 --;
			if (x == 0) {
				return true;
			}
		}
		if (x >= 5) {
			if (remain1 > 0 || remain10 > 0 || remain20 > 0 || remain5 > 0 || remain50 > 0) {
				canTakeOut(x);
			}
		}else if (x > remain1) {
			return false;
		}else {
			return true;
		}
		
		
		return false;
	}
	
	public boolean getResult(int a) {
		this.x = a;
		int maxValue = 50 * numOf50 + 20 * numOf20 + 10 * numOf10 + 5 * numOf5 + numOf1;
		int minValue = 0;
		if (x > maxValue || x < minValue) {
			return false;
		}
		boolean tmp = canTakeOut(this.x);
		reset();
		return tmp;
	}
	
	public void reset() {
		this.remain50 = this.numOf50;
		this.remain20 = this.numOf20;
		this.remain10 = this.numOf10;
		this.remain5 = this.numOf5;
		this.remain1 = this.numOf1;
	}
}
