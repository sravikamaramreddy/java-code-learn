public class Average{
    public static int sumAverage(int[][]  array){
        int total=0;
        for(int[] subArray:array){
            int sum=0;
            for(int number:subArray){
                sum=sum+number;
            }
            total=total+sum/subArray.length;
            }
            return total;
        }
        public static void main(String[] args){
            int[][] input = {
                {3, 4, 1, 3, 5, 1, 4},
                {21, 54, 33, 21, 77}
            };
    
            int result = sumAverage(input);
            System.out.println(result); 
        }
    }

