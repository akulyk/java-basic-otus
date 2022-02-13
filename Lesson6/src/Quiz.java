import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, выберите правильные варианты ответов");
        String[] questions = getQuestions();
        String[][] variants = getVariants();
        Integer[] answers = getAnswers();
        int questionsCount = questions.length;
        int correctAnswersCount = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < variants[i].length; j++) {
                System.out.println((j + 1) + ". " + variants[i][j]);
            }
            int answer = sc.nextInt() - 1;
            String correctAnswer = variants[i][answers[i]];
            String result;
            if (answer == answers[i]) {
                correctAnswersCount++;
                result = "Ответ верный";
            } else {
                result = "Ответ не верный";
                System.out.println("Верный ответ: " + correctAnswer);
            }
            System.out.println(result);
            System.out.println();

        }
        System.out.println("Спасибо за ваши ответы");
        if (0 == correctAnswersCount) {
            System.out.println("Вы не ответили ни на один вопрос");
        } else if (correctAnswersCount < questionsCount) {
            System.out.println("Вы ответили правильно на " + correctAnswersCount + " вопроса из " + questionsCount);
        } else {
            System.out.println("Вы ответили правильно на все вопросы");
        }
    }

    private static String[] getQuestions() {
        return new String[]{
                "Какой сейчас год?",
                "Кто создал автомобиль Tesla",
                "Кто владелец Amazon?",
                "Как теперь называется компания Цукурберга"
        };
    }

    private static String[][] getVariants() {
        return new String[][]{
                {"2020", "2021", "2022"},
                {"Илон Маск", "Никола Тесла", "Памела Андерсен"},
                {"Илон Маск", "Джеф Безоз", "Памела Андерсен"},
                {"Рата", "Рита", "Мета"},
        };
    }

    private static Integer[] getAnswers() {
        return new Integer[]{2, 0, 1, 2};
    }
}
