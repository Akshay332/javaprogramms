
public class Accending {
	public static void main(String args[]){
        int a[]={1,15,11,2,3,10,20,18};
     int size=a.length;
     
        for(int i=1;i<size;i++)
        {
           int w=a[i];
            int j=i-1;
            
            
            while(j>=0 && a[j]>w)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=w;
        }
        
        for(int j=0;j<size;j++)
System.out.print(" "+a[j]);
       
     
        
}
}
