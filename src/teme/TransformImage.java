package teme;

import ro.scoalainformala.image.ImageTransformation;

import java.util.Scanner;


public class TransformImage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please download an image file ");
        System.out.println("Please enter the absolute path to downloaded file (eg C\\Users\\file\\...)");
        String temp = sc.nextLine();
        System.out.println("Please enter the name of file ");
        String fileName = sc.nextLine();
        String location = temp.replace("\\", "\\\\") + "\\";
        String transformedName = "img2.png"; // it should be implemented as a regex
        System.out.println("Please enter rotation degree");
        int degrees = sc.nextInt();
        ImageTransformation.rotate(location + fileName, location + transformedName, degrees);
        System.out.println("You can find your  image at " + location.replace("\\\\", "\\") + transformedName);
    }
}
