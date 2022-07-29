package com.example.encrypter_decrypter;

public class Encode {
    public static String encode(String s){
        s=s+" ";
        String extra="11111111";
        int cu=0;

        int arr[]=new int[11111111];

        for(int i=0;i<s.length();i++)
        {
            arr[i]=(int)s.charAt(i);
            cu++;
        }
        String result="";

        int bin[]=new int[111];
        int idx=0;

        for(int i=0;i<cu;i++)
        {
            int temp=arr[i];

            for (int j=0;j<cu;j++)
                bin[j]=0;
            idx=0;
            while(temp>0){
                bin[idx++]=temp%2;
                temp=temp/2;
            }
            String dig= "";
            String temps;

            for(int j=0;j<7;j++)
            {
                temps=Integer.toString(bin[j]);

                dig=dig.concat(temps);
            }
            String revs="";

            for(int j=dig.length()-1;j>=0;j--)
            {
                char ch= dig.charAt(j);
                revs = revs.concat(String.valueOf((ch)));

            }
            result=result.concat(revs);
        }
        result=extra.concat(result);
        return result;
    }
}
