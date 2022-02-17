package test7_13.Sys;

import test7_13.command.Command;

import java.util.ArrayList;
import java.util.HashMap;


public class sysCommand {
    String v, n,na;
    int valu = 0;
    int inde = 0;
    HashMap<Integer, Heets> hm = new HashMap<Integer, Heets>();
    isItNum is = new isItNum();
    static int preIndex = 1;
    public void mov(ArrayList<Command> arl, int index) {
        v = arl.get(index).getVariableName();
        n = arl.get(index).getValue();

        hm.put(preIndex, new Heets(v, Integer.parseInt(n)));
        preIndex++;

    }

    public void add(ArrayList<Command> arl, int index) {
        v = arl.get(index).getVariableName();
        n = arl.get(index).getValue();

        for (int i = 1; i < hm.size()+1; i++) {
            if (hm.get(i).getKeys().equals(v)) {
                inde = i;
                na = hm.get(i).getKeys();
                if (is.itnum(n)) {
                    valu = hm.get(i).getValue() + Integer.parseInt(n);
                    break;
                } else {
                    int bre = 0;
                    for (int j = 1; j < hm.size()+1; j++) {
                        if (hm.get(j).getKeys().equals(n)) {
                            valu = hm.get(i).getValue() + hm.get(j).getValue();
                            bre++;
                            break;
                        }
                        if (bre == 1) {
                            break;
                        }
                    }
                }
            }
        }
        hm.put(inde, new Heets(na, valu));
    }

    public void sub(ArrayList<Command> arl, int index) {
        v = arl.get(index).getVariableName();
        n = arl.get(index).getValue();
        for (int i = 1; i < hm.size()+1; i++) {
            if (hm.get(i).getKeys().equals(v)) {
                inde = i;
                na = hm.get(i).getKeys();
                if (is.itnum(n)) {
                    valu = hm.get(i).getValue() - Integer.parseInt(n);
                    break;
                } else {
                    int bre = 0;
                    for (int j = 1; j < hm.size()+1; j++) {
                        if (hm.get(j).getKeys().equals(n)) {
                            valu = hm.get(i).getValue() - hm.get(j).getValue();
                            bre++;
                            break;
                        }
                        if (bre == 1) {
                            break;
                        }
                    }
                }
            }
        }
        hm.put(inde, new Heets(na, valu));
    }

    public int jn0(ArrayList<Command> arl, int index) {
        String jn = arl.get(index).getVariableName();

        for (int i = 1; i < hm.size()+1; i++) {
            if (hm.get(i).getKeys().equals(jn)) {
                if (hm.get(i).getValue() != 0) {
                    return Integer.parseInt(arl.get(index).getValue()) - 1;
                }
            }
        }
        return index;
    }

    public void prt(ArrayList<Command> arl, int index) {
        v = arl.get(index).getVariableName();
        n = arl.get(index).getValue();

        if (!hm.containsKey(v)) {
            preIndex++;
        }
        hm.put(0, new Heets(v, Integer.parseInt(n)));
    }

    public int size() {
        return hm.size();
    }


    public String toString(int i) {
        if (i == 0) {
            return "[ prt "
                    + hm.get(i).getKeys() + " "
                    + hm.get(i).getValue() + " ]";
        }
        return hm.get(i).getKeys().toUpperCase() + ": " + hm.get(i).getValue();
    }
}
