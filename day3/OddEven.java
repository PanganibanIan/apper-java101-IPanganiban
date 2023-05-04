class OddEven {
    public static void main(String[] args) {
        System.out.println("Odd Even Counter");
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};

        int ctrEven = 0, ctrOdd = 0;

        for (int ctr =0; ctr<nums.length; ctr++) {
            if (checkOddEven(nums[ctr]) == "Even"){
                ctrEven++;
            } else {
                ctrOdd++;
            }
        }

        System.out.println("Odd: " + ctrOdd);
        System.out.println("Even: " + ctrEven);
    }
    public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
