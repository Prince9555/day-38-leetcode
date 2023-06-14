import java.util.*;
public class day38 {

public static boolean ispalidrome(String str)
{
for(int i=0;i<str.length()/2;i++)
{
    if(str.charAt(i)!=str.charAt(str.length()-1-i))
    {
        return false;
    }
    
}
 return true;

}

public static float getpath(String path)
{
int x=0;
int y=0;
for(int i=0;i<path.length();i++)
{
    char ch=path.charAt(i);
    if(ch=='S')
    {
        y--;
    }
    else if(ch=='N')
    {
        y++;
    }
    else if(ch=='E')
    {
        x++;
    }
  else
    {
        x--;
    }
}
int x2=x*x;
int y2=y*y;
return (float)Math.sqrt(x2+y2);


}


    public static void main(String[] args) {
       // String str="racecar";
       String path="WNEENESENNN";
       System.out.println(getpath(path));
        //System.out.println(ispalidrome(str));
    }
    
}





/*class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0], min = nums[0], ans = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            int temp = max;  // store the max because before updating min your max will already be updated
            
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            
            if (max > ans) {
                ans = max;
            }
        }
        
        return ans;

    }
}*/
