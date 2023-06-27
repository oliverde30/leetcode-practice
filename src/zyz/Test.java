package zyz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

        public static void main(String[] args) {
            //Scanner in = new Scanner(System.in);
            //int a = in.nextInt();
            //System.out.println(a);
            int[] a = new int[]{1,2,2,3,4,4};
            List array  = getDups(a);
            System.out.println(array);
        }

        private static List<Integer> getDups(int[] a){
            Set set = new HashSet(a.length);

            List array = new ArrayList<Integer>();
            for(int i=0; i<a.length;i++){
                boolean bool = set.add(a[i]);
                if(!bool){
                    array.add(a[i]);
                }
            }

            return array;
        }

}
