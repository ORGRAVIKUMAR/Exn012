package exno12;
class Minelement
{
    <T extends Comparable<T>> void find(T[] array)
    {
        T min;
        min=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i].compareTo(min)<0)
            {
                min=array[i];
            }
        }
        System.out.println("Minimum element in given array is\t"+min);
    }
}
public class min_value
{
    public static void main(String[] args) 
    {
        Integer arr[]={93,58,100,23,455,454,33,78};
        Minelement me = new Minelement();
        me.find(arr);
    }
    
}
