
class digchar {
    public static void main(String[] args)
    {
      String s = "K2i0r0u3b1a103";  
      String d = "";
      String e = "";
      for(int i=0;i<s.length();i++)
      {
        char c = s.charAt(i);
        if(Character.isDigit(c))
        {
            d = d + c;
        }
        else
        {
            e = e + c;
        }
       
      }
      String sen = d + e;
      System.out.println(sen);

    }
}
