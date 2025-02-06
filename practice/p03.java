import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        // 내가 제출한 답 = TreeSet이용
//        TreeSet<Integer> set = new TreeSet<>();
//        for(int i = 0; i<numbers.length-1; i++){
//            for(int j = i+1; j<numbers.length; j++){
//                set.add(numbers[i]+numbers[j]);
//            }
//        }
//        int[] answer = new int[set.size()];
//        for(int i = 0; i<answer.length; i++){
//            answer[i]=set.pollFirst();
//        }
//
//        return answer;
        HashSet<Integer> set = new HashSet<>(); // 중복 제거를 위한 해시셋 생성
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}