package calculator;
import java.util.regex.*;
public class calculator
{

    public static int add(String text)
    {
        int sum = 0;
        int sum2 = 0;
        if(text.isEmpty())
        {
            return 0;
        }
        else if(text.contains(",")) {
        int n=toint(text);
        return n;
        }
        if(text.startsWith("//"))
        {
            Pattern pattern2 = Pattern.compile("//\\[(.*)\\]\n(.*)");
            Matcher matcher2 = pattern2.matcher(text);
            boolean match2 = matcher2.matches();

            Pattern pattern1 = Pattern.compile("//(.)\n(.*)");
            Matcher matcher1 = pattern1.matcher(text);
            boolean match1 = matcher1.matches();





            if(match2) {

            String n2 = matcher2.group(1);
            String s2 = matcher2.group(2);
            System.out.println(n2);
            System.out.println(s2);
            String[] tok2 = s2.split(pattern2.quote(n2));
            for (int i = 0; i < tok2.length; i++) {
                if (Integer.parseInt(tok2[i]) <= 1000) {
                    sum2 = sum2 + Integer.parseInt(tok2[i]);
                }
            }
            return sum2;

        }

            else if(match1) {

                System.out.println(match1);
                String n = matcher1.group(1);
                String s = matcher1.group(2);
                String[] tok = s.split(n);
                for (int i = 0; i < tok.length; i++) {
                    if (Integer.parseInt(tok[i]) <= 1000) {
                        sum = sum + Integer.parseInt(tok[i]);
                    }
                }
                return sum;
            }







        }



            return Integer.parseInt(text);


    }
    public static int toint(String text)
    {
        int sum=0;
        String[] tocken = text.split((",|\n"));
        for(int i=0;i< tocken.length;i++)
        {
            if(Integer.parseInt(tocken[i]) <= 1000)
            {
                sum = sum + Integer.parseInt(tocken[i]);
            }
        }
        return sum;

    }

}