package p_200;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++) {
            char[] arr = br.readLine().toCharArray();
            int a = 0;
            for(int j=0; j<arr.length; j++) {

                if(arr[j] == '(') {
                    a++;
                } else {
                    a--;
                    if(a < 0) {
                        break;
                    }
                }
            }
            System.out.println(a == 0 ? "YES" : "NO");
        }

    }
}
