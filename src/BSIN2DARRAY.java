import java.util.Arrays;
public class BSIN2DARRAY {


        public static void main(String[] args) {
            int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}};
            BSIN2DARRAY b=new BSIN2DARRAY();
            System.out.println(Arrays.toString(BS(arr,38)));


        }
        public static int[] BS(int [][] arr,int target ){
            int r=0;
            int c=arr.length-1;

            while(r<arr.length && c>=0){
                if(arr[r][c] == target){
                    return new int[]{r,c};
                }
                if(arr[r][c] > target){
                    c--;
                }else{
                    r++;
                }
            }
            return new int[]{-1,-1};
        }
    }

