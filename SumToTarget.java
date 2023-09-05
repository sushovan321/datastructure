public class SumToTarget {


    public static void main(String[] args){

        System.out.println("Solve Sum of Numbers equals target using A sorted Array and 2 pointer method");
            int [] input = {1,3,4,7,16,21,36};
            FindSumToTarget(input,23);
    }


    public static void FindSumToTarget(int[] input,int target){

        int begin = 0;
        int end = input.length-1;

        while(begin < end){
            int sum = input[begin]+input[end];

            if( sum == target){
                System.out.println("Target Found : "+ input[begin]+" and "+ input[end]);
                begin=end;
            }
            else if(sum >target){

                    //smallest + bigest no > target
                    // so discard bigest

                    end --;

            }else{

                 //smallest + bigest no < target
                    // so discard samllest

                    begin ++;
            }

        }



    }



    
}
