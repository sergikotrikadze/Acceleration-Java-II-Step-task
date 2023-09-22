import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        singleNumber(new int[]{1,2,1,2,3,3,4,5,5,-1});

    }


    //1. გვაქვს მთელი რიცხვების ჩამონათვალი სადაც ერთის გარდა ყველა რიცხვი მეორდება, იპოვეთ
    //ის რიცხვი რომელიც არ მეორდება.int singleNumber(int[] nums)

    //ეს ასევე მუშაობს თუ ბევრია ისეთი რომელიც არ მეორდება
    public static void singleNumber(int nums[]) {
        boolean chk;
        for (int i = 0; i < nums.length; i++) {
            chk = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    chk = true;
                    break;
                }
            }
            if (!chk) System.out.print(nums[i]+" ");
        }

    }


    //2. გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა
    //(თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა
    //დავახურდაოთ.

    public static int minSplit(int coins) {
        int fiftyRemainder = coins % 50;
        int counter = coins / 50;

        int twentyRemainder = fiftyRemainder % 20;
        counter += fiftyRemainder / 20;

        int tenRemainder = twentyRemainder % 10;
        counter += twentyRemainder / 10;

        int fiveRemainder = tenRemainder % 5;
        counter += tenRemainder / 5;

        int oneRemainder = fiveRemainder % 1;
        counter += fiveRemainder / 1;

        return counter;

    }

    //3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც
    //გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში
    //არ შედის.
    public static int notContains(int[] arr) {
        int integers = 1;

        for (int i = 0; ; i++) {
            if (arr[i] > 0 && arr[i] != integers) {
                return integers;
            } else if (arr[i] <= 0) {
                continue;
            } else {
                integers++;
            }
        }
    }

    //4.მოცემულია ორი binary string a და b, დააბრუნეთ მათი ჯამი, როგორც binary string.
    //მაგ: a = "1010"; b = "1011"; , მათი ჯამი იქნება "10101"

    public static String binaryAdder(String a, String b) {


        int a1 = Integer.parseInt(a, 2);
        int a2 = Integer.parseInt(b, 2);

        int sum = a1 + a2;

        String answer = Integer.toBinaryString(sum);

        return answer;
    }


    //5. გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. დაწერეთ
    //ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static int countVariants(int stairsCount) {
        return fib(stairsCount + 1);
    }
}