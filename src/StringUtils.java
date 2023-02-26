public class StringUtils {
        /** 
         * Compares two strings s1 and s2 based on whether they 
         * include the letter "e".
         * 
         * @param s1 One of two strings to be compared
         * @param s2 One of two strings to be compared
         * @return 1 if s2 contains "e" and s1 does not, -1 if s1 contains "e" and s2 does not, 0 if both do or do not contain "e".
         */
        public static int eChecker(String s1, String s2) {
                if ( !s1.contains("e") && s2.contains("e") ) { return 1; } 
            else if ( s1.contains("e") && !s2.contains("e") ) { return -1; } 
            else { return 0; }
        }
}
