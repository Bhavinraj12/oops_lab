package currency;
import java.util.*;
import java.text.decimalformat;
class currencyconvertor
{ 
    double rupee,dollar,euro,yen;
    scanner sc=new scanner(system.in);
    decimalformat f=new decimalformat("##.###");
    public convertlnrtoeuro()
    {
       system.out.println("enter amount in rupees");
       rupee=sc.nextfloat();
       euro=rupee/80;
       system.out.println("euro:"+f.format(rupee"));
    }
    public convertinttodollar()
    {
        system.out.println("enter amount in rupees");
        rupee=sc.nextfloat();
        dollar=rupee/66;
        system.out.println("dollar:+f.format(dollar));
    }
    public convertdollartoinr()
    {
        system.out.println("enter amount in dollar");
        dollar=sc.nextfloat();
        rupee=dollar*66;
        system.out.println("rupee;"+f.format(rupee))
    }
    public convertlnrtoyen()
    {
        system.out.println("enter amount in rupees");
        rupee=sc.nextfloat();
        yen=rupee/0.61;
        system.out.println("yen:"+f.format(yen));
    }
    public convertyentoinr()
    {
        system.out.println("enter amount in yen");
        euro+sc.nextfloat();
        rupee=yen*0.61;
        system.out.println("rupee:"+f.format(rupee));
    }
}



package distance
import java.util.*;
import java.text.decimalformat;
class distanceconvertor
{
    double meter,km,miles;
    scanner sc=new scanner(system.in);
    decimalformat f=new decimalformat("##.###");
    public convertmetertokm()
    {
        system.out.println("enter the meter");
        meter=sc.nextfloat();
        km=meter*0.001;
        system.out.println("kilometer:"+f.format(km));
    }
    public convertmilestokm()
    {
        system.out.println("enter the miles");
        miles=sc.nextfloat();
        km=miles*1.6093;
        system.out.systen("kilometer:"+f.format(Km));
    }
    public convertkmtomiles()
    {
        system.out.println("enter the kilometer");
        km=sc.nextfloat();
        miles=km/1.6093;
        system.out.println("miles:"+f.format(miles));
    }
}
package time;
import java.util.*;
import java.text.decimalformat;
class timeconvertor
{
    double hour,minute,second;
    scanner sc=new scanner(system.in);
    decimalformat f=new decimalformat("##.###");
    public converthourtominute()
    {
       system.out.println("entre the hour")
       hour=sc.nextfloat();
       minuter=hour*60;
       system.out.println("minutes:"+f.format(minute));  
    }
    public converminutetohour()
    {
       system.out.println("enter the minute")
       minute=sc.nextfloat();
       hour=hour/60;
       system.out.println("hours:"+f.format(hour));
    }
    public converthourtosecond()
    {
       system.out.println("enter the hour");
       hour=sc.nextfloat();
       second=hour*3600;
       system.out.println("seconds:"+f.format(second));
    }
    public convertsecondstohour()
    {
       system.out.println("enter the seconds");
       second=sc.nextfloat();
       hour=hour/3600;
       system.out.println("hours:"+f.format(hour));
    }   
}


import currency.*;
import distance.*;
import time.*;
import java.util.scanneer;
public class convert
{
    public static void main(string[]args)
    {
        int code,currency_code,distance_code,time_code;
        scanner sc=new scanner(system.in);
        system.out.println("enter the code 1:currency\n2:distance\n3:time");
        code=sc.nextint();
        if(code==1)
        {
            system.out.println("enter the currecy code 1:euro\n2:dollar\n3:yen");
            currency_code=sc.nextint();
            if(currecy_code==1)
            {
                convertinrtoeuro();
                converteurotoinr()    
            }
            else if(currency)


        

  