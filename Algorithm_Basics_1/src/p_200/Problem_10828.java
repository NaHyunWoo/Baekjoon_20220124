package p_200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Problem_10828 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 0;
        LinkedList<String> list = new LinkedList<>();
        for(int i=0; i<n; i++) {
            String bl = br.readLine();
            if(bl.contains("push")) {
                list.add(bl.replace("push ", ""));
            } else if (bl.contains("pop")) {
                if(list.size() == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(list.getLast());
                    list.removeLast();
                }
            } else if (bl.contains("size")) {
                System.out.println(list.size());
            } else if(bl.contains("empty")) {
                System.out.println(list.size() == 0 ? 1 : 0);
            } else if(bl.contains("top")){
                System.out.println(list.size() == 0 ? -1 : list.getLast());
            }
        }

    }
}
