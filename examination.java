import java.io.*;
class examination
{
    public static void main()throws IOException
    {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IR);
        int rn[]=new int[50];
        int sub1[]=new int[50];
        int sub2[]=new int[50];
        int sub3[]=new int[50];
        double avg[]=new double[50];
        int i;
        for(i=0;i<50;i++)
        {
            System.out.println("Enter the roll number:");
            rn[i]=Integer.parseInt(br.readLine());
            System.out.println("Enter the marks for subject 1:");
            sub1[i]=Integer.parseInt(br.readLine());
            System.out.println("Enter the marks for subject 2 :");
            sub2[i]=Integer.parseInt(br.readLine());
            System.out.println("Enter the marks for subject 3 :");
            sub2[i]=Integer.parseInt(br.readLine());
            avg[i]=(sub1[i]+sub2[i]+sub3[i])/3.0;
        }
        System.out.println("Average marks obtained by each student");
        System.out.println("Roll No.\tSubjectA\tSubjectB\tSubjectC\tAverage");
        for(i=0;i<50;i++)
        {
            System.out.println(rn[i]+"\t"+sub1[i]+"\t"+sub2[i]+"\t"+sub3[i]+"\t"+avg[i]);
        }
        System.out.println("Average marks obtained by each student whose average is above 80");
        System.out.println("Roll No.\tSubjectA\tSubjectB\tSubjectC\tAverage");
        for(i=0;i<50;i++)
        {
            if(avg[i]>80)
            System.out.println(rn[i]+"\t"+sub1[i]+"\t"+sub2[i]+"\t"+sub3[i]+"\t"+avg[i]);
        }
        System.out.println("Average marks obtained by each student whose average is below 40");
        System.out.println("Roll No.\tSubjectA\tSubjectB\tSubjectC\tAverage");
        for(i=0;i<50;i++)
        {
            if(avg[i]<40)
            System.out.println(rn[i]+"\t"+sub1[i]+"\t"+sub2[i]+"\t"+sub3[i]+"\t"+avg[i]);
        }
    }
}
    