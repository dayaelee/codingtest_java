import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5}; // => 1
        int[] two = {2,1,2,3,2,4,2,5};// =>2
        int[] thr = {3,3,1,1,2,2,4,4,5,5};//=>1

        ArrayList<Integer> a = new ArrayList<>();

        int o=0;
        int t=0;
        int r=0;

        for(int i = 0; i<answers.length; i++){
            int originI=i;
            int custumO = i%5;
            if(one[custumO]==answers[i]){
                o+=1;
            }
            int custumT = i%8;
            if(two[custumT]==answers[i]){
                t+=1;
            }
            int custumR = i%10;
            if(thr[custumR]==answers[i]){
                r+=1;
            }
        }
        a.add(o);
        a.add(t);
        a.add(r);

        int maxx=0;

        for(int num: a) maxx = Math.max(num, maxx);
        int resultSize=0;

        for(int i=0; i<3; i++){
            if (a.get(i)==maxx){
                resultSize+=1;
            }
        }

        ArrayList<Integer> rr = new ArrayList<>();

        for(int i=0; i<3; i++){
            if (a.get(i)==maxx){
                rr.add(i+1);
            }
        }

        int[] answer = rr.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);
        return answer;
    }
}