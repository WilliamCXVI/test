public class VowelsAndConsonants {

	private char[] array;
	private char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
	private char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
	
	public VowelsAndConsonants(String string)
	{
		array=string.toCharArray();
	}
	public int vowels()
	{
		int vowels=0;
		for (int i = 0; i<array.length; i++)
		{
			for(char v : vowel)
			{
				if(v==array[i])
				vowels++;
			}
		}
		return vowels;
	}
	public int consonants()
	{
		int consonants=0;
		for (int i = 0; i<array.length; i++)
		{
			for(char c : consonant)
			{
				if(c==array[i])
				consonants++;
			}
		}
		return consonants;
	}
}
