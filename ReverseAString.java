public class ReverseAString{
 //Use 2 pointer approach

public static void main(String[] args){

String input = new String("Once Upon A time");
char[] inputArr = input.toCharArray();
reverseTheString(inputArr);


}

public static void reverseTheString(char[] inputArr){

int i = 0;
int j = inputArr.length-1;

while(i < j){

if(inputArr[i] != inputArr[j]){

char temp = inputArr[i];
inputArr[i] = inputArr[j];
inputArr[j] = temp;

}
 i++;
 j--;

 System.out.println("Reveresed value is:"+new String(inputArr));

}



    
}

}


