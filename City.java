import java.util.Scanner;
class City
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String city[]= new String[10];
        int std[]=new int[10];
        
        System.out.println("Enter name of 10 cities: ");
        for(int i=0;i<city.length;i++)
        {
            city[i]=in.nextLine();
        }
        
        System.out.println("Enter STD code of 10 cities: ");
        for(int j=0;j<std.length;j++)
        {
            std[j]=in
            .nextInt();
        }
        
        System.out.println("Enter your choice "
                            + "\n1 for STD Search"
                            + "\n2 for City Search");
        int ch = in.nextInt();
        
        int pos = -1; 
        switch(ch)
        {
            case 1: System.out.println("Enter STD code");
                    int code = in.nextInt();          
                    for(int i=0; i<std.length; i++)
                    {
                        if(code == std[i])
                           pos = i;
                    }
                    if(pos != -1)
                        System.out.println("City : " + city[pos]);
                    else
                        System.out.println("Element not found");
                    break;
                    
            case 2: System.out.println("Enter name of City");
                    String name = in.nextLine();          
                    for(int i=0; i<city.length; i++)
                    {
                        if(name.equals(city[i]))
                           pos = i;
                    }
                    if(pos != -1)
                        System.out.println("City : " + city[pos]);
                    else
                        System.out.println("Element not found");
                    break;
                    
            default: System.out.println("Wrong choice");
                    break;
        }
        
        
        System.out.println("City names which start with A");
        for(int i=0; i<city.length ; i++)
        {
            if(city[i].startsWith("A"))
            System.out.println(city[i]);
        }
    }
}