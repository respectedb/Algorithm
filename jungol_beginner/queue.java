package jungol_beginner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue {

	static int N;
	public static void main(String[] args) throws Exception{
//		BufferedReader br  = new BufferedReader(new FileReader("src/jungol_beginner/stack.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine().trim());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
			case "i":
				q.offer(Integer.parseInt(st.nextToken()));
				break;
			case "o":
				if(q.isEmpty()) {
					System.out.println("empty");
				}else {
					System.out.println(q.poll());
				}
				break;
			default:
				System.out.println(q.size());
				break;
			}
		}
	}
}
