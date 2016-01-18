public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        int num = 0;
        int den = 0;
        
        //solve corner case
        if(den == 0 || num == 0){
            return "0";
        }
        
        boolean isPostive = (num > 0 && den < 0) || (num < 0 && den > 0);
        num = Math.abs(num);
        den = Math.abs(den);

        String intPart = Integer.toString(num/den);

        if(num % den != 0){
            
            num = num % den;
            
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int pos = 0;
            
            map.put(num, pos);

            StringBuffer frac = new StringBuffer();
            
            while(num != 0){
                
                num = 10 * num;
                frac.append(num / den);
                num = num % den;

                if(map.containsKey(num)){

                    String pre = frac.substring(0, map.get(num));
                    String loop = frac.substring(map.get(num));
                    
                    return isPostive == true? intPart + "." + pre + "(" + loop + ")": "-" + intPart + "." + pre + "(" + loop + ")";
                }
                pos++;
                map.put(num, pos);
            }
            return isPostive == true? intPart + "." + frac.toString(): "-" + intPart + "." + frac.toString();
        }
        return isPostive == true? "" + intPart: "-" + intPart; 
    }
}