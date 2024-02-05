package First;

public class StringWithoutuseReplace {

	public static void main(String[] args) {
		
		String st= "String.remove.dot.to.Space.without.using.replace.method.and.Function";
		
		String[] sp = st.split("\\.");
		//for(String str:sp) {
		for(int i=0;i<sp.length;i++) {
			
			System.out.print(sp[i]+" ");
		}
	}
}
