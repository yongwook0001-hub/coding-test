package leetcode;

class Solution {
    public String convert(String s, int numRows) {

        if(numRows ==1 || numRows >= s.length())
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int countRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()){
            rows[countRow].append(c);

            if(countRow == 0 || countRow == numRows -1 ){
                goingDown = !goingDown;
            }

            countRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        //0.0 0.1 0.2 0.3
        //1.0 1.1 1.2 1.3
        //2.0 2.1 2.2 2.3
        //3.0 3.1 3.2 3.3

        return result;
    }
}
