public class Solution {
    public int romanToInt(String s) {
       int length = s.length();
        int total = 0;
        for(int i = 0; i < length; i++){
            int position = i;
            position++;
            if(position < length){
                char nextLetter = s.charAt(position);
            }
            char curLet = s.charAt(i);
            if(curLet == 'I'){
                if(position < length && (s.charAt(position) == 'V')){
                    total+=4;
                    i++;
                }else if(position < length && (s.charAt(position) == 'X')){
                    total+=9;
                     i++;
                }else{
                    total+=1;
                }
            }
            else if(curLet == 'V'){
                total+=5;
            }
            else if(curLet == 'X'){
                if(position < length && (s.charAt(position) == 'L')){
                    total+=40;
                     i++;
                }else if(position < length && (s.charAt(position) == 'C')){
                    total+=90;
                     i++;
                }else{
                    total+=10;
                }
            }else if(curLet == 'L'){
                total+=50;
            }else if(curLet == 'C'){
                if(position < length && (s.charAt(position) == 'D')){
                    total+=400;
                     i++;
                }else if (position < length && (s.charAt(position) == 'M')){
                    total+=900;
                     i++;
                }else{
                    total+=100;
                }
            }else if(curLet == 'D'){
                total+=500;
            }else if(curLet == 'M'){
                total+=1000;
            }
        }
         return total;
    }
   
}