package nyc.c4q.madelyntav;

/**
 * Created by c4q-MadelynTavarez on 11/29/15.
 * Write ArrayList Methods
 */
public class ArrayList
{
    int[] array;
    int currentIndex=0;

    public ArrayList(){
        this.array=new int[40];
    }
    public ArrayList(int ... args){
        if(args.length>=array.length){
            int [] newArray= new int [args.length*2];
            array=newArray;
        }
        for(int i: args){
            add(i);
        }
    }

    public void add(int n){
        if(currentIndex<array.length){
            array[currentIndex]=n;
            currentIndex++;
        }
        else{
            int [] newArray= new int[currentIndex*2];
            this.array=newArray;
            array[currentIndex]=n;
            currentIndex++;
        }
    }

    public void add(int index, int n){
        if(index<array.length){
            array[index]=n;
            if(index==currentIndex){
                currentIndex++;
            }
        }
        else{
            int[] newArray = new int[index*2];
            for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
                currentIndex=i;
            }
            array=newArray;
            array[index]=n;


        }
    }

    public int remove(int index){
        if(index>currentIndex){
            throw new IndexOutOfBoundsException();
        }
        else
        {
            int num = array[index];
            array[index] = 0;
            return num;
        }
    }

    public int get(int index){
       return array[index];
    }

    public void ensureCapacity(int minCapacity){
        if(array.length<=minCapacity)
        {
            int [] newArray= new int[minCapacity*2];
            for(int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
    }

    public int lastIndexOf(int num){
        int lastIndex=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                lastIndex=i;
            }
            if(lastIndex==-1){
                throwException();
            }
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        return array.length<=0;
    }
    public int size(){
        return array.length;
    }
    public void addAll(int[] newCollection){
        int sum= currentIndex+newCollection.length;
        if(sum>=array.length){
            int [] newArray= new int[sum*2];
            for(int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
        for(int i=0;i<newCollection.length;i++){
            array[currentIndex]=newCollection[i];
            currentIndex++;
        }
    }

    public void addAll(int index, int[] newCollection){
        if(index>=array.length){
            throwException();        }
        else{
            int sum= currentIndex+newCollection.length;
            if(sum>array.length){
                int [] newArray= new int[sum*2];
                for(int i=0;i<array.length;i++){
                    if(i==index){
                        break;
                    }
                    newArray[i]=array[i];
                }
                array=newArray;
                currentIndex=index;
            }
            for(int i=0;i<newCollection.length;i++){
                array[currentIndex]=newCollection[i];
                currentIndex++;
            }
        }
    }

    public int set(int index, int newNum){
        if(index>=array.length){
            throwException();
        }
        int returnNum=array[index];
        array[index]=newNum;
        return returnNum;
    }

    public int[] subList(int start, int end){
        if(end>=array.length){
            throwException();        }
        int size= end-start;
        int index=0;
        int[] newArray= new int[size];
        for(int i=start;i<=end;i++) {
            newArray[index]=array[i];
            index++;
        }
        return newArray;
    }

    public boolean contains(int num){
        if(array.length<=0){
            throwException();        }
        for(int i: array){
            if(i==num){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int i){
        if(array.length <=0){
            throwException();
        }
        for(int j=0;j<array.length;j++){
            if(array[j]==i){
                return j;
            }
        }
        return -1;
    }

    public void clear(){
        if(array.length<=0){
            throwException();
        }
        for(int i=0;i<array.length;i++){
            array[i]=0;
        }
    }

    public void throwException(){
        throw new IndexOutOfBoundsException("Index Out Of Bounds");
    }
}
