package stringbuffer;

public class AllStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              StringBuffer sb=new StringBuffer("hello");
              System.out.println("string:"+sb);
              sb=sb.append(" program");
              System.out.println("string append: "+sb);
              System.out.println("String insert: "+sb.insert(5, " world"));
              System.out.println("replace(int start, int end, String s): "+sb.replace(0,5,"Str"));
              System.out.println("string delete(int start, int end) "+sb.delete(0, 6));
              System.out.println("string deleteChatAt: "+sb.deleteCharAt(0));
              System.out.println("string reverse: "+sb.reverse());
              System.out.println("string length"+sb.length());
              System.out.println("Strign capacity: "+sb.capacity());
              System.out.println("CharAt: "+sb.charAt(0));
              sb.setCharAt(0,'n');
              System.out.println("setCharAt: "+sb);
              System.out.println("Substring: "+sb.substring(3));
              System.out.println("substring(int start, int end) "+sb.substring(1,4));
              System.out.println("toString: "+sb.toString());
              sb.ensureCapacity(30);
              System.out.println("String ensure capacity "+sb.capacity());
              sb.setLength(20);
              System.out.println("String set length "+sb.length());
	}
}
