package br.com.bigois.textblocks;

@SuppressWarnings({"TextBlockMigration", "ConstantValue"})
public class TextBlocksApp {
	public static void main(String[] args) {
		// Traditional string literals use concatenation and \n to represent multiple lines
		// Double quotes inside the text must be escaped with \"
		String traditionalText = "\"The LORD is my shepherd, I lack nothing.\n"
				+ "He makes me lie down in green pastures,\n"
				+ "he leads me beside quiet waters,\n"
				+ "he refreshes my soul.\n"
				+ "\tHe guides me along the right paths for his name’s sake.\n"
				+ "\tEven though I walk through the darkest valley,\n"
				+ "I will fear no evil, for you are with me;\n"
				+ "your rod and your staff, they comfort me.\"\n";

		// Text blocks debuted as a preview in Java 13 and became standard in Java 15
		// Start on a new line with ordinary quotes need no escaping
		// Common indentation is removed and line endings become \n
		// Closing on a separate line keeps the final newline
		String textBlock = """
				"The LORD is my shepherd, I lack nothing.
				He makes me lie down in green pastures,
				he leads me beside quiet waters,
				he refreshes my soul.
					He guides me along the right paths for his name’s sake.
					Even though I walk through the darkest valley,
				I will fear no evil, for you are with me;
				your rod and your staff, they comfort me."
				""";

		System.out.println("Traditional string:");
		System.out.println(traditionalText);

		System.out.println("Text block:");
		System.out.println(textBlock);

		// A text block produces a regular String
		System.out.println("Same content: " + traditionalText.equals(textBlock));
	}
}
