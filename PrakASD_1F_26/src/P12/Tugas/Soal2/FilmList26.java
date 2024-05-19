package P12.Tugas.Soal2;

public class FilmList26 {
    Film26 head;

    public FilmList26() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return true;
        }
        return false;
    }

    public void addFirst(Film26 film) {
        if (isEmpty()) {
            head = film;
        } else {
            film.next = head;
            head.prev = film;
            head = film;
            System.out.println("Data berhasil ditambahkan pada posisi awal.");
        }
    }

    public void addLast(Film26 film) {
        if (isEmpty()) {
            head = film;
        } else {
            Film26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = film;
            film.prev = current;
        }
    }

    public void addAtIndex(Film26 film, int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(film);
            System.out.println("Data berhasil ditambahkan pada posisi awal.");
        } else {
            Film26 current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            if (current == null) {
                System.out.println("Index tidak valid.");
            } else {
                film.next = current.next;
                if (current.next != null) {
                    current.next.prev = film;
                }
                current.next = film;
                film.prev = current;
                System.out.println("Data berhasil ditambahkan pada indeks " + index);
            }
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Data pertama berhasil dihapus.");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Data terakhir berhasil dihapus.");
            return;
        }
        Film26 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("Data terakhir berhasil dihapus.");
    }

    public void removeAtIndex(int index) {
        if (isEmpty()) {
            return;
        }
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Film26 current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
        System.out.println("Data pada indeks " + index + " berhasil dihapus.");
    }

    public void print() {
        Film26 current = head;
        System.out.println("Daftar Film26:");
        while (current != null) {
            current.printData();
            current = current.next;
        }
    }

    public void searchById(int id) {
        Film26 current = head;
        boolean found = false;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Film dengan ID " + id + " ditemukan:");
                current.printData();
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void sortByRatingDescending() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        Film26 current = head;
        Film26 index = null;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.rating < index.rating) {
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;
                    current.id = index.id;
                    current.judul = index.judul;
                    current.rating = index.rating;
                    index.id = tempId;
                    index.judul = tempJudul;
                    index.rating = tempRating;
                }
                index = index.next;
            }
            current = current.next;
        }
        System.out.println("Daftar film telah diurutkan berdasarkan rating secara DESC.");
        print();
    }
}
