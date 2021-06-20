package ADS;

import java.util.*;

class Stack {
	int top;
	int a[];
	int size;

	public Stack(int size) {
		top = -1;
		a = new int[size];
		this.size = size;
	}

	public Stack() {
		
	}

	boolean isEmpty()
	{
		return top==-1;
	}

	public int push(int data) {
		if (top == size - 1) {
			System.out.println("Stack is Full");
			return 0;
		} else
			return a[++top] = data;
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack is Empty");
			return 0;
		} else
			return a[top--];
	}

	public void display() {
		
		System.out.println("------Stack is----------");
		for (int i = 0; i <= top; i++) {
			System.out.println(a[i] + " ");
		}
	}
}

class StackOperatation {
	public static void main(String args[]) {
		Stack stk = new Stack(5);
		stk.push(1203);
		stk.push(1233);
		stk.push(1243); 
		stk.push(23); 
		stk.push(123);
		stk.display();
		//System.out.println("************");
		stk.pop();
		stk.display();
		
	}
}
