public String decodeString(String s) {
    if(s == null || s.length() == 0) return "";
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
        char chr = s.charAt(i);
        if(Character.isDigit(chr)){
            int times = 0;
            while(i < s.length() && s.charAt(i) != '['){
                times = times * 10 + (s.charAt(i) - '0');
                i ++;
            }
            int matchIndex = findMatchIndex(s, i);
            String repeat = decodeString(s.substring(i + 1, matchIndex));

            for(int time = 0; time < times; time++){
                sb.append(repeat);
            }
            i = matchIndex;
        } else {
            sb.append(chr);
        }
    }
    return sb.toString();
}

private int findMatchIndex(String s, int index){
    int count = 0;
    for(; index < s.length(); index++){
        if(s.charAt(index) == '[') count ++;
        else if(s.charAt(index) == ']') count --;

        if(count == 0) break;
    }

    return index;
}