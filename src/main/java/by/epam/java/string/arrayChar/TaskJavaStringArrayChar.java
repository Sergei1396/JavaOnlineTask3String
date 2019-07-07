package by.epam.java.string.arrayChar;

public class TaskJavaStringArrayChar {
    public static void main(String[] args) {
//        Работа со строкой как с массивом символов
//        1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
//        stringArrayChar1();
//        2. Замените в строке все вхождения 'word' на 'letter'.
//        stringArrayChar2();
//3. В строке найти количество цифр.
//        stringArrayChar3();
//        4. В строке найти количество чисел.
//        stringArrayChar4();
//        5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
//        заменить на одиночные пробелы. Крайние пробелы в строке удалить.
        stringArrayChar5();
    }

    //        1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    public static void stringArrayChar1() {
        String[] camalCase = {"camelCase1", "camelCase2", "camelCase3", "camelCase4"};
        char[] snake_case = "snake_case".toCharArray();
        char[][] camalCaseChar = new char[][]{"camelCase1".toCharArray(), "camelCase2".toCharArray(), "camelCase3".toCharArray(), "camelCase4".toCharArray()};
        System.out.println("Old expretion - >" + camalCase.toString());
        System.out.println("New expretion = >");
        convertCase(camalCaseChar, snake_case);
    }

    public static void convertCase(char[][] camalCaseChar, char[] snake_case) {
        int count = 0;
        for (int i = count; i < camalCaseChar.length; i++) {

            for (int j = 0; j < snake_case.length; j++) {
                char temp = snake_case[j];
                snake_case[j] = camalCaseChar[i][j];
                camalCaseChar[i][j] = temp;
                System.out.print(camalCaseChar[i][j]);
            }
            count += snake_case.length;
            System.out.println();
        }
    }

    //2. Замените в строке все вхождения 'word' на 'letter'.
    public static void stringArrayChar2() {
        String str = "Replace all occurrences of word in string with letter";
        char[] strChar = str.toCharArray();
        System.out.print("The old line - >" + str.toString());
        System.out.println("\n The new line - >");
        exchange(strChar);
        outPutChar(strChar);

    }

    public static void outPutChar(char[] arrayChar) {
        for (char c : arrayChar) {
            System.out.print(c);
        }

    }

    public static void exchange(char[] strChar) {
        char[] arrayChar = "letter".toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == 'w' && strChar[i + 1] == 'o' && strChar[i + 2] == 'r' && strChar[i + 3] == 'd') {
                for (int j = 0; j < arrayChar.length; j++) {
                    strChar[i] = arrayChar[j];
                    i++;
                }
            }
        }
    }

    //3. В строке найти количество цифр.
    public static void stringArrayChar3() {
        String str = "a0sfd12 ghasdg3 hg4hghh5";
        char[] strChar = str.toCharArray();
        int countNumber = 0;
        outPutChar(strChar);
        for (int i = 0; i < strChar.length; i++) {

            if (strChar[i] >= 48 && strChar[i] <= 57) {
                countNumber++;
            }
        }
        System.out.println("\n Number of digits per line = >" + countNumber);
    }

    //        4. В строке найти количество чисел.
    public static void stringArrayChar4() {
        String str = "as6fd12 ghasdg3 hg4hghhk";
        char[] strChar = str.toCharArray();
        int countNumber = 0;
        outPutChar(strChar);
        for (int i = 1; i < strChar.length; i++) {

            if (strChar[i - 1] >= 48 && strChar[i - 1] <= 57) {
                if (strChar[i] >= 48 && strChar[i] <= 57) {
                    i++;
                    countNumber++;
                } else {
                    countNumber++;
                    i++;
                }

            }
        }
        System.out.println("\n Count of numbers per line = >" + countNumber);

    }
    //5. Удалить в строке все лишние пробелы,
    // то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
    public static void stringArrayChar5(){
        char[] line1 = "  a0sfd12  ghasdg3  hg4hghh5  ".toCharArray();
        char[] line2 = "a0sfd12 ghasdg3 hg4hghh5".toCharArray();

        System.out.println("Line1: <" + new String(line1) + ">");
        System.out.println("Line2: <" + new String(line2) + ">");

        line1 = removeSpaces(line1);
        line2 = removeSpaces(line2);

        System.out.println("New line1: <" + new String(line1) + ">");
        System.out.println("New line2: <" + new String(line2) + ">");
    }
    public static char[] removeSpaces(char[] source) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == ' ') {
                int s = 0;
                do {
                    i++;
                    s++;
                } while (i < source.length && source[i] == ' ');
                if (s > 1) {
                    source = remove(source, i - s, i - 1);
                    i = i - s + 1;
                }
            }
        }
        if (source[0] == ' ') {
            source = remove(source, 0, 1);
        }
        if (source[source.length - 1] == ' ') {
            source = remove(source, source.length - 1, source.length);
        }
        return source;
    }
    public static char[] remove(char[] source, int start, int end) {
        char[] t = new char[source.length - (end - start)];

        for (int i = 0; i < start; i++) {
            t[i] = source[i];
        }

        for (int i = end; i < source.length; i++) {
            t[i - (end - start)] = source[i];
        }
        return t;
    }
}

