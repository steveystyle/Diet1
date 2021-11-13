class Dec2Hex
{
    public static void main(String args[])
    {
        if(nullInputCheck(args))
        {
            if(possitiveIntCheck(intParse(args)))
            {
                System.out.println("Converting the Decimal Value " + intParse(args) + " to Hex...");                
                System.out.println("Hexadecimal representation is: " + hexConverter(intParse(args)));              
            }else{
                System.out.println("Error - Only positive integer to be entered");
            }
        }else{
            System.out.println("Error - Nothing input");
        }
    }
    
    
    private static boolean nullInputCheck (String args[])
    {
        if(args.length>0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    public static int intParse(String arg[])
    {
        try
        {
            return Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            return -1;
        }       
    }
    
    public static boolean possitiveIntCheck(int i)
    {
        if(i>0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    private static string hexConverter(int i)
    {
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        string result = "";
        while(i != 0)
                {
                    result= ch[i%16] + result;
                    i= i/16;
                }
        return result;
    }
}
