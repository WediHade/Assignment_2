package Assignment6;

public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }

    public String get(char c) {
        int index = getIndex(c);
        if (index != -1 && entries[index] != null) {
            return entries[index].str;
        }
        return null;
    }

    public void add(char c, String s) {
        int index = getIndex(c);
        entries[index] = new Entry(c, s);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }
    private int getIndex(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        return -1; //
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }
        public String toString() {
            return ch + "->" + str;
        }
    }
}

