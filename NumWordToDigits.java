class Solution {
    public String originalDigits(String s) {
     // building hashmap letter -> its frequency
    char[] count = new char[26 + (int)'a'];
    for(char letter: s.toCharArray()) {
      count[letter]++;
    }

    // building hashmap digit -> its frequency
    int[] out = new int[10];
    // letter "z" is present only in "zero"
    out[0] = count['z'];
    // letter "w" is present only in "two"
    out[2] = count['w'];
    // letter "u" is present only in "four"
    out[4] = count['u'];
    // letter "x" is present only in "six"
    out[6] = count['x'];
    // letter "g" is present only in "eight"
    out[8] = count['g'];
    // letter "h" is present only in "three" and "eight"
    out[3] = count['h'] - out[8];
    // letter "f" is present only in "five" and "four"
    out[5] = count['f'] - out[4];
    // letter "s" is present only in "seven" and "six"
    out[7] = count['s'] - out[6];
    // letter "i" is present in "nine", "five", "six", and "eight"
    out[9] = count['i'] - out[5] - out[6] - out[8];
    // letter "n" is present in "one", "nine", and "seven"
    out[1] = count['n'] - out[7] - 2 * out[9]; //we subtract 2 * out[9] because there are two "n"s in nine

    // building output string
    StringBuilder output = new StringBuilder();
    for(int i = 0; i < 10; i++) //the frequency array
      for (int j = 0; j < out[i]; j++)  //each index in the frequency array
        output.append(i);
    return output.toString();
  }   
}
/*
we create a int array  that holds the frequency of each letter in the string
----------------------
Letter "z" is present only in "zero".
Letter "w" is present only in "two".
Letter "u" is present only in "four".
Letter "x" is present only in "six".
Letter "g" is present only in "eight".
Letter "h" is present only in "three" and "eight".
Letter "f" is present only in "five" and "four".
Letter "s" is present only in "seven" and "six".
Letter "i" is present in "nine", "five", "six", and "eight".
Letter "n" is present in "one", "seven", and "nine".
-----------------------
this requires intuitive thinking of the letters
there are some unique characters in some numbers
by finding the right ones we can solve that zero,two,four,size,eight have unique letters
the rest can be found by subtracting the total letters of the frequency
then we use a double for loop from the frequency array, and each array in the frequency array to turn it 
into a toString array
