import java.util.Scanner;

public class _1_lucky_wheel {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void solution(int N, int K) {
		char[] answer = new char[N];
		for(int i=0; i<N; i++) {
			answer[i] = '?';
		}
		int pointer = 0;
		for(int i=0; i<K; i++) {
			int S = sc.nextInt();
			char C = sc.next().charAt(0);
			pointer = (pointer+N-S)%N;
			for(int j=0; j<N; j++) {
				if(answer[j]==C) {
					System.out.println("!");
					System.exit(1);
				}
			}//같은 알파벳이 서로 다른 자리에 두번 나오는 경우 문제 오류로 인식 후 강제 종료
			if(answer[pointer]==C)
				continue; //같은 정보가 중복돼서 나온 경우
			else if(answer[pointer]=='?')
				answer[pointer] = C; //아무 입력값이 없는 초기 경우
			else {
				System.out.println("!");
				System.exit(1);
			} //포인터가 가르키는 위치에 이미 다른 알파벳이 들어있는 경우 문제 오류로 인식 후 강제 종료
			
		}
		for(int k=0; k<N; k++) {
			System.out.print(answer[pointer%N]);
			pointer++;
		
		}
	}
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		solution(N,K);
	}

}
