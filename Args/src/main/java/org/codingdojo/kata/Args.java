package org.codingdojo.kata;

import java.util.HashMap;

public class Args {
    private String argsStr;
    public HashMap<String, String> pair;

    public Args(String argsStr) {
        pair = new HashMap<>();
        this.argsStr = argsStr;
        getArgsPair();
    }

    public int argsCount() {
        return pair.size();
    }

    public void getArgsPair() {
        String[] argsList = argsStr.split(" ");
        for (int i = 0; i < argsList.length; i++) {
            if (argsList[i].startsWith("-")) {
                if (!argsList[i+1].startsWith("-")) {
                    pair.put(argsList[i], argsList[i + 1]);
                    i += 1;
                } else {
                    pair.put(argsList[i], "");
                }
            }
        }
    }

    public boolean get(String item) {
        System.out.println("PAIR" + pair);
        if (item.equals("log")) {
            if (pair.containsKey("-l") && pair.get("-l").isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
