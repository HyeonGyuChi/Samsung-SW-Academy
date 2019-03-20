package D2;
/*1204. [S/W �����ذ� �⺻] 1���� - �ֺ�� ���ϱ�
https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh
22,028kb / 141ms / 1,321
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1204 {

	public static void main(String[] args) throws Exception {
		// ����� : for���� ���Ƶ� �ʱ�ȭ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte testCase; // �׽�Ʈ���̽� Ƚ��
		byte caseNum = 0; // ���̽� ��ȣ
		

		testCase = Byte.parseByte(br.readLine()); // ù�� == �׽�Ʈ���̽� ����

		for (int i = 0; i < testCase; i++) { // �Է��� ����Ʈ���̽� ��ŭ �ݺ�
			caseNum = Byte.parseByte(br.readLine()); // ������ == ���̽� ��ȣ
			short[] scoreCount = new short[101]; // 0~100 ������ �������� ���� //����ο� ������� �������� : for�� �������� �ʱ�ȭ
			short max = 0; // ���� ���� ������ ����
			byte answer = 0; // ���帹�� ����
			byte score; // ����
			
			// �������� �����ľ�
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int k = 0; k < 1000; k++) { // 1000���� �����Է�
				score = Byte.parseByte(st.nextToken());
				scoreCount[score]++; // index�� ������ 1 ����
			}
			score = 0;

			// ���帹�� ����ã��
			for (int j = 0; j < scoreCount.length; j++) {
				if (scoreCount[j] >= max) {
					max = scoreCount[j];
					answer = (byte) j;
				}
			}

			// ���
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