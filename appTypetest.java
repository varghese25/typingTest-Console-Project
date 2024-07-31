import java.util.*;

public class appTypetest {

    public static void main(String[] args) {

        String ts = "\n Hello going to test your typing speed using appTypetest"; // ts type seed sentence to type

        System.out.println("<<< TYPE THE FOLLOWING SENTENCE>>>");
        System.out.println(ts);

        long st = System.currentTimeMillis(); // Start time is st

        Scanner sc = new Scanner(System.in);
        String ui = sc.nextLine(); // ui is using input

        long et = System.currentTimeMillis(); // End time is et

        long time = (et-st)/1000; // time is millis to converts in seconds et-st/1000;



        // To check how many correct words

        String [] ta = ts.split(" ");// ta is testing array. ts it will take words split in the "".
        String [] ua = ui.split(" "); // ua is user array. from ui it will take input;

        // Going check array words How many words Correct and Wrong.

        int cc = 0; // cc is correct count;
        int wc = 0; // wc is wrong count;

        // loop to check string
        for (int i = 0; i < Math.min(ta.length, ua.length); i++) {
            if(ta[i].equals(ua[i])) {
                cc++;
            } else {
                wc++;
            }
        }
            wc+=Math.max(0,ua.length-ta.length); //  if user type extra word which in the "ts sentence" this condition used.

            //typing speed calculation

            double typespd = (cc/(double)time)*60;// typespd means typespeed
            

            System.out.println("Time Taken:" + time + "Sec");
            System.out.println("Words Typed Correctly:" + cc);
            System.out.println("Words Typed Inorrectly:" + wc);
            System.out.println("Typed Speed :" + typespd+"WPM");
        }

    }


