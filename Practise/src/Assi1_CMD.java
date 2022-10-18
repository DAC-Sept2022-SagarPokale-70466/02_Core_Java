class Assi1_CMD
{        
    public static void main(String[] args)
{
    int max = 0;
    for(int i = 0; i < args.length; i++)
    {
    	int num = Integer.parseInt(args[0]);
    	if(max > num)
    		max = num;
    }
    System.out.println(max);
 
}
}