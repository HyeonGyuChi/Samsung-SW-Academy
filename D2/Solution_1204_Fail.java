package D2;
/*1204. [S/W �����ذ� �⺻] 1���� - �ֺ�� ���ϱ�
https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh
���� : caseNum�� 2���� ���� :  system.in �ϸ鼭 '\n' '\r' ���� �о�ͼ� �׷��� ������ �ذ�ȵ� �Ф� 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1204_Fail {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		int caseNum = input.nextInt(); // caseȽ�� �Է�
		int caseIndex = 0; // ���̽� �ε���
		byte mostValue = 0;
		short[] temp;
		
		for(int i = 0; i < caseNum; i++) {
	
			caseIndex = input.nextInt(); // ���̽� �ε���
			temp = countScore(); // 0~100���̿� �ִ� �������� ������ ����
			//printArray(temp);
			mostValue = findMost(temp);
			
			System.out.println("#" + caseIndex + " " + mostValue);
		}
		
		

	}

	private static short[] countScore() throws Exception{
		
		InputStreamReader reader = new InputStreamReader(System.in); // ����Ʈ��Ʈ���� > ���ڷ� �б�
		BufferedReader br = new BufferedReader(reader); // > ���� �����б�

		int readChar; // �ѱ��ھ� �о�� char
		String bufferStr = ""; // ���ڷ� ��ȯ�ϱ� ���� ���������� �Ͼ�� ���ڸ� ������ string
		int score; // �Է¹��� ����

		short count[] = new short[101]; // 0~100 ������ ������ ������ ���� �迭
		Arrays.fill(count, (short) 0); // count�迭�� ��� ���ҵ��� 0���� �ʱ�ȭ

	

		while ((readChar = br.read()) != '\r') { // ���ڸ� �ϳ��� �о����

			if (readChar == ' ' ) { // ������ ���
				score = Integer.parseInt(bufferStr); // ���������� �̾���� ���ڿ��� int������ ����ȯ
				count[score]++; // score�� ������ ����(index == score)
				bufferStr = ""; // ���ο� ���ڸ� �ޱ����� �ʱ�ȭ
				continue;
			}
			/*
			else if(readChar == '\n') {
				System.out.println(bufferStr + " ��ȯ�Ϸ�");
				score = Integer.parseInt(bufferStr); // ���������� �̾���� ���ڿ��� int������ ����ȯ
				count[score]++; // score�� ������ ����(index == score)
				break;
				
			}
			
			*/

			else if(readChar == '\n') {
				break;
			}
			
			else { // ���������� ���ڸ� �ϳ��� �о string���� ��ȯ �� �̾�ٿ� ���ڿ������
				// bufferStr = bufferStr.concat(Character.toString((char)readChar)); //concat�� ��� ���� �ּҰ��� ����
				bufferStr += Character.toString((char) readChar); // +�� ��� ���������� StringBuilder�� ����Ͽ� ���ο� ��ü�� ����� �ٸ� �ּҰ��� ����
				}

			}
	/*
		br.close();
		reader.close();
		fis.close();
		fos.close();
		writer.close();
		*/
		
		return count; //������ �迭 return
	}
/*	
	private static void deleteEnter(File inFile) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(inFile));
		OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream("C:/Users/HyeonGyu/Downloads/output.txt"));
		
		int readChar; 
		int i = 0;
		
		while ((readChar = isr.read()) != -1){
			if(readChar == '\n') {
				System.out.println("����" + (i++));
				readChar = '@';
			}
			
			isw.write(readChar);
		}
	}
*/
	private static byte findMost(short[] count) { 
		byte mostValue = 0; //���� ������ ���� ��
		short maxCount = 0; //count�� ���� ū ��
		byte index = 0; //count�� index�� 0���� ������ �����̸鼭 ���� ū ���� ã��
		
		for(short i : count) {
			if(i >= maxCount) {
				mostValue = index;
				maxCount = i;
			}
			
			index++;
		}
		
		return mostValue;
	}

/*
	public static void printArray(short[] array) {
		byte index = 0;
		
		for(int i : array) {
			System.out.printf("%d : %d\n", index++, i);
		}
		
		
	} */
}
//22,621kb / 65ms
/*
 * import java.io.BufferedReader; import java.io.InputStreamReader;
 * 
 * class Solution { public static void main(String args[]) throws Exception {
 * new Solution().run(); }
 * 
 * public void run() throws Exception { BufferedReader bReader = new
 * BufferedReader(new InputStreamReader(System.in));
 * 
 * int tCase = Integer.parseInt(bReader.readLine()); for (int i = 0; i < tCase;
 * i++) { int sum = 0, avg; String[] input; input =
 * bReader.readLine().split(" ");
 * 
 * for (String value : input) { int v = Integer.parseInt(value); sum += v; }
 * 
 * avg = (sum%10 > 4)? sum/10+1:sum/10;
 * 
 * System.out.println("#" + (i + 1) + " " + avg); } } }
 */
