class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
         
    
    if(currentState.length() < 2) return res;
     List<String> res = new ArrayList<String>();
    char[] current = currentState.toCharArray();
    
    for(int i = 0; i < current.length - 1; i++)
    {
        if(current[i] == '+' && current[i+1] =='+')
        {
            StringBuilder str = new StringBuilder("");
            current[i] = '-';
            current[i + 1] = '-';

            res.add(str.append(current).toString());

            current[i] = '+';
            current[i + 1] = '+';
        }
        
        
    }
    return res;
}
    }


/*
if the length of the array is 0 || 1 return nothing
we only have to iterate string.length - 1 times because we only have to worry about 2 consecutives values
Since strings are immutable, we make a char array of the string and manually change the i && i+1 values 
into the '-' and then return the ArrayList.
*/