import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws Exception {
        int a = 1;
        // test commit and push

        String imageURL = "http://www.avajava.com/images/avajavalogo.jpg";
        String destinationFile = "image.jpg";

        saveImage(imageURL, destinationFile);

        for (int i = 0; i < 15; i++)
            System.out.println(ScreenshotAddress(20));
    }

    // A Java program generating a random LetterNumber String
    // using Math.random() method
    public static String ScreenshotAddress(int a) { // function to generate a random string of length a
        String LetterNumber = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < a; i++) {
            int index = (int) (LetterNumber.length() * Math.random());
            s.append(LetterNumber.charAt(index)); // add character(знак) one by one in end
        }
        return "https://screen" + s.toString();
    }

    public static void saveImage(String imageURL, String destinationFile) throws Exception { // function save an image using a URL
        URL url = new URL(imageURL);
        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("C:/Users/Влад/IdeaProjects/image/image1.jpg");
        //Files.copy(in, Parth.get("C:/Users/Влад/IdeaProjects/image.jpg"));
        byte[] b = new byte[2048];
        int length;

        while ((length = in.read(b)) != -1) { // Allocate(виділяємо) memory for the image
            out.write(b, 0, length);
        }
        in.close();
        out.close();
    }


}