class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        int n = strs.size();
        for(int i=0; i<n; i++){
            str.append(strs.get(i));
            str.append("é");
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        int count = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='é') count++;
        }
        List<String> strs = new ArrayList<>();
        StringBuilder st= new StringBuilder();
        for(char s : str.toCharArray()){
            if(s!='é') st.append(s);
            else{
                strs.add(st.toString());
                st.setLength(0);
            }
        }
        return strs;
    }
}
