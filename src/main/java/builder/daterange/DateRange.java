package builder.daterange;

import java.time.LocalDate;

// Implement the Builder pattern
public class DateRange {
    private LocalDate start; // make final
    private LocalDate end; // make final

    // Add a private constructor that takes Builder

    @Override
    public String toString() {
        return start + " to " + end;
    }

    public static class Builder {
        private LocalDate start;
        private LocalDate end;


        // FILL IN CODE

        // In the build method, do a validity checkm to make sure
        // "start" is not after "end"

    }

}