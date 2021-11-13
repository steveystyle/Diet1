class Dec2Hex
{
    //main function calls sub routines to convert int to hex
    public static void main(String[] args)
    {
        if(nullInputCheck(args))
        {
            if(possitiveIntCheck(intParse(args)))
            {
                D2HLog.info("Converting the Decimal Value " + intParse(args) + " to Hex..."); 
            	D2HLog.info("Hexadecimal representation is: " + hexConverter(intParse(args)));               
            }else{
                D2HLog.warning("Error - Only positive integer to be entered");
            }
        }else{
            D2HLog.warning("Error - Nothing input");
        }
    }
    
    //the function checks that there has been an input supplied
    private static boolean nullInputCheck (String[] args)
    {
        return args.length>0;
    }
    
    //this function attempts to parse the input to an int and returns a negative int if processes fails. 
    public static int intParse(String[] args)
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
        return i>0;
    }
    
    
    //this function converts the validated input to hex if all validation gates passed
    private static String hexConverter(int i)
    {
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuilder result = new StringBuilder();
        for (; i!=0; i=i/16) {        	
            result.insert(0,ch[i%16]);
        }
        return result.toString();
    }
}
