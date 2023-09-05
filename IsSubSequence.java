public class IsSubSequence {


    public static void main(String[] args){

        System.out.println("Into Two pointer approach for finding if it is a subsequence");

        String inputOne = "Heo";
        String inputTwo = "Hello";
        int i=0,j=0;
       while(i < inputOne.length() && j <inputTwo.length()){

        if(inputOne.charAt(i)== inputTwo.charAt(j)){

            i++;
        }
             j++;


       }  
       
       if(i==inputOne.length()){
        System.out.println("Inputs are subsequence:"+inputOne+" and "+inputTwo);
       }
    }
    
}
