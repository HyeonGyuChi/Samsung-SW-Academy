package D1;
/*2071. ��հ� ���ϱ�(D1)
https://www.swexpertacademy.com/main/code/problem/problemDetail.do
21,056kb / 152ms / 625
*/
import java.util.Scanner;

public class Solution_2071 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tc; // test case ����
		int index; // test index
		double avg = 0; // ���
		int num;
		int sum = 0; //��
		
	

//�Է�
		tc = input.nextInt(); // tc�Է�
		index = 1;
//ó��
		while (index <= tc) { //�Է��� tc ȸ����ŭ�� loop
			for(int i = 0; i<10; i++) { //10���� ���� �Է�
				num = input.nextInt();
				sum += num; //�Է��� �������� ��
			}
			
			avg = sum / 10.0; //��հ�
//���		
			
			System.out.printf("#%d %.1f\n", index, avg); //�Ҽ��� 1�����ڸ����� �ݿø�
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

