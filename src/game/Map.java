package game;

public class Map {

    private Room startRoom;

    public void buildMap() {
        // Create rooms
        // Room 1
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        room1.addItem("an old rusty flashlight");
        room1.addItem("a crinkly paper map with a big X in the middle", "map");

        // Room 2
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");

        // Room 3
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        room3.addItem("a wicker bird cage");

        // Room 4
        Room room4 = new Room("Wet cave", "large dark cave - the floor is quite wet and slippery here.");

        // Room 5
        Room room5 = new Room("Treasure cave", "small dark cave with apparently only a single opening");

        // Room 6
        Room room6 = new Room("[Room 6]", "[No text for Room 6 yet]");

        // Room 7
        Room room7 = new Room("[Room 7]", "[No text for Room 7 yet]");

        // Room 8
        Room room8 = new Room("Mellon cave", "small stony path next to the dark lake. A small door seems to be carved into the rock-face");

        // Room 9
        Room room9 = new Room("[Room 9]", "[No text for Room 9 yet]");


        // Connect rooms
        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);
        room2.setEastRoom(room3);
        room3.setSouthRoom(room6);
        room4.setSouthRoom(room7);
        room9.setWestRoom(room8);
        room8.setNorthRoom(room5);
        room6.setSouthRoom(room9);
        room7.setEastRoom(room8);

        startRoom = room1;
    }

    public Room getStartRoom() {
        return startRoom;
    }
}
