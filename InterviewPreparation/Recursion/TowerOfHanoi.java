package InterviewPreparation.Recursion;

public class TowerOfHanoi {
    static int moves = 0;
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoiSolve(n,'A','B','C');
        System.out.println("Total Moves :: " + moves);
    }
    public static int towerOfHanoiSolve(int n,char fromRod,char helper,char toRod) {
        if(n==1) {
            moves++;
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return 1;
        }
        //move top n-1 disks from fromRod to helper using toRod
        towerOfHanoiSolve(n-1,fromRod,toRod,helper);
        moves++;
        //Move nth disk to ToRod from fromRod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        //Move n-1 disks from helper to toRod using fromRod
        towerOfHanoiSolve(n-1,helper,fromRod,toRod);
        return moves;
    }
}
