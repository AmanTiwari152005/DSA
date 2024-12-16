/* leetcode question number 744 from arrays (easy) */
import java.util.Scanner;
public class Leetcodeq {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char [] letters=new char[4];
        System.out.println("Enter the elements of an array");
        for(int i=0;i< letters.length;i++){
            letters[i]=sc.next().charAt(0);
        }
        System.out.println("Enter target element:");
        char target=sc.next().charAt(0);

        int ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char [] letters , char target){


        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target < letters[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
