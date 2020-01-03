package recursion;

/**
 * The Towers of Hanoi is a mathematical puzzle. It consists of three rods (or pegs or
 * towers) and a number of disks of different sizes which can slide onto any rod. The puzzle starts
 * with the disks on one rod in ascending order of size, the smallest at the top, thus making a conical
 * shape. The objective of the puzzle is to move the entire stack to another rod, satisfying the
 * following rules:
 * • Only one disk may be moved at a time.
 * • Each move consists of taking the upper disk from one of the rods and sliding it onto
 * another rod, on top of the other disks that may already be present on that rod.
 * • No disk may be placed on top of a smaller disk.
 */
public class TowersOfHanoi {

    public void solveTowersOfHanoi(int numDisks, String fromPegName, String toPegName, String auxPegName) {
        // if only 1 disk, make final move from peg A to C and return
        if (numDisks == 1) {
            System.out.println(
                    "Moving disk from peg: "
                            + fromPegName
                            + " to peg: "
                            + toPegName
                            + ". And Done.");
            return;
        }

        // else move top n-1 disks from fromPeg/A to toPeg/C using auxPeg/B as auxiliary/intermediary
        solveTowersOfHanoi(numDisks - 1, fromPegName, auxPegName, toPegName);
        // and move, remaining (last one in the bottom) from fromPeg to toPeg
        System.out.println(
                "Moving last disk from peg: "
                        + fromPegName
                        + " to peg: "
                        + toPegName);

        // move those n-1 disks from auxiliary/intermediary/B peg to to/final/C peg
        solveTowersOfHanoi(numDisks - 1, auxPegName, toPegName, fromPegName);
    }

    public static void main(String[] args) {
        var towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.solveTowersOfHanoi(3, "A", "B", "C");
    }
}
