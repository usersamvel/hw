package edu.hw3;

import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    final static String ASC = "ASC";
    final static String DESC = "DESC";

    String swap(String nameSurname) {
        int spaces = 0;
        String name = "";
        String surname = "";
        for (char ch : nameSurname.toCharArray()) {
            if (!Character.isLetter(ch) && ch != ' ') {
                throw new IllegalArgumentException();
            } else if (Character.isLetter(ch)) {
                switch (spaces) {
                    case 0:
                        name += ch;
                        break;
                    case 1:
                        surname += ch;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } else {
                ++spaces;
            }
        }
        return surname + ' ' + name;
    }

    public String[] parseContacts(String[] contacts, String trend) {
        if (contacts == null) {
            return new String[] {};
        }
        if (!trend.equals(ASC) && !trend.equals(DESC)) {
            throw new IllegalArgumentException();
        }
        int len = contacts.length;
        String[] changed = new String[len];
        for (int i = 0; i < len; ++i) {
            changed[i] = swap(contacts[i]);
        }
        if (trend.equals(ASC)) {
            Arrays.sort(changed);
        } else {
            Arrays.sort(changed, Collections.reverseOrder());
        }
        for (int i = 0; i < len; ++i) {
            changed[i] = swap(changed[i]);
        }
        return changed;
    }
}
