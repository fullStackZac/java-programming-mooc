import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharychildress
 */
public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birdList.add(bird);

    }

    public void printBirdDatabase() {
        for (Bird e : birdList) {
            System.out.println(e);
        }

    }

    public void printBird(String name) {
        for (Bird e : birdList) {
            if (e.getName().equals(name)) {
                System.out.println(e);
            }
        }
    }

    //probably a better way to do this.
    public void addObservationFromDB(String name) {
        for (Bird e : birdList) {
            if (e.getName().toLowerCase().equals(name.toLowerCase())) {
                e.addObservation();
            }

        }

    }

}