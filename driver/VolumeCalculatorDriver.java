package driver;

import java.util.Scanner;

import model.*;

public class VolumeCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuboid cuboid = new Cuboid(4, 5, 6);
        Sphere sphere = new Sphere(3);
        Cylinder cylinder = new Cylinder(4, 5);

        System.out.println("Pilih jenis bangun ruang (0: Balok, 1: Bola, 2: Tabung): ");
        int choice = scanner.nextInt();
        ShapeType shapeType = null;

        switch (choice) {
            case 0:
                shapeType = ShapeType.CUBOID;
                break;
            case 1:
                shapeType = ShapeType.SPHERE;
                break;
            case 2:
                shapeType = ShapeType.CYLINDER;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (shapeType == ShapeType.CUBOID) {
            System.out.println("Volume Balok: " + calculateVolume(cuboid));
        } else if (shapeType == ShapeType.SPHERE) {
            System.out.println("Volume Bola: " + calculateVolume(sphere));
        } else if (shapeType == ShapeType.CYLINDER) {
            System.out.println("Volume Tabung: " + calculateVolume(cylinder));
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    private static double calculateVolume(VolumeShape shape) {
        return shape.calculateVolume();
    }
}
