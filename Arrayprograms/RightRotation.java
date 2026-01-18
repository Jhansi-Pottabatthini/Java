// perform right rotation from a given array of elements
public class RightRotation {
    public static void main(String[] args) {
        int [] arr={5,7,3,9,2,1};
        int userinput=2;
        int [] b=new int[arr.length];
        int k=0;
        for(int i=arr.length-userinput;i<arr.length;i++)
        {
            b[k++]=arr[i];
        }
        for(int j=0;j<arr.length-userinput;j++)
        {
            b[k++]=arr[j];
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    
}
