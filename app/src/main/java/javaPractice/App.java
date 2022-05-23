/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaPractice;

import java.io.*;
import java.math.BigDecimal;
import java.nio.Buffer;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        double a=0.03;
        double b=0.04;
        double c=b-a;

        System.out.println(c);

        // Iterators();
       // filesPracticesBuffer();
        //System.out.println(   commonWord("No. Try not. Do or do not. There is no try."));
    }


    public static void OOP() {


        square seq1 = new square("sequar1", 10);
        shape seq2 = new square("seq2", 5);

        circle circle1 = new circle("c1", 2);


        System.out.println(seq1.area());


        System.out.println(seq1.area());
        System.out.println("please input the nme os circle :");
        Scanner circleInputName = new Scanner(System.in);
        String name = circleInputName.nextLine();

        System.out.println("please input the radius  os circle :");
        Scanner circleInput = new Scanner(System.in);
        int raduies = circleInput.nextInt();

        if (raduies < 0) {
            throw new ArithmeticException("ERROR RADUIES ");
        }

        System.out.println("name is " + name);

        System.out.println("kiddies is " + raduies);


        System.out.println("area is " + circle.area(raduies));

    }


    public static void Exception() {

        try {

            System.out.println("please input the nme os circle :");
            Scanner circleInputName = new Scanner(System.in);
            String name = circleInputName.nextLine();

            System.out.println("please input the radius  os circle :");
            Scanner circleInput = new Scanner(System.in);
            int raduies = circleInput.nextInt();

            shape circle2 = new circle(name, raduies);

        } catch (ArithmeticException e) {
            System.out.println("Еrror: division by zero");
        } catch (InputMismatchException e) {
            System.out.println("	Error: wrong value type");

        }

    }


    public static void arrayList() {
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number.add(1);
        Number.add(10);
        Number.add(8);
        Number.add(2);
        Number.add(7);
        Number.add(2);

        Number.remove(1);

        System.out.println(Number);

        Collections.sort(Number);

        System.out.println(Number.stream().map(s -> s + 1).collect(Collectors.toList()));

        System.out.println(Number.stream().filter(s -> s > 5).collect(Collectors.toList()));

        System.out.println(Number.stream().filter(s -> s > 5).map(s -> s + 2).collect(Collectors.toList()));

        System.out.println(Number.stream().limit(2).collect(Collectors.toList()));
        System.out.println(Collections.min(Number));

    }


    // string practise

    public static String commonWord(String the) {
        HashMap<String, Integer> hashMap = new HashMap();


        the = the.toLowerCase(Locale.ROOT).replace('.', ' ');
        the = the.replace("  ", " ");
        String[] arr = the.split(" ");
        for (String word : arr) {
            hashMap.computeIfPresent(word, (k, v) -> v + 1);
            hashMap.computeIfAbsent(word, (v) -> 1);
        }

        int max = Collections.max(hashMap.values());

        for (String k : hashMap.keySet()) {
            if (max == hashMap.get(k)) {
                return k;
            }

        }
        return null;
    }


    //An Iterator is an object that enables to cycle through a collection, obtain or remove elements.
//hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
// next(): Returns the next object and advances the iterator.
// remove(): Removes the last object that was returned by next from the collection.
    public static void Iterators() {
        List<String> data = new ArrayList<String>();
        data.add("one");
        data.add("two");
        data.add("thee");
        data.add("fore");
        data.add("five");
        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }


    }
// scanner for word by word
    // buffer for line by line
//    The Scanner class inherits from the Iterator, so it behaves like one.
//    We can use the Scanner object's next() method to read the file's contents.
//    The file's contents are output word by word, because the next() method returns each word separately.


//    The format() method formats its parameters according to its first parameter.
//     %s mean a string and get's replaced by the first parameter after the format. The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces.
//     Note: \r\n is the newline symbol in Windows.
//    The code above creates a file with the following content:

    public static void filesPractices() throws FileNotFoundException {

        File ExistFile = new File("README.md");
        System.out.println(ExistFile.exists());
        Formatter newFile = new Formatter("newFile.md");

        try {
            Scanner fileReder = new Scanner(ExistFile);
            while (fileReder.hasNext()) {
                String LINE = fileReder.next() + "\n";
                newFile.format("%s ", LINE, " \n");
            }
            newFile.close();

            fileReder.close();
        } catch (FileNotFoundException e) {

        }

    }


    public static void filesPracticesBuffer() throws IOException {
        Formatter newFile= new Formatter("BufferFile.md");// to create file
        File EXISTFILE=new File("README.md");// to open exist file

        FileReader RederFile=new FileReader(EXISTFILE); // to  proper file to read
        BufferedReader bufferReder=new BufferedReader(RederFile); //to sore file temporary on buffer to read it
        String Line= bufferReder.readLine(); // to read line

        while (Line!=null){
            newFile.format(Line+"\n");
            Line=bufferReder.readLine();

        }
        newFile.close();

    }



    }







