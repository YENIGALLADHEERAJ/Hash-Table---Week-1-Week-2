class HashTableApp {

    static class HashTable {
        String[] keys = new String[10];
        String[] values = new String[10];

        int hash(String key) {
            return key.length() % 10;
        }

        void put(String key, String value) {
            int index = hash(key);
            keys[index] = key;
            values[index] = value;
        }

        void get(String key) {
            int index = hash(key);

            if (keys[index] != null && keys[index].equals(key)) {
                System.out.println("Value = " + values[index]);
            } else {
                System.out.println("Key not found");
            }
        }
    }

    public static void main(String[] args) {

        HashTable ht = new HashTable();

        ht.put("101", "Dheeraj");
        ht.put("102", "Krishna");
        ht.put("103", "Shritan");

        ht.get("102");
    }
}