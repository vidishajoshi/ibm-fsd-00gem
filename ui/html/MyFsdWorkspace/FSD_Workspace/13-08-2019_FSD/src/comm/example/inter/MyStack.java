package comm.example.inter;

public class MyStack {

	 private char arr[];
	 //private int top=-1;
	private static int to;
	 public MyStack() {
		 
	 }
	 
	 public void pushArr(char c,int top) {
		if(top == -1) {
			top+=top;
		 arr[top]=c;
		}
	 }
	 
	 public char[] popArr(int top) {
		 if(top!=-1) {
			 arr[top]=(Character) null;
			 top-=top;
			 return arr;
		 }else {
			 return arr;
		 }
	 }
}
