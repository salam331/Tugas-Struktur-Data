package HASHTABLE;

class MyHash1 {

    int maxSize; //Maksimum dari tabel hash
    int[] array; //Untuk menyimpan elemen-elemen tabel hash

    // Konstruktor
    public MyHash1(int maxSize) {
        this.maxSize = maxSize; // Konstruktor untuk inisialisasi table hash ukuran maksimum
        this.array = new int[maxSize]; // Membuat array integer dengan ukuran maksimum yang diberikan
    }

    // Method menghitung indeks untuk data yang diberikan
    public int hashFunction(int data) {
        return data % maxSize; // Operasi modulo sederhana untuk mendapatkan indeks
    }

    // Method untuk memasukkan atau menambahkan data baru
    public void insert(int newData) {
        int index = hashFunction(newData); // Menghitung indeks untuk data baru
        array[index] = newData; // Memasukkan data ke indeks yang dihitung
    }

    // Method untuk menghapus data
    public int remove(int data) {
        int result = 0; // Variabel untuk menyimpan data yang dihapus
        int index = hashFunction(data); // Menghitung indeks untuk data yang akan dihapus
        result = array[index]; // Menyimpan data yang akan dihapus
        array[index] = 0; // Menghapus data dengan mengatur nilai pada indeksnya menjadi 0
        return result; // Mengembalikan data yang dihapus
    }

    // Method untuk mencari data
    public int find(int data) {
        int result = 0; // Variabel untuk menyimpan data yang ditemukan
        int index = hashFunction(data); // Menghitung indeks untuk data yang akan dicari
        result = array[index]; // Menyimpan data yang ditemukan
        return result; // Mengembalikan data yang ditemukan
    }

    // Method untuk menampilkan elemen
    public void display(){
        for(int i=0; i<maxSize; i++){ // Melakukan iterasi melalui array
            if(array[i]!=0){ // Memeriksa apakah elemennya tidak 0 (menunjukkan keberadaan data)
                System.out.print(array[i]+" "); // Mencetak elemen
            }
        }
    }
}

public class DasarHash1 {

    public static void main(String[] args) {
        MyHash1 my = new MyHash1(10); // Membuat instance (ukuran max 10)
        my.insert(10); // Elemen 10
        my.insert(5);  // Elemen 5
        my.insert(3);  // Elemen 3

        my.remove(3); // Menghapus elemen 3 dari tabel hash

        System.out.println(my.find(5)); // Mencari dan mencetak elemen 5 dari tabel hash
        System.out.println(my.find(1)); // Mencari dan mencetak elemen 1 dari tabel hash
        my.display(); // Menampilkan elemen-elemen tabel hash
    }
}
