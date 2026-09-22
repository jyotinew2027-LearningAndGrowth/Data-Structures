package InterviewPreparation.Arrays;

import java.util.Arrays;

public class MeetingRooms {

    //1.
    public static boolean meetingRooms(int[][] t) {
        for (int i=0;i<t.length;i++) {
            for (int j=i+1;j<t.length;j++) {
                if (overlap(t[i],t[j]))
                    return false;
            }
        }
        return true;
    }
    public static boolean overlap(int[] t1,int[] t2) {
        return (t1[0] >= t2[0] && t1[0] < t2[1] ||
                (t2[0] >= t1[0] && t2[0] < t1[1]));
    }
    //2.
    public static boolean canAttendMeeting(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        for (int i=0;i<intervals.length-1;i++) {
            if (intervals[i][1] > intervals[i+1][0])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        int[][] interval = {{7,10},{2,4}};
        int n = 2;
        System.out.println("Meetings 1 :: " + canAttendMeeting(intervals));
        System.out.println("Meetings 2  :: " + canAttendMeeting(interval));
    }
}
