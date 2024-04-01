class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss =new Stack<Character>();

        for(int i=0;i< s.length();i++){
            switch(s.charAt(i)){
                case ')':
                    if(ss.size()>0 && ss.peek()=='(')
                        ss.pop();
                    else
                        ss.push(')');
                    break;
                case '}':
                    if(ss.size()>0 && ss.peek()=='{')
                        ss.pop();
                    else
                        ss.push('}');
                    break;
                case ']':
                    if(ss.size()>0 && ss.peek()=='[')
                        ss.pop();
                    else
                        ss.push(']');
                    break;
                default:
                    ss.push(s.charAt(i));
            }
        }
        return ss.size()==0;
    }
}