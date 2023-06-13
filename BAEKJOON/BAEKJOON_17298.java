package Baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;


public class BAEKJOON_17298 {
	
public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Stack<Integer> stack = new Stack<Integer>();
			
			int N = Integer.parseInt(br.readLine());
			int[] nge = new int[N];
			
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				nge[i] = Integer.parseInt(st.nextToken());
			}
	 
	 
			for(int i = 0; i < N; i++) {
				
				while(!stack.isEmpty() && nge[stack.peek()] < nge[i]) {
					nge[stack.pop()] = nge[i];
				}
				
				stack.push(i);
			}
			
			while(!stack.isEmpty()) {
				nge[stack.pop()] = -1;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < N; i++) {
				sb.append(nge[i]).append(' ');
			}
			
			System.out.println(sb);
		}
	}