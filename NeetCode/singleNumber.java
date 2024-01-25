package NeetCode;

public class singleNumber {
    public static void number(){
        int[] nums = {4,1,2,1,2};
        int temp = 0;
        int result = 0;

        for(int i=0;i< nums.length;i++){
            
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[i] == nums[j]){
                    temp = nums[i];
                    count = count + 1;
                }
            }
            if (count==1){
               result=temp;
               break;
            }
        }
        System.out.println(result);

        }
    public static void main(String[] args) {
        number();
    }
}
