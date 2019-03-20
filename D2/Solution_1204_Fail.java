package D2;
/*1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh
실패 : caseNum이 2부터 오류 :  system.in 하면서 '\n' '\r' 까지 읽어와서 그런것 같은데 해결안됨 ㅠㅠ 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1204_Fail {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		int caseNum = input.nextInt(); // case횟수 입력
		int caseIndex = 0; // 케이스 인덱스
		byte mostValue = 0;
		short[] temp;
		
		for(int i = 0; i < caseNum; i++) {
	
			caseIndex = input.nextInt(); // 케이스 인덱스
			temp = countScore(); // 0~100사이에 있는 점수들의 각각의 개수
			//printArray(temp);
			mostValue = findMost(temp);
			
			System.out.println("#" + caseIndex + " " + mostValue);
		}
		
		

	}

	private static short[] countScore() throws Exception{
		
		InputStreamReader reader = new InputStreamReader(System.in); // 바이트스트림을 > 문자로 읽기
		BufferedReader br = new BufferedReader(reader); // > 향상된 문자읽기

		int readChar; // 한글자씩 읽어온 char
		String bufferStr = ""; // 숫자로 변환하기 위해 공백전까지 일어온 문자를 저장한 string
		int score; // 입력받은 점수

		short count[] = new short[101]; // 0~100 까지의 점수의 개수를 담을 배열
		Arrays.fill(count, (short) 0); // count배열의 모든 원소들을 0으로 초기화

	

		while ((readChar = br.read()) != '\r') { // 문자를 하나씩 읽어오기

			if (readChar == ' ' ) { // 공백일 경우
				score = Integer.parseInt(bufferStr); // 공백전까지 이어붙인 문자열을 int형으로 형변환
				count[score]++; // score의 개수를 증가(index == score)
				bufferStr = ""; // 새로운 문자를 받기위해 초기화
				continue;
			}
			/*
			else if(readChar == '\n') {
				System.out.println(bufferStr + " 변환완료");
				score = Integer.parseInt(bufferStr); // 공백전까지 이어붙인 문자열을 int형으로 형변환
				count[score]++; // score의 개수를 증가(index == score)
				break;
				
			}
			
			*/

			else if(readChar == '\n') {
				break;
			}
			
			else { // 공백전까지 문자를 하나씩 읽어서 string으로 변환 후 이어붙여 문자열만들기
				// bufferStr = bufferStr.concat(Character.toString((char)readChar)); //concat의 경우 같은 주소값에 저장
				bufferStr += Character.toString((char) readChar); // +의 경우 내부적으로 StringBuilder를 사용하여 새로운 객체를 만들어 다른 주소값에 저장
				}

			}
	/*
		br.close();
		reader.close();
		fis.close();
		fos.close();
		writer.close();
		*/
		
		return count; //저장한 배열 return
	}
/*	
	private static void deleteEnter(File inFile) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(inFile));
		OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream("C:/Users/HyeonGyu/Downloads/output.txt"));
		
		int readChar; 
		int i = 0;
		
		while ((readChar = isr.read()) != -1){
			if(readChar == '\n') {
				System.out.println("엔터" + (i++));
				readChar = '@';
			}
			
			isw.write(readChar);
		}
	}
*/
	private static byte findMost(short[] count) { 
		byte mostValue = 0; //가장 개수가 많은 값
		short maxCount = 0; //count의 가장 큰 값
		byte index = 0; //count의 index를 0부터 끝까지 움직이면서 가장 큰 값을 찾음
		
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
