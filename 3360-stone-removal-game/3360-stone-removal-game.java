class Solution {
    public boolean canAliceWin(int n) {
        int counter = 10, track = 0;
        if(n<10) return false;
        while(n > 0){
            if(n-counter>=0){
                n-=counter;
                counter--;
                track++;
            }
            else break;
        }
        return track%2 == 1;
    }
}