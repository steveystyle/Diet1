class Dec2Hex
{
    //main function calls sub routines to convert int to hex
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
    
    //the function checks that there has been an input supplied
    private static boolean nullInputCheck (String args[])
    {
        if(args.length>0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    //this function attempts to parse the input to an int and returns a negative int if processes fails. 
    public static int intParse(String args[])
    {
        try
        {
            return Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            return -1;
        }       
    }
    
    //this function checks if the parsed input is a positive int
    public static boolean possitiveIntCheck(int i)
    {
        if(i>0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    
    //this function converts the validated input to hex if all validation gates passed
    private static String hexConverter(int i)
    {
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String result = "";
        while(i != 0)
                {
                    result= ch[i%16] + result;
                    i= i/16;
                }
        return result;
    }
}
