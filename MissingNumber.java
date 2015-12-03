package nyc.c4q.madelyntav;
/**
 * Created by c4q-madelyntavarez on 12/1/15.
 */
public class MissingNumber
{

    public static int missingNumberInArray(int [] array){
        int [] newArray=new int[array.length+2];

        for(int i: array){
            newArray[i]=i;
        }

       return findMissingNum(newArray);
    }
    /* What if the array has a 0? You are right that it is O(n)*/

    public static int findMissingNum(int [] numbers){
        int missingNum =-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                missingNum=i;
            }
        }
        return missingNum;
    }

    public static void main(String[] args)
    {
        int [] myArray={10,6,7,5,3,2,4,8,9};
        System.out.println(missingNumberInArray(myArray));

    }
}
