package TwoPointers;

public class ReverseString {
    public static void main(String[] args) {
        String str = "manojgowda";
        reverse(str);
    }

    public static void reverse(String str){
        char[] charArray = str.toCharArray();

        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left]  =charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(charArray);
    }
}
