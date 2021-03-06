import java.util.*; 
public class QuickSortArray{
    public static int part(int a[],int beg,int end )
    {
        int left,right,temp,l,pivot=0;
        l=left=beg;
        right=end;
        while(pivot!=1)
        {
            while((a[l]<=a[right])&&(l!=right))
            right--;
                if(l==right)
                pivot=1;
                else if(a[l]>a[right])
                {
                    temp=a[l];
                    a[l]=a[right];
                    a[right]=temp;
                    l=right;

                }
                if(pivot!=1)
                {
                    while((a[l]>=a[left])&&(l!=left))
                    left++;
                    if(l==left)
                    pivot=1;
                    else if(a[l]<a[left])
                    {
                        temp=a[l];
                        a[l]=a[left];
                        a[left]=temp;
                        l=left;
                    }
                }
        }

            return l;
        
    }
        static void quick(int a[],int beg, int end)
        {
            int l;
            if(beg<end)
            {
                l=part(a,beg,end);
                quick(a,beg,l-1);
                quick(a,l+1,end);
            }
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            
            quick(a,0,n-1);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

        }
    
}

// BY ARUNODAY KUMAR
