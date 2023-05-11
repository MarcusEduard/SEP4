package com.example.sep4;

public class Queries {
    String updateQuery() {
        String query = String.format("""
                SELECT * from solar_panels."lidt_smadder" \
                """);
        return query;
    }
}
