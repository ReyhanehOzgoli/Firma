import java.time.Month;

public class Birthday {

    private final int year;
    private final Month month;
    private final int day;

    public Birthday(int year, Month month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        validateDate();
    }

    private void validateDate() {
        boolean isValid = true;

        if (year < 0) {
            isValid = false;
        }

        if(day < 1 || day > month.maxLength()){
            isValid = false;
        }

        if (!isValid) {
            throw new IllegalArgumentException("Ungültiges Datum");
        }
    }



    public int getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
