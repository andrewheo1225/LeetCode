class countStudents {
    public int Students(int[] students, int[] sandwiches) {
        int[] hash = new int[2];
        for(int i = 0; i < students.length; i++){
            hash[students[i]]++;
        }
        int x = 0;
        while(x < sandwiches.length){
            if(hash[sandwiches[x]] > 0)
                hash[sandwiches[x]]--;
            else
                break;
            x++;
        }
        return students.length - x;
    }
}