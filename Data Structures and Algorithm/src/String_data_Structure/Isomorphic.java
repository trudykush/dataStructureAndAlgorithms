package String_data_Structure;

import java.util.Arrays;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean areIsomorphic = Isomorphic.areIsomorphic("abb", "xye");
		System.out.println("" + areIsomorphic);
	}
	
	public static boolean areIsomorphic(String S1,String S2)
    {
        int len1,len2;
        len1 = S1.length();
        len2 = S2.length();
        if(len1!=len2)
            return false;
        else
        {
            int map[] = new int[256];
            int traverse[] = new int[256];
            int i;
            Arrays.fill(map,-1);
            Arrays.fill(traverse,0);
            for(i=0;i<len1;i++)
            {
            	int x = S1.charAt(i);
                if(map[S1.charAt(i)]==-1)
                {
                	int y = S2.charAt(i);
                	if(traverse[S2.charAt(i)]!=0)
                        return false;
                    traverse[S2.charAt(i)] = 1;
                    map[S1.charAt(i)] = S2.charAt(i);
                }
                else
                {
                	int y = S2.charAt(i);
                    if(map[S1.charAt(i)]!=S2.charAt(i))
                        return false;
                }
            }
        }
        return true;
        
    }

}
