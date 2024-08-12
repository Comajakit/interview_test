package org.example.solution;

public class SmileyFace {
    public static int countSmiley(String[] input){
        try{
            // for this problem I will assume that length of each face will be either 2 or 3
            char[] eyes = {':',';'};
            char[] noses = {'-','~'};
            char[] mounts = {'D',')'};

            int result = 0;

            for (String s : input) {
                char[] face = s.toCharArray();
                boolean foundEye = false;
                boolean foundNose = false;
                boolean foundMount = false;
                switch (face.length) {
                    case 2:

                        // check eye
                        for (char eye : eyes) {
                            if (eye == face[0]) {
                                foundEye = true;
                                break;
                            }
                        }
                        if (!foundEye) {
                            continue;
                        }

                        // check mount
                        for (char mount : mounts) {
                            if (mount == face[1]) {
                                foundMount = true;
                                break;
                            }
                        }
                        if (foundMount) {
                            result++;
                        }
                        break;
                    case 3:
                        // check eye
                        for (char eye : eyes) {
                            if (eye == face[0]) {
                                foundEye = true;
                                break;
                            }
                        }
                        if (!foundEye) {
                            continue;
                        }
                        // check nose
                        for (char nose : noses) {
                            if (nose == face[1]) {
                                foundNose = true;
                                break;
                            }
                        }
                        if (!foundNose) {
                            continue;
                        }
                        // check mount
                        for (char mount : mounts) {
                            if (mount == face[2]) {
                                foundMount = true;
                                break;
                            }
                        }
                        if (foundMount) {
                            result++;
                        }
                        break;
                    default:
                }
            }
            return result;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }

    }
}
