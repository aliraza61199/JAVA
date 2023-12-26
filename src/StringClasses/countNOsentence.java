package StringClasses;

public class countNOsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Exploratory testing is an approach. to software testing that is often described. as simultaneous learning, test design, and execution. It focuses on discovery and relies on the guidance of the individual tester to uncover defects that are not easily covered in the scope of other tests.";
		String s= "He fought in several historic boxing matches, including his highly publicized fights with Sonny Liston, Joe Frazier (including the Fight of the Century, the biggest boxing event up until then), the Thrilla in Manila, and his fight with George Foreman in The Rumble in the Jungle. Ali thrived in the spotlight at a time when many boxers let their managers do the talking, and he became renowned for his provocative and outlandish persona. He was famous for trash-talking, often free-styled with rhyme schemes and spoken word poetry, and has been recognized as a pioneer in hip hop. He often predicted in which round he would knock out his opponent.";
		int sentenceCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				sentenceCount++;
			}

		}
		System.out.println("Total number of sentences = " + sentenceCount);
	}

}
