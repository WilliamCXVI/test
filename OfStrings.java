import java.util.ArrayList;
public class OfStrings {
	public static void main(String[] args)
	{
		String input;
			
			System.out.println("Chapter 9:: Text Processing and More about Wrapper CLasses");
			System.out.println("Programming Challenges:: ");
			System.out.println("__________________________________________________________");
			
			input=backwardString("Jesus");
			System.out.println(input);
			
			input="3 For I handed on to you as of first importance what I in turn had received: that Christ died for our sins in accordance with the scriptures, 4 and that he was buried, and that he was raised on the third day in accordance with the scriptures, 5 and that he appeared to Cephas, then to the twelve.";
			System.out.println(wordCounter(input));
			
			input="scientists have learned to supplement the sense of sight in numerous ways. in front of the tiny pupil of the eye they put, on mount palomar, a great monocle 200 inches in diameter, and with it see 2000 times farther into the depths of space. or they look through a small pair of lenses arranged as a microscope into a drop of water or blood, and magnify by as much as 2000 diameters the living creatures there, many of which are among man’s most dangerous enemies. or, if we want to see distant happenings on earth, they use some of the previously wasted electromagnetic waves to carry television images which they re-create as light by whipping tiny crystals on a screen with electrons in a vacuum. or they can bring happenings of long ago and far away as colored motion pictures, by arranging silver atoms and color-absorbing molecules to force light waves into the patterns of original reality. or if we want to see into the center of a steel casting or the chest of an injured child, they send the information on a beam of penetrating short-wave x rays, and then convert it back into images we can see on a screen or photograph. thus almost every type of electromagnetic radiation yet discovered has been used to extend our sense of sight in some way.";
			System.out.println(sentenceCapitalizer(input));
	
	}

		public static String backwardString(String input)
		{
			StringBuilder sb = new StringBuilder(input);
			sb.reverse();
			return sb.toString();
		}
		
		public static int wordCounter(String input)
		{
			input.strip();
			String[] array = input.split(" ");
			int counter=array.length;
			return counter;
		}
		
		public static String sentenceCapitalizer(String input)
		{
			int temp=0;
			char[] chain;
			String tempS;
			ArrayList<String> array = new ArrayList<String>();
			for (int i = 0; i<input.length(); i++)
			{
				if(input.charAt(i)=='.')
				{
					array.add( (input.substring(temp, i)) + '.');
					temp=i+2;
				}
			}
			for(int i = 0; i<array.size(); i++)
			{
				//debug System.out.println(array.get(i));
				tempS=array.get(i);
				//debug System.out.println(tempS);
				chain=tempS.toCharArray();
				//debug System.out.println(chain);
				chain[0]=Character.toUpperCase(chain[0]);
				tempS=new String(chain);
				array.set(i, tempS);
			}
			return array.toString();
		}

}
