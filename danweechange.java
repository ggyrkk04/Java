/**

 *프로그램 파일이름 또는 간단한 설명

 *학과: 서비스디자인공학과

 *학번:20221069

 *이름:한유

 *이메일: ggyrkk04@naver.com

 *제출일:2024년3월22일

 *제출번호:3주차 번

 *출처:

*/
import java.util.Scanner;
public class danweechange{
    public static void main(String args[]){
    //String line;
    
    
    int KM;
    double MILE;
    Scanner in=new Scanner(System.in);
    
    System.out.print("정수로 km 입력해보세요: ");
    KM=in.nextInt();
    MILE=KM*0.6214;
    System.out.println("당신이 입력한 것을 마일로 바꾼 것은:"+MILE);
    
    
    }





}

