package nyc.c4q.madelyntav.src.com.company;
import com.sun.tools.javac.util.List;

import java.util.ArrayList;

/**
 * Created by c4q-madelyntavarez on 11/16/15.
 */
public class InterviewCakeHwOne
{

    public static void main(String[] args)
    {
        java.util.List<Integer> list= new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(3);
        list.add(4);

        getProducts(list);
    }

    private static java.util.List getProducts(java.util.List<Integer> list)
    {   int product;
        java.util.List<Integer> productList= new ArrayList<Integer>();

        if(list.isEmpty())
            return null;
        for(int i=0;i<list.size();i++){
            product = 1;
            for(int j=0;j<list.size();j++)
            {
                if(j!=i){
                    product= product*list.get(j);
                }
            }
            productList.add(i, product);
            System.out.println(productList.toString());
        }

        return productList;
    }

}
