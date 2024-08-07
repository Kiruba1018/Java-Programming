import java.util.*;
class upplowdig {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            if(Character.isLowerCase(c))
            {
                System.out.print(c);
               
            }
           
          
             if(Character.isUpperCase(c))
            {
                System.out.print(c);
            }    
            
               
             if(Character.isLetterOrDigit(c))
            {
                System.out.print(c);
            }
         

    }

}
}   
        
