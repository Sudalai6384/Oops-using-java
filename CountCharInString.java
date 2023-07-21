import java.util.Scanner;
class CountCharInString
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();
        char c= sc.next().charAt(0);
        char[] charArr =str.toCharArray();
        for(int i=0;i<(charArr.length);i++){

            if(charArr[i] == c)
            {
                count++;
            }

        }
        System.out.println(count);
    }}