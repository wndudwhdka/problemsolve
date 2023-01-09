//import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2865 { 
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 //     Scanner sc = new Scanner(System.in);
        
        
        //한줄에 한 데이터만 입력받기 
//        int A = Integer.parseInt(br.nextToken());
//        int B = Integer.parseInt(br.nextToken());
//        int C = Integer.parseInt(br.nextToken());
        
        
        //BufferedReader로 한줄에 여러개 공백을 두고 입력받기 
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        
        int total = (C-A)/(A-B);
        total++; 
        if((C-A)%(A-B)!=0) total++;
        System.out.println(total); 
//        2, 1, 5  = 4
//        5, 1, 6  = 2
        
//        sc.close();
        br.close();
       
    }



}	