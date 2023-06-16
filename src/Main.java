// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = examplesArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length>; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println(index);
        }
    }