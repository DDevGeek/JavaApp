import java.util.Arrays;

class Finder {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] foundNums = findIndices(nums, 18);
        System.out.println(Arrays.toString(foundNums));
        System.out.println(nums[nums.length - 1] + "numbers");
    }

    public static int[] findIndices(int[] numbers, int target) {
        int[] found = new int[3];
        int a = 0;
        int b = 1;

        for (int num = 0; num < numbers.length - 1; num++) {
            int e = numbers[a] + numbers[b];
            if (e == target) {
                found[0] = a;
                found[1] = b;
            }
            a++;
            b++;
        }

        return found;
    }
}
