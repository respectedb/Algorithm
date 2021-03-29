package jungol_beginner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack {
	static int N;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader("src/jungol_beginner/stack.txt"));
		N = Integer.parseInt(br.readLine().trim());
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String command = st.nextToken();
//			System.out.println(command);
			switch (command) {
			case "i":
				int num = Integer.parseInt(st.nextToken());
//				System.out.println(num);
				stack.push(num);
				break;
			case "o":
				if(stack.empty()) {
					System.out.println("empty");
				}else {
					int popNum = stack.pop();
					System.out.println(popNum);
				}	
				break;
			default:
				System.out.println(stack.size());
				break;
			}
		}
		
	}
}
