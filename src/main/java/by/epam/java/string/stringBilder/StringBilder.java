package by.epam.java.string.stringBilder;

public class StringBilder {
    public static void main(String[] args) {
//        Работа со строкой как с объектом типа String или StringBuilder
//        1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
//        stringBilder1();
//        2. В строке вставить после каждого символа 'a' символ 'b'.
//        stringBilder2();
//        3. Проверить, является ли заданное слово палиндромом.
//        stringBilder3();
// 4. С помощью функции копирования и операции конкатенации составить
// из частей слова “информатика” слово “торт”.
        //       stringBilder4();
        //    5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
//        stringBilder5();
//        6. Из заданной строки получить новую, повторив каждый символ дважды.
//        stringBilder6();
//        7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//        Например, если было введено "abc cde def", то должно быть выведено "abcdef".
//        stringBilder7();
        //8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
//        stringBilder8();
        //9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.
//        stringBilder9();
        //    10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
        stringBilder10();

    }

    //    Работа со строкой как с объектом типа String или StringBuilder
//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void stringBilder1() {
        String text = "Given    the text (string). Find      the largest number of consecutive       gaps in it.";
        int maxGaps = 0;
        int countSpace = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                countSpace++;
            } else if (text.charAt(i) != ' ') {
                countSpace = 0;
            }
            if (countSpace > maxGaps) {
                maxGaps = countSpace;
            }
        }
        System.out.println("Line - >" + text);
        System.out.println("The largest number of consecutive gaps = > " + maxGaps);
    }

    //2. В строке вставить после каждого символа 'a' символ 'b'.
    public static void stringBilder2() {
        String str = "The largest number of consecutive gaps";
        char charA = 'a';
        char charB = 'b';
        System.out.println("Line = > " + str);
        addChar(str, charA, charB);

    }

    public static void addChar(String str, char a, char b) {
        char temp;
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            strb.append(temp);
            if (temp == 'a') {
                strb.append(b);
            }
        }
        System.out.println(" Line with b after a = >" + strb);
    }

    //3. Проверить, является ли заданное слово палиндромом.
    public static void stringBilder3() {
        String str = "топот";
        System.out.println("Line - > " + str);
        if (isPalidrom(str)) {
            System.out.println("Its palindrome!");
        } else {
            System.out.println("It is not palindrome!");
        }

    }

    private static boolean isPalidrom(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (str.toLowerCase().equals(stringBuilder.toString().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    //    4. С помощью функции копирования и операции конкатенации
//    составить из частей слова “информатика” слово “торт”.
    public static void stringBilder4() {
        String inf = "Informatica";
        System.out.println("Informatica: " + inf);
        String str = getWord(inf);
        System.out.println("Tort: " + str);

    }

    private static String getWord(String s) {
//        String strbTort = new String();
//        StringBuilder stringBuilder = new StringBuilder("tort");
//        boolean flag = true;
//        while (flag) {
//            if (stringBuilder.equals(String.valueOf(strbTort))) {
//                flag = false;
//
//                for (int i = 0; i < str.length(); i++) {
//                    if (str.charAt(i) == 't') {
//                        strbTort = strbTort.concat(Character.toString(str.charAt(i)));
//                        if (str.charAt(i) == 'o') {
//                            strbTort = strbTort.concat(Character.toString(str.charAt(i)));
//                        }
//                        if (str.charAt(i) == 'r') {
//                            strbTort = strbTort.concat(Character.toString(str.charAt(i)));
//                            if (str.charAt(i) == 't') {
//                                strbTort = strbTort.concat(Character.toString(str.charAt(i)));
//                            }
//
//
//                        }
//
//                    }
//
//                }
//            }
//        }
//        return strbTort;
        String str = new String();
        str = str.concat(Character.toString(s.charAt(7)));
        str = str.concat(Character.toString(s.charAt(3)));
        str = str.concat(Character.toString(s.charAt(4)));
        str = str.concat(Character.toString(s.charAt(7)));
        return str;
    }

    //    5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void stringBilder5() {
        String line = " Count the number of times the letter “a” is found among the characters of a given string.";
        System.out.println("Line - >" + line);
        int c = getCountA(line);
        System.out.println("\n Count the number of the letter “a”  - >" + c);


    }

    private static int getCountA(String text) {
        int countA = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                countA++;
            }
        }
        return countA;
    }

    //    6. Из заданной строки получить новую, повторив каждый символ дважды.
    public static void stringBilder6() {
        String line = "From the given line get a new one by repeating each character twice";
        System.out.println("Line - > " + line);
        String newLine = getCloneLine(line);
        System.out.println(" New line - > " + newLine);
    }

    private static String getCloneLine(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            stringBuilder.append(str.charAt(i));
        }

        return String.valueOf(stringBuilder);
    }
    //        7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//        Например, если было введено "abc cde def", то должно быть выведено "abcdef".

    public static void stringBilder7() {
        String s = "abc cde  def";
        System.out.println(" Line - > " + s);
        String s2 = getNewLine(s);
        System.out.println("New line = > " + s2);
    }

    private static String getNewLine(String str) {
        char[] charStr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charStr.length - 1; i++) {
            if (charStr[i] != ' ' && charStr[i + 1] != ' ' && charStr[i] != charStr[i + 1]) {
                stringBuilder.append(charStr[i]);
            }

        }
        return String.valueOf(stringBuilder);
    }

    //8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
    public static void stringBilder8() {
        String s = "fdas1 asdffd2  dfadsf3   asdfasdffdsa6      dsd1 ";
        System.out.println("Line - > " + s);
        //getLongerWord(s);
        System.out.println("Longer line - >" + getCloneLine(s));

    }

    private static String getLongerWord(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLong = String.valueOf(stringBuilder);
        int max = 0;
        int count = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
                stringBuilder.append(str.charAt(i));
                if (count > max) {
                    max = count;
                    strLong = String.valueOf(stringBuilder);
                    //index = i - count;
                } else if (count < max) {
                    stringBuilder.setLength(0);
                }


            }
            count = 0;

        }
        return strLong;
    }

    //9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.
    public static void stringBilder9() {
        String s = "fDas1 asdFfd2  dfaDsf3   aSdfAsdFfdsA6      dsD1 ";
        getCountLetter(s);

    }

    private static void getCountLetter(String str) {
        int lowerLetter = 0;
        int upperLetter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerLetter++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

                upperLetter++;
            }
        }
        System.out.println(" Quantity of low letter " + lowerLetter++);
        System.out.println(" Quantity of upper letter " + upperLetter++);

    }

    //    10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
    public static void stringBilder10() {
        String s = "Line x consists. Of several sentences. Each of which? Ends with! A period per line!";
        int quantity = getQuantitySentens(s);
        System.out.println("Quantity sentense are = > " + quantity);

    }

    private static int getQuantitySentens(String str) {
        int countSent = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                countSent++;
            }
        }

        return countSent;
    }
}

