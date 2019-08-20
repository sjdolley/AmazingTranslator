package nz.ac.eit;

/**
 * Hello world!
 *
 */
/**public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! has changed" );
        System.out.println("What is the number to translate");
        Scanner scan = new Scanner(System.in);
        String somevariable = scan.nextline();
        int aInt = Integer.parseInt(somevariable);
        System.out.println("Ze number is ", +aInt);
    }
}
 */
public class App
{
    static String valueInput;
    static String languageInput;
    static int valueInt;
    static int languageInt;
    static Boolean checkValidate;
    static String[] french = {
            "un", "deux",
            "trois", "quatre", "cinq",
            "six", "sept", "huit",
            "neuf", "dix", "onze",
            "douze", "treize", "quatorze",
            "quinze", "seize", "dix-sept",
            "dix-huit", "dix-neuf", "vingt",
            "vingt et un", "vingt-deux", "vingt-trois",
            "vingt-quatre", "vingt-cinq", "vingt-six",
            "vingt-sept", "vingt-huit", "vingt-neuf",
            "trente"
    };
    static String[] german = {
            "eins", "zwei",
            "drei", "vier", "fünf",
            "sechs", "sieben", "acht",
            "neun", "zehn", "elf",
            "zwölf", "dreizehn", "vierzehn",
            "fünfzehn", "sechzehn", "siebzehn",
            "achtzehn", "neunzehn", "zwanzig",
            "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig",
            "vierundzwanzig", "fünfundzwanzig", "sechsundzwanzig",
            "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig",
            "dreißig"
    };

    public static void main( String[] args ){
        while(true)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Welcome to Amazing Translator");
            System.out.println("Please enter a integer from 1 - 30");
            valueInput = scan.nextLine();
            System.out.println("Chose a language 1 or 2");
            languageInput = scan.nextLine();

            if(validate(valueInput, valueInt)){
                valueInt = Integer.parseInt(valueInput);
            };
            if(validate(languageInput, languageInt)){
                languageInt = Integer.parseInt(languageInput);
            };

            if(valueInt <= 30 && valueInt >= 1 && languageInt == 1 || languageInt ==2)
            {
                if(languageInt == 2){
                    System.out.println(french[valueInt - 1]);
                } else {
                    System.out.println(german[valueInt - 1]);
                }

            }




        }

    }

    static public boolean validate(String val, int out){
        try {
            out = Integer.parseInt(val);
            return true;
        } catch(Exception e) {
            return false;
        }
    }


}