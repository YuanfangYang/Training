import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int[] input1 = {5, 6, 14, 7};
        String[] input2 = {"Add", "Sub", "Div"};

        System.out.println("Result: " + calculate(input1, input2));
    }

    public static int calculate(int[] nums, String[] ops) {
        List<Integer> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        for (int num : nums) {
            numbers.add(num);
        }
        for (String op : ops) {
            operators.add(op);
        }

        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i).equals("Div")) {
                numbers.set(i, numbers.get(i) / numbers.get(i + 1));
                numbers.remove(i + 1);
                operators.remove(i);
                i--;
            }
        }


        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i).equals("Add")) {
                result += numbers.get(i + 1);
            } else if (operators.get(i).equals("Sub")) {
                result -= numbers.get(i + 1);
            }
        }
        return result;
    }
}

