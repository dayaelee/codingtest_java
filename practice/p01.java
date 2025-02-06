import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input= {1, -5, 2, 4, 3};
        int[] copyInput= input.clone();
        Arrays.sort(input); // 해당 메서드는 배열을 오름차순으로 정렬함
        System.out.println(Arrays.toString(copyInput));
        System.out.println(Arrays.toString(input));
    }
}