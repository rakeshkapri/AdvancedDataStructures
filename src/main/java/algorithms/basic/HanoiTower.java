package algorithms.basic;

public class HanoiTower {
    private static int totalMoves;

    private static void hanoiTower(int num, char source, char destination, char temp){
        if(num < 1){
            return;
        }
        hanoiTower(num-1, source, temp, destination);
        System.out.println("moving item from :  " + source  + " to : " + destination + " in move no."+
                ++totalMoves);
        hanoiTower(num-1, temp, destination, source);
    }

    public static void main(String a[]){
        int num = 5;
        hanoiTower(num, 'A', 'C', 'B');
    }
}
