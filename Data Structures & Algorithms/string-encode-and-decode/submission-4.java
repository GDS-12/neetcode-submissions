class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String s:strs){
            str.append(s.length()).append('#').append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int delimeter = i;
            while(str.charAt(delimeter)!='#'){
                delimeter++;
            }
            int length = Integer.parseInt(str.substring(i,delimeter));
            int start = delimeter+1;
            int end = start+length;
            strs.add(str.substring(start,end));
            i=end;
        }
        return strs;
    }
}
