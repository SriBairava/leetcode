// Last updated: 20/07/2026, 11:08:40
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int st = toSeconds(startTime);
        int end = toSeconds(endTime);
        return end - st;
    }
    private int toSeconds(String time){
        String[] t = time.split(":");
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int s = Integer.parseInt(t[2]);
        return h * 3600 + m * 60 + s;
    }
}