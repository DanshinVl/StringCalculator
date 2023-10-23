
public class CalculateText {
    String firstValue;
    String secondValue;
    char operand;

    public CalculateText(String a, String b, char c) {
        this.firstValue = a;
        this.secondValue = b;
        this.operand = c;

    }

    public String calc(String firstValue, String secondValue, char action) {

        String result = "";

        if(action == '+') {
            result = firstValue + secondValue;
        } else if(action == '*') {
            String x = String.valueOf(secondValue);
           int mul = Integer.parseInt(x);
            result = "";
            if(mul < 1 || mul > 10) {
                throw new RuntimeException("введите число от 1 до 10");
            }
            for (int i = 0; i<mul; i++) {
                result += firstValue;
            }
            } else if(action == '-') {
            String resul;
                int index = firstValue.indexOf(secondValue);
                if(index == -1) {
                    return firstValue;
                } else {
                    String res = firstValue.substring(0, index);
                    res += firstValue.substring(index + secondValue.length());
                    resul = res;
                    return resul;
                }
            } else {
            int x = firstValue.length()/Integer.parseInt(secondValue);
            if(x < 1 || x > 10) {
                throw new RuntimeException("введите число от 1 до 10");
            }
            String res = firstValue.substring(0,x);
            return res;
        }
        if (result.length() > 40) {
            return result.substring(0,40) + "...";
        } else {
            return result;
        }
    }


    }
