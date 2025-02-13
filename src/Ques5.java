public class Ques5 {
    public static void main(String[] args) {
        //repeat method
        String str1 = "pawan jindal";
        str1 = str1.repeat(3);
        System.out.println(str1);

        //strip vs trim
        String str2 = "\t\t \u2005ttn     ";
        str2 = str2.strip();
        System.out.println(str2);

        String str3 = "\t\t \u2005ttn     ";
        str3 = str3.trim();
        System.out.println(str3);

        //isBlank vs isEmpty
        String str4 = "\u2005";
        System.out.println(str4.isBlank());
        System.out.println(str4.isEmpty());

        //indent
        String str5 = "My name is Pawan.\nI live in Delhi";
        System.out.println(str5.indent(5));

        //tranform
        String str6 = "I work at TTN.";
        str6 = str6.transform(str->new StringBuilder(str).reverse().toString());
        System.out.println(str6);

        //three quotes and stripIndent
        String str7 = """
                \tNotes: Java Session
                \t1. Streams
                \t2. Interface
                \t\ta. Types of Interface
                \t3. Lambda Expressions""";
        System.out.println(str7);
        System.out.println(str7.stripIndent());

        //formatted vs format
        String str8 = "Hello %s, You have spend %d hours";
        System.out.println(str8.formatted("Pawan", 10));
        System.out.println(String.format(str8, "pawan", 10));
    }
}
