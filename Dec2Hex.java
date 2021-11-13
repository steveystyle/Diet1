import java.util.Scanner;
class Dec2Hex
{
    public static void main(String args[])
    {
        if(nullInputCheck(args[]))
        {
            if(possIntCheck(intParse(String arg[])))
            {
                System.out.println("Converting the Decimal Value " + intParse(String arg[]) + " to Hex...");                
                System.out.println("Hexadecimal representation is: " + hexConverter(intParse(String arg[]));              
            }else{
                System.out.println("Error - Nothing input");
            }
        }else{
            System.out.println("Error - Nothing input");
        }
    }
    
    public boolean nullInputCheck (String args[])
    {
        if(args.length>0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    public int intParse(String arg[])
    {
        try
        {
            return Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            return -1;
        }       
    }
    
    public boolean possIntCheck(int i)
    {
        if(i>0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    private string hexConverter(int i)
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
