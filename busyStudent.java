public class busyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int busyStudent = 0;
        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                busyStudent++;
            }
        }
        return busyStudent;
    }
}
