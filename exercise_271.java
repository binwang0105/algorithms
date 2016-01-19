public class Codec {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();
        for(String str : strs){
            output.append(String.valueOf(str.length())+"#");
            output.append(str);
        }
        return output.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        //for storage list
        List<String> list = new LinkedList<String>();
        int start = 0;
        while(start < s.length()){
            
            int pos = s.indexOf('#', start);
            int size = Integer.parseInt(s.substring(start, pos));
            
            list.add(s.substring(pos+1, pos + size +1));

            start = pos + size + 1;
        }
        return list;
    }
}
