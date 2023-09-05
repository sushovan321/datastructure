


public class Pallindrome {


    public static void main(String []args){

        System.out.println("Two Pointer Approach To Find If input string is a pallindrom");
        
        System.out.println(isPallindrom("racecar"));
        System.out.println(isPallindrom("test"));

    }


    public static boolean isPallindrom(String input){

        int begin = 0;
        int end  = input.length()-1;

        while(begin < end){
           
            if (input.charAt(begin)!=(input.charAt(end))){
                    return false;
            }

            begin++;
            end--;

        }

            return true;
    }


}