package D1;
/*2071. 평균값 구하기(D1)
https://www.swexpertacademy.com/main/code/problem/problemDetail.do
21,056kb / 152ms / 625
*/
import java.util.Scanner;

public class Solution_2071 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tc; // test case 개수
		int index; // test index
		double avg = 0; // 평균
		int num;
		int sum = 0; //합
		
	

//입력
		tc = input.nextInt(); // tc입력
		index = 1;
//처리
		while (index <= tc) { //입력한 tc 회수만큼만 loop
			for(int i = 0; i<10; i++) { //10개의 정수 입력
				num = input.nextInt();
				sum += num; //입력한 정수들의 합
			}
			
			avg = sum / 10.0; //평균값
//출력		
			
			System.out.printf("#%d %.1f\n", index, avg); //소수점 1번쨰자리에서 반올림
			sum = 0;
			index++;
		}
	}
}
		

//22,621kb / 65ms
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Solution {
    public static void main(String args[]) throws Exception {
        new Solution().run();
    }
 
    public void run() throws Exception {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
 
        int tCase = Integer.parseInt(bReader.readLine());
        for (int i = 0; i < tCase; i++) {
            int sum = 0, avg;
            String[] input;
            input = bReader.readLine().split(" ");
 
            for (String value : input) {
                int v = Integer.parseInt(value);
                sum += v;
            }
             
            avg = (sum%10 > 4)? sum/10+1:sum/10;
             
            System.out.println("#" + (i + 1) + " " + avg);
        }
    }
}
*/

