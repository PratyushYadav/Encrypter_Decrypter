package com.example.encrypter_decrypter;

public class Decode {
    public static String decode(String s){
        String invalid ="Invalid code";

        String extra="11111111";
        Boolean flag=true;

        for(int i=0;i<8;i++){

            if(extra.charAt(i) != s.charAt(i)){
                flag=flag;
                break;
            }
        }
        String val="";

        for(int i=8;i<s.length();i++)
        {
            char ch=s.charAt(i);
            val=val.concat(String.valueOf(ch));

        }
        int arr[][]=new int[11101][8];
        int ind1=-1;
        int ind2=0;

        for(int i=0;i<val.length();i++)
        {
            if(i%7==0){
                ind1++;
                ind2=0;
                char ch= val.charAt(i);
                arr[ind1][ind2]=ch-'0';
                ind2++;
            }
            else{
                char ch= val.charAt(i);
                arr[ind1][ind2]=ch-'0';
                ind2++;
            }
        }
        int num[]= new int[11111];
        int nind=0;
        int temp=0;
        int cu=0;
        for (int i=0;i<ind1;i++)
        {
            cu=0;
            temp=0;

            for(int j=6;j>=0;j--){
                int temp1=(int)Math.pow(2,cu);
                temp+=(arr[i][j]*temp1);
                cu++;
            }
            num[nind++]=temp;
        }
        String ret="";
        char ch;
        for (int i=0;i<nind;i++)
        {
            ch=(char)num[i];
            ret=ret.concat(String.valueOf(ch));
        }

        if(val.length()%7==0 && flag==true)
            return  ret;
        else
            return  invalid;
    }
}
