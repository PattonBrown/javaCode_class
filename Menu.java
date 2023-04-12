import java.util.*;

public class Menu {
    //密码有效性检查功能
    public static void checkPasswordValidity() {
        Scanner scanner = new Scanner(System.in);
        String passwordRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[^\\s]{8,15}";
        System.out.println("请设置8到15位密码，不包含空格，必须包含至少一位大写字母、一位小写字母和一位数字");
        while (true) {
            String password = scanner.nextLine();
            if (password.matches(passwordRegex)) {
                System.out.println("密码校验通过");
                break;
            } else {
                System.out.println("密码校验不通过，请重新设置：");
            }
        }
    }

    //表达式求解功能
    public static void solveExpression() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        double num1 = Double.parseDouble(input.substring(4, input.indexOf(",")));
        double num2 = Double.parseDouble(input.substring(input.indexOf(",") + 1, input.lastIndexOf(")")));
        switch (input.substring(0, 3)) {
            case "add" -> output += num1 + num2;
            case "sub" -> output += num1 - num2;
            case "max" -> output += Math.max(num1, num2);
            case "min" -> output += Math.min(num1, num2);
            case "dou" -> output += Double.parseDouble(input.substring(9, input.lastIndexOf(")"))) * 2;
        }
        System.out.println(input + " = " + output);
    }

    //学生成绩统计功能
    public static void scoreStatistics() {
        Scanner scanner = new Scanner(System.in);
        List<String[]> studentInfo = new ArrayList<>();
        System.out.println("请输入学生基本信息，每个学生一行，输入格式为“学号，姓名，性别”，输入end代表输入结束");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                studentInfo.add(input.split("，"));
            }
        }

        List<String[]> scoreInfo = new ArrayList<>();
        System.out.println("请输入学生成绩，每个学生成绩一行，输入格式为“学号，课程名称，成绩”，输入end代表输入结束");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                scoreInfo.add(input.split("，"));
            }
        }

        Map<String, Map<String, List<Double>>> studentScore = new HashMap<>();
        for (String[] student : studentInfo) {
            studentScore.put(student[0], new HashMap<>());
        }
        for (String[] score : scoreInfo) {
            String id = score[0];
            String course = score[1];
            double scoreValue = Double.parseDouble(score[2]);
            Map<String, List<Double>> courseScore = studentScore.get(id);
            if (courseScore.containsKey(course)) {
                courseScore.get(course).add(scoreValue);
            } else {
                List<Double> scoreList = new ArrayList<>();
                scoreList.add(scoreValue);
                courseScore.put(course, scoreList);
            }
        }

        System.out.println("按学生统计：");
        System.out.printf("%-6s%-6s%-6s%s%n", "学号", "姓名", "性别", "平均分");
        for (String[] student : studentInfo) {
            String id = student[0];
            String name = student[1];
            String gender = student[2];
            double averageScore = 0;
            int courseCount = 0;
            Map<String, List<Double>> courseScore = studentScore.get(id);
            for (Map.Entry<String, List<Double>> entry : courseScore.entrySet()) {
                List<Double> scoreList = entry.getValue();
                double sum = 0;
                for (double score : scoreList) {
                    sum += score;
                }
                averageScore += sum / scoreList.size();
                courseCount += 1;
            }
            if (courseCount > 0) {
                averageScore /= courseCount;
            }
            System.out.printf("%-6s%-6s%-6s%.2f%n", id, name, gender, averageScore);
        }

        System.out.println("按课程统计：");
        System.out.printf("%-6s%s%n", "课程", "平均分");
        Set<String> courseSet = new HashSet<>();
        for (String[] score : scoreInfo) {
            courseSet.add(score[1]);
        }
        for (String course : courseSet) {
            double averageScore = 0;
            int studentCount = 0;
            for (Map.Entry<String, Map<String, List<Double>>> entry : studentScore.entrySet()) {
                Map<String, List<Double>> courseScore = entry.getValue();
                if (courseScore.containsKey(course)) {
                    List<Double> scoreList = courseScore.get(course);
                    double sum = 0;
                    for (double score : scoreList) {
                        sum += score;
                    }
                    averageScore += sum / scoreList.size();
                    studentCount += 1;
                }
            }
            if (studentCount > 0) {
                averageScore /= studentCount;
            }
            System.out.printf("%-6s%.2f%n", course, averageScore);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择以下功能（1-4）：");
            System.out.println("1.密码有效性检查");
            System.out.println("2.运算表达式求解");
            System.out.println("3.学生成绩统计");
            System.out.println("4.退出");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> checkPasswordValidity();
                case "2" -> {
                    System.out.println("请输入运算表达式（格式例如：add(53.1,31.2)）：");
                    solveExpression();
                }
                case "3" -> scoreStatistics();
                case "4" -> {
                    System.out.println("退出程序");
                    System.exit(0);
                }
                default -> System.out.println("无效的输入，请重新输入");
            }
        }
    }
}
