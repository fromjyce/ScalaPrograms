//To swap the upper case letters to lower case letters

def SwapLetters(word: String): String = 
	val swappedChars = for (i<-0 to (word.length-1)) yield {
		val char = word.charAt(i)
		if (Character.isUpperCase(char)) {
			char.toLower
		}
		else {
			char.toUpper
		}
	}
	val word_swapped = swappedChars.mkString
	return word_swapped

@main def main() =
	print("Enter a word: ")
	var word = scala.io.StdIn.readLine()
	println(SwapLetters(word))
