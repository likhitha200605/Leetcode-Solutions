package Sliding_window_two_pointer;

import java.util.HashMap;

public class Longest_repeating_character_replacement_424 {
    public static void main(String[] args) {
        Longest_repeating_character_replacement_424 obj=new Longest_repeating_character_replacement_424();
        System.out.println(obj.characterReplacement("AABABBA",1));
    }
 public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxf=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            char str=s.charAt(r);
            map.put(str,map.getOrDefault(str,0)+1);
            maxf=Math.max(maxf,map.get(str));
            int changes=(r-l+1)-maxf;
            if(changes<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }else{
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            r++;
        }
        return maxlen;
    }
}