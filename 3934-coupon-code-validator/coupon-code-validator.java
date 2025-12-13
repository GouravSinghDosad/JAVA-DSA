import java.util.*;
import java.util.stream.Collectors;

class Solution {

    private static final Set<String> VALID_BUSINESS_LINES = Set.of(
        "electronics", "grocery", "pharmacy", "restaurant"
    );

    // Map to assign ranking for custom sorting order
    private static final Map<String, Integer> BUSINESS_LINE_RANK = Map.of(
        "electronics", 1,
        "grocery", 2,
        "pharmacy", 3,
        "restaurant", 4
    );

    /**
     * Checks if a code string is non-empty and contains only alphanumeric chars and underscores.
     */
    private boolean isCodeValid(String code) {
        if (code == null || code.isEmpty()) {
            return false;
        }
        for (char c : code.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                return false;
            }
        }
        return true;
    }

    // RENAMED AND CHANGED RETURN TYPE: Now returns List<String>
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        
        List<Coupon> validCoupons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Validation Checks
            if (!isActive[i]) continue;

            String currentBusinessLine = businessLine[i];
            if (!VALID_BUSINESS_LINES.contains(currentBusinessLine)) continue;

            String currentCode = code[i];
            if (!isCodeValid(currentCode)) continue;
            
            validCoupons.add(new Coupon(currentCode, currentBusinessLine));
        }

        // Custom Sort Logic
        validCoupons.sort(new Comparator<Coupon>() {
            @Override
            public int compare(Coupon c1, Coupon c2) {
                // Primary Sort: Business Line Rank
                int rank1 = BUSINESS_LINE_RANK.get(c1.businessLine);
                int rank2 = BUSINESS_LINE_RANK.get(c2.businessLine);

                if (rank1 != rank2) {
                    return Integer.compare(rank1, rank2);
                } else {
                    // Secondary Sort: Code Lexicographical (Ascending)
                    return c1.code.compareTo(c2.code);
                }
            }
        });

        // Convert the sorted List of Coupon objects into a List of String codes (the expected return type)
        return validCoupons.stream()
                           .map(c -> c.code)
                           .collect(Collectors.toList());
    }
    
    // Helper class to group the necessary information for sorting
    private static class Coupon {
        String code;
        String businessLine;

        public Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}