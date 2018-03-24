package classes.chapterNo3;

public class NestedSwitchInstruction {
    public static void main(String args[]) {
        int i;

        for (i = 0; i <= 6; i++)
            switch (i){
                case 1:
                    System.out.println("the i var depends on external switch instruction");
                    switch (i){
                        case 1:
                        System.out.println("the i var now depends on internal switch instruction - no conflict occurs");

                    }
            }
    }
}
