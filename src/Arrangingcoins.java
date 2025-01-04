/*leetcode question number 441 (easy)*/
public class Arrangingcoins {
    public static void main(String[] args) {
            Arrangingcoins a=new Arrangingcoins();
            int ans=a.arrangeCoins(6);
        System.out.println(ans);
    }
    public int arrangeCoins(int n) {
                int start=0;
                int end=n;

                while(start<=end){
                    int k=start+(end-start)/2;//here k is the middle element..
                    long coinsneeded=(long)k*(k+1)/2;

                    if(coinsneeded>n){
                        end=k-1;
                    }if(coinsneeded<n){
                        start=k+1;
                    }if(coinsneeded==n){
                        return k;
                    }


                }
                return end;
            }

    }

