package D2;
/*1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh
22,028kb / 141ms / 1,321
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1204 {

	public static void main(String[] args) throws Exception {
		// 선언부 : for문을 돌아도 초기화되지않음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte testCase; // 테스트케이스 횟수
		byte caseNum = 0; // 케이스 번호
		

		testCase = Byte.parseByte(br.readLine()); // 첫줄 == 테스트케이스 개수

		for (int i = 0; i < testCase; i++) { // 입력한 데스트케이스 만큼 반복
			caseNum = Byte.parseByte(br.readLine()); // 다음줄 == 케이스 번호
			short[] scoreCount = new short[101]; // 0~100 사이의 점수들의 개수 //선언부에 사용하지 않은이유 : for문 돌때마다 초기화
			short max = 0; // 가장 많은 점수의 개수
			byte answer = 0; // 가장많은 점수
			byte score; // 점수
			
			// 점수들의 개수파악
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int k = 0; k < 1000; k++) { // 1000개의 점수입력
				score = Byte.parseByte(st.nextToken());
				scoreCount[score]++; // index의 개수를 1 증가
			}
			score = 0;

			// 가장많은 개수찾기
			for (int j = 0; j < scoreCount.length; j++) {
				if (scoreCount[j] >= max) {
					max = scoreCount[j];
					answer = (byte) j;
				}
			}

			// 출력
			System.out.printf("#%d %d\n", caseNum, answer);

		}
	}

}

//19,236 kb / 139ms
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        StringTokenizer st = new StringTokenizer(br.readLine());
         
        int T = Integer.parseInt(st.nextToken());
         
        for(int test = 1 ; test <= T ; test++) {
            st = new StringTokenizer(br.readLine());
             
            int N = Integer.parseInt(st.nextToken());
            int max = 0;
            int aa = 0;
             
            st = new StringTokenizer(br.readLine());
             
            int M[] = new int[101];
             
            for(int i = 1 ; i <= 1000 ; i++) {
                int arr = Integer.parseInt(st.nextToken());
                M[arr] ++;
            }
             
            for(int i = 0 ; i<=100 ; i++) {
                if(max <= M[i]) {
                    max = M[i];
                    aa = i;
                }
            }
            System.out.println("#" + test + " " + aa);
        }
    }
}
*/