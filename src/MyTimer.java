import java.io.IOException;
import java.util.Scanner;

public class MyTimer implements Runnable{
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the time to countdown in minutes and seconds");
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        int hour = 0;
        if(minutes>60) {
            hour+=minutes/60;
            minutes=minutes%60;
        }
        if(seconds>60) {
        minutes+=seconds/60;
        seconds=seconds%60;
        }

        while(seconds >=0 && minutes>=0 && hour>=0)
        {
            if(seconds>60) {
                minutes+=seconds/60;
                seconds=seconds%60;
            }

            if(minutes>60) {
                hour+=minutes/60;
                minutes=minutes%60;
            }

            if(seconds==0 && minutes>0)
            {
                minutes--;
                seconds+=60;
            }

            if(minutes==0 && hour>0)
            {
                minutes+=59;
                hour--;
            }

            System.out.println(hour+":"+minutes+":"+seconds);
                --seconds;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
