package ua.opnu;

class BookData implements Comparable<BookData> {

    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    private double getRating() {
        return reviews == 0 ? 0 : total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        double r1 = this.getRating();
        double r2 = other.getRating();

        if (r1 != r2)
            return Double.compare(r2, r1); // Більший рейтинг → менше

        return this.title.compareTo(other.title);
    }
}

